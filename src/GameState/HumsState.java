package GameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Handlers.Input;
import Main.WindowSize;
import Maps.Town;
import Text.HumsStateText;

public class HumsState extends GameState {
	
	private Font optionFont;
	private int selected;
	
	private Color playBoxColor;
	
	private Town town;
	private String[] options = {
	    "Hums",
	    "Enter Tavern",
	    "Rest at Inn",
	    "Visit Cathedral"
	};
	
	private HumsStateText humsText;

	public HumsState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void select() {
	  switch(selected) {
	  case 0: 
	    break;
	  case 1:
	    break;
	  case 2:
	    break;
	  } 
	}
	
	

	@Override
	public void init() {
		
	  playBoxColor = Color.WHITE;

    town = new Town("/DungeonMap/TestTown.png", options);
    
	  optionFont = new Font("Times New Roman", Font.PLAIN, (int) ((0.03 * WindowSize.WIDTH)));
	  
	  selected = 0;
		
	  humsText = new HumsStateText();
	}

	@Override
	public void update() {
		handleInput();
		
	}

	@Override
	public void draw(Graphics2D g) {
		
	  clearScreen(g);
		
    g.setColor(playBoxColor);
		
		drawPlayBox(g);
		drawPlayerBox(g);
		drawTextBox(g);
		drawOptionsBox(g);
		drawPlayerStats(g);
		drawTextBoxText(g);
		
	}

	@Override
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
		if(Input.isPressed(Input.ESCAPE)) {
		  gsm.setState(GameStateManager.OPTIONSSTATE, GameStateManager.TOWNSTATE);
		}
	}
	
	// Private
	
	private void drawPlayBox(Graphics2D g) {
    g.drawRect(WindowSize.PLAYBOX_LOCATION-1, WindowSize.PLAYBOX_LOCATION-1, WindowSize.PLAYBOX_WIDTH+1, WindowSize.PLAYBOX_HEIGHT+1);
    g.drawImage(town.getImage(), WindowSize.PLAYBOX_LOCATION, WindowSize.PLAYBOX_LOCATION, null);
  }
  
  private void drawPlayerBox(Graphics2D g) {
    g.drawRect(WindowSize.PLAYER_LOCATION_X+1, WindowSize.PLAYBOX_LOCATION-1, WindowSize.PLAYER_WIDTH+1, WindowSize.PLAYER_HEIGHT+1);
  }
  
  private void drawTextBox(Graphics2D g) {
    g.drawRect(WindowSize.PLAYBOX_LOCATION-1, WindowSize.TEXTBOX_LOCATION_Y, WindowSize.PLAYBOX_WIDTH+1, WindowSize.TEXTBOX_HEIGHT);
  }
  
  private void drawOptionsBox(Graphics2D g) {
    g.drawRect(WindowSize.PLAYER_LOCATION_X+1, WindowSize.TEXTBOX_LOCATION_Y, WindowSize.PLAYER_WIDTH+1, WindowSize.TEXTBOX_HEIGHT);
    g.setFont(optionFont);
    for(int i = 0; i < options.length; i++) {
      if(i == selected) {
        g.setColor(Color.GREEN);
      } else {
        g.setColor(Color.WHITE);
      }
      g.drawString(options[i], (int) (WindowSize.PLAYER_LOCATION_X + (WindowSize.WIDTH * 0.02)), (int) ((WindowSize.TEXTBOX_LOCATION_Y + (WindowSize.HEIGHT * 0.05)) + i * 15));
    } 
    g.setColor(Color.WHITE);
  }
  
  private void drawTextBoxText(Graphics2D g) {
    switch(selected) {
    case 0: 
      humsText.drawString(g, humsText.townText, WindowSize.PLAYBOX_LOCATION-1 + (int) (WindowSize.WIDTH * 0.01), WindowSize.TEXTBOX_LOCATION_Y + (int) (WindowSize.HEIGHT * 0.05));
      break;
    case 1: 
      break;
    case 2: 
      break;
    default:
      break;
    }
  }
  
  private void drawPlayerStats(Graphics2D g) {
    
    g.drawString("Name: " + gsm.player.getName(), 
        (int) (WindowSize.PLAYER_LOCATION_X + (0.02 * WindowSize.WIDTH)),
        (int) (WindowSize.PLAYBOX_LOCATION + (0.16 * WindowSize.HEIGHT)));
    
    g.drawString("HP: " + Integer.toString(gsm.player.getHp()), 
        (int) (WindowSize.PLAYER_LOCATION_X + (0.02 * WindowSize.WIDTH)),
        (int) (WindowSize.PLAYBOX_LOCATION + (0.22 * WindowSize.HEIGHT)));
    
    g.drawString("Level: " + Integer.toString(gsm.player.getLevel()), 
        (int) (WindowSize.PLAYER_LOCATION_X + (0.02 * WindowSize.WIDTH)),
        (int) (WindowSize.PLAYBOX_LOCATION + (0.28 * WindowSize.HEIGHT)));
    
    g.drawString("Strength: " + Integer.toString(gsm.player.getStr()), 
        (int) (WindowSize.PLAYER_LOCATION_X + (0.02 * WindowSize.WIDTH)),
        (int) (WindowSize.PLAYBOX_LOCATION + (0.34 * WindowSize.HEIGHT)));
    
    g.drawString("Defense: " + Integer.toString(gsm.player.getDef()), 
        (int) (WindowSize.PLAYER_LOCATION_X + (0.02 * WindowSize.WIDTH)),
        (int) (WindowSize.PLAYBOX_LOCATION + (0.40 * WindowSize.HEIGHT)));
  }

}
