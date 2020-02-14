package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Handlers.Input;
import Main.WindowSize;

public class MenuState extends GameState{

	private int selected = 0;
	private String[] options = {
	  "Start",
	  "Help",
	  "Options",
	  "Exit"
	};
	
	private String title;
	private Font titleFont;
	private Color titleColor;
	private Font menuFont;
	private Color menuColor;
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
		
		try {
		  title = "The Dungeon";
		  titleFont = new Font("Times New Roman", Font.PLAIN, 28);
		  titleColor = Color.WHITE;
		  menuFont = new Font("Times New Roman", Font.PLAIN, 12);
		  menuColor = Color.DARK_GRAY;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void init() {
		
	}

	public void update() {
		handleInput();
	}
	
	private void select() {
		switch (selected) {
		case 0:
			gsm.setState(GameStateManager.TOWNSTATE);
			break;
		case 1:
			break;
		case 2: 
			gsm.setState(GameStateManager.OPTIONSSTATE);
			break;
		case 3: 
			System.exit(0);
		}
	}

	public void draw(Graphics2D g) {
		
	  g.setColor(Color.BLACK);
	  g.fillRect(0, 0, WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE);
	
	  g.setColor(titleColor);
	  g.setFont(titleFont);
	  g.drawString(title, 120, 100);
	  
	  g.setFont(menuFont);
	  for(int i=0; i < options.length; i++) {
		  g.setColor(menuColor);
		  if(i == selected) {
			  g.setColor(Color.GREEN);
		  } else {
			  g.setColor(Color.WHITE);
		  }
		  g.drawString(options[i], 180, 140 + i * 15);
	  }
	}

	public void handleInput() {
		if(Input.isPressed(Input.ENTER)) {
			select();
		} else if(Input.isPressed(Input.BUTTONW) || Input.isPressed(Input.BUTTONUP)) {
			if(selected > 0) {
				selected--;
			}
		} else if(Input.isPressed(Input.BUTTONS) || Input.isPressed(Input.BUTTONDOWN)) {
			if(selected < options.length - 1) {
				selected++;
			}
		}
	}

}
