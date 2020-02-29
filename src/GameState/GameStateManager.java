package GameState;

import java.awt.Graphics2D;

import Entities.Player;

public class GameStateManager {
	
	private static int currentState;
	private static int previousState;
	private GameState[] gameStates;
	
	public static final int MENUSTATE     = 0;
	public static final int TOWNSTATE     = 1;
	public static final int OPTIONSSTATE  = 2;
	
	public static Player player;
	
	public GameStateManager() {
		init_states();
		init_player();
	}
	
	private void init_states() {
	  gameStates = new GameState[13];
		
    currentState = MENUSTATE;
	  gameStates[MENUSTATE] = new MenuState(this);
	  gameStates[TOWNSTATE] = new HumsState(this);
	  gameStates[OPTIONSSTATE] = new OptionsState(this);
	}
	
	private void init_player() {
	  player = new Player(100, 0, 5, 10, 8, "Tristin");
	}
	
	public void update() {
		gameStates[currentState].update();
	}
	
	public void draw(Graphics2D g) {
		gameStates[currentState].draw(g);
	}

	public void setState(int nextState, int previousState) {
		currentState = nextState;
		this.previousState = previousState;
		gameStates[currentState].init();
	}
	
	public static int getPreviousState() {
	  return previousState;
	};
	
	public static int getCurrentState() {
	  return currentState;
	}
}
