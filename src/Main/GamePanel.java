package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import GameState.GameStateManager;
import Handlers.Input;

public class GamePanel extends JPanel implements Runnable, KeyListener {
	
	private static final long serialVersionUID = 1L;
	
	private Thread thread;
	private boolean isRunning = false;
	
	private GameStateManager gsm;
	
	private Graphics2D g;
	private BufferedImage image;
	
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE));
		setFocusable(true);
		requestFocus(true);
	}
	
	public void addNotify() {
		super.addNotify();
		if(thread == null) {
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
	private void init() {
		isRunning = true;
		image = new BufferedImage(WindowSize.WIDTH, WindowSize.HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		gsm = new GameStateManager();
	}
	
	private void update() {
		gsm.update();
		Input.update();
		
		WindowSize.resizeWindow(this);
	}
	
	private void draw() {
		gsm.draw(g);
	}
	
	private void drawToScreen() {
		Graphics g2 = getGraphics();
		g2.drawImage(image,  0,  0,  WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE, null);
		g2.dispose();
	}
	
	public void run() {
		init();
		
		while(isRunning) {
			update();
			draw();
			drawToScreen();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int i = e.getKeyCode();
		i = Input.convertKeyCode(i);
		Input.setKey(i, true);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int i = e.getKeyCode();
		i = Input.convertKeyCode(i);
		Input.setKey(i, false);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
