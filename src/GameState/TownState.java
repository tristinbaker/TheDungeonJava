package GameState;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Main.WindowSize;

public class TownState extends GameState {
	
	private static final int RECT_HEIGHT = (int) (0.6 * WindowSize.HEIGHT);
	private static final int RECT_WIDTH = (int) (0.7 * WindowSize.WIDTH);
	private static final int RECT_LOCATION = (int) (0.01 * WindowSize.WIDTH);
	
	private Color playBoxColor;
	
	private JPanel playBox;

	public TownState(GameStateManager gsm) {
		super(gsm);
		
		playBoxColor = Color.WHITE;
		playBox = new JPanel();
		
	}

	@Override
	public void init() {
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE);
		
		g.setColor(playBoxColor);
		g.drawRect(RECT_LOCATION, RECT_LOCATION, RECT_WIDTH, RECT_HEIGHT);
		
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

}
