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
		gsm.setState(GameStateManager.MENUSTATE);
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
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE);
		
		g.setColor(optionColor);
		g.drawString("Change Scale (Left/Right): " + WindowSize.SCALE, (int)(WindowSize.WIDTH * 0.3), (int)(WindowSize.HEIGHT * 0.4));
		g.drawString("Accept and Return (Enter)", (int)(WindowSize.WIDTH * 0.3), (int)(WindowSize.HEIGHT * 0.5));
		
	}

	@Override
	public void handleInput() {
		System.out.println(WindowSize.SCALE);
		if(Input.isPressed(Input.BUTTONRIGHT)) {
			if(WindowSize.SCALE < 5) {
				WindowSize.SCALE += 1;
			}
		} else if(Input.isPressed(Input.BUTTONLEFT) ) {
			if(WindowSize.SCALE > 1) {
				WindowSize.SCALE -= 1;
			}
		} else if(Input.isPressed(Input.ENTER)) {
			accept();
		}
	}

}
