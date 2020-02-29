package GameState;

import java.awt.Color;
import java.awt.Graphics2D;

import Handlers.Input;
import Main.WindowSize;

public class OptionsState extends GameState {

	private Color optionColor;
	
	public OptionsState(GameStateManager gsm) {
		super(gsm);
		
		optionColor = Color.WHITE;
	}

	private void accept() {
		gsm.setState(GameStateManager.getPreviousState(), GameStateManager.getCurrentState());
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
	  
	}

	@Override
	public void update() {
		handleInput();	
	}

	public void draw(Graphics2D g) {
		
		clearScreen(g);
		
		g.setColor(optionColor);
		g.drawString("Change Scale (Left/Right): " + WindowSize.SCALE, (int)(WindowSize.WIDTH * 0.3), (int)(WindowSize.HEIGHT * 0.4));
		g.drawString("Accept and Return (Enter)", (int)(WindowSize.WIDTH * 0.3), (int)(WindowSize.HEIGHT * 0.5));
		
	}

	@Override
	public void handleInput() {
		if(Input.isPressed(Input.BUTTONRIGHT)) {
			if(WindowSize.SCALE < 5) {
				WindowSize.SCALE += 1;
			}
		} else if(Input.isPressed(Input.BUTTONLEFT) ) {
			if(WindowSize.SCALE > 2) {
				WindowSize.SCALE -= 1;
			}
		} else if(Input.isPressed(Input.ENTER) || Input.isPressed(Input.ESCAPE)) {
			accept();
		} 
	}

}
