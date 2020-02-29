package GameState;

import java.awt.Color;
import java.awt.Graphics2D;

import Main.WindowSize;

public abstract class GameState {
	
	protected GameStateManager gsm;
	
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
	}
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(Graphics2D g);
	public abstract void handleInput();
	
	public void clearScreen(Graphics2D g) {
	  g.setColor(Color.BLACK);
    g.fillRect(0, 0, WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE);
	}

}
