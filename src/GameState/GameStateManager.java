package GameState;

import java.awt.Graphics2D;

public class GameStateManager {
	
	private int currentState;
	private GameState[] gameStates;
	
	public static final int MENUSTATE     = 0;
	public static final int TOWNSTATE     = 1;
	public static final int OPTIONSSTATE  = 2;
	
	public GameStateManager() {
		init_states();
	}
	
	private void init_states() {
	  gameStates = new GameState[13];
		
      currentState = MENUSTATE;
	  gameStates[MENUSTATE] = new MenuState(this);
	  gameStates[TOWNSTATE] = new TownState(this);
	  gameStates[OPTIONSSTATE] = new OptionsState(this);
	}
	
	public void update() {
		gameStates[currentState].update();
	}
	
	public void draw(Graphics2D g) {
		gameStates[currentState].draw(g);
	}

	public void setState(int state) {
		currentState = state;
		gameStates[currentState].init();
	}
}
