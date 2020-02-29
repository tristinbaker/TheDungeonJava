package Handlers;

public class Input {

	//current key state
	public static boolean [] keys;
	//previous key state
	public static boolean [] pkeys;
		
	//number of buttons in the game
	public static final int NUM_KEYS = 13;
	public static final int SPACE = 0; 		//space
	public static final int BUTTONW = 1; 		//W
	public static final int BUTTONA = 2; 		//A
	public static final int BUTTONS = 3; 		//S
	public static final int BUTTOND = 4;	    //D
	public static final int ENTER = 5;	    //Enter
	public static final int BUTTONUP = 6;        //Up
	public static final int BUTTONDOWN = 7;        //Down
	public static final int BUTTONLEFT = 8;        //Left
	public static final int BUTTONRIGHT = 9;  		//Right
	public static final int SHIFT = 10; 	    //Shift
	public static final int ESCAPE = 11;
	public static final int BUTTONDEFAULT = 12; //No button pressed
		
	static {
		keys = new boolean[NUM_KEYS];
		pkeys = new boolean[NUM_KEYS];
	}
		
	public static void update() {
		for(int i = 0; i < NUM_KEYS; i++) {
			pkeys[i] = keys[i];
		}
	}
		
	//returns which current key is down
	public static boolean isDown(int i) {
		return keys[i];
	}
		
	//returns whether or not the key was pressed
	public static boolean isPressed(int i) {
		return keys[i] && !pkeys[i];
	}
		
	public static void setKey(int i, boolean b) {
		keys[i] = b;
	}
	
	//converts java key codes to myinput keycodes
	public static int convertKeyCode(int i) {
		switch(i) {
		case 10:    //enter
			i = 5;
			break;
		case 87:    //w
			i = 1;
			break;
		case 83:    //s
			i = 3;
			break;
		case 65:    //a
			i = 2;
			break;
		case 68:    //d
			i = 4;
			break;
		case 32:    //space
			i = 0;
			break;
		case 38:    //up
			i = 6;
			break;
		case 40:    //down
			i = 7;
			break;
		case 37:    //left
			i = 8;
			break;
		case 39:    //right
			i = 9;
			break;
		case 16:
			i = 10; //shift
			break;
		case 27:
		  i = 11;
		  break;
		default:
			i = 12; //no set button pressed
			break;
		} 
		return i;
	}
}