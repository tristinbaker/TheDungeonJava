package Handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputProcessor implements KeyListener{

	public boolean keyDown(int k) {
		if(k == KeyEvent.VK_SPACE) {
			Input.setKey(Input.SPACE, true);
		}
		if(k == KeyEvent.VK_W) {
			Input.setKey(Input.BUTTONW, true);
		}
		if(k == KeyEvent.VK_A) {
			Input.setKey(Input.BUTTONA, true);
		}
		if(k == KeyEvent.VK_S) {
			Input.setKey(Input.BUTTONS, true);
		}
		if(k == KeyEvent.VK_D) {
			Input.setKey(Input.BUTTOND, true);
		}
		if(k == KeyEvent.VK_ENTER) {
			Input.setKey(Input.ENTER, true);
		}
		if(k == KeyEvent.VK_UP) {
			Input.setKey(Input.BUTTONUP, true);
		}
		if(k == KeyEvent.VK_DOWN) {
			Input.setKey(Input.BUTTONDOWN, true);
		}
		if(k == KeyEvent.VK_LEFT) {
			Input.setKey(Input.BUTTONLEFT, true);
		}
		if(k == KeyEvent.VK_RIGHT) {
			Input.setKey(Input.BUTTONRIGHT, true);
		}
		if(k == KeyEvent.VK_J) {
			Input.setKey(Input.SHIFT, true);
		}
		if(k == KeyEvent.VK_SHIFT) {
			Input.setKey(Input.SHIFT, true);
		}
		if(k == KeyEvent.VK_ESCAPE) {
		  Input.setKey(Input.ESCAPE, true);
		}
		System.out.println("Here");
		return true;
	}
		
	public boolean keyUp(int k) {
		if(k == KeyEvent.VK_SPACE) {
			Input.setKey(Input.SPACE, false);
		}
		if(k == KeyEvent.VK_W) {
			Input.setKey(Input.BUTTONW, false);
		}
		if(k == KeyEvent.VK_A) {
			Input.setKey(Input.BUTTONA, false);
		}
		if(k == KeyEvent.VK_S) {
			Input.setKey(Input.BUTTONS, false);
		}
		if(k == KeyEvent.VK_D) {
			Input.setKey(Input.BUTTOND, false);
		}
		if(k == KeyEvent.VK_ENTER) {
			Input.setKey(Input.ENTER, false);
		}
		if(k == KeyEvent.VK_UP) {
			Input.setKey(Input.BUTTONUP, false);
		}
		if(k == KeyEvent.VK_DOWN) {
			Input.setKey(Input.BUTTONDOWN, false);
		}
		if(k == KeyEvent.VK_LEFT) {
			Input.setKey(Input.BUTTONLEFT, false);
		}
		if(k == KeyEvent.VK_RIGHT) {
			Input.setKey(Input.BUTTONRIGHT, false);
		}
		if(k == KeyEvent.VK_J) {
			Input.setKey(Input.SHIFT, false);
		}
		if(k == KeyEvent.VK_SHIFT) {
			Input.setKey(Input.SHIFT, false);
		}
		if(k == KeyEvent.VK_ESCAPE) {
      Input.setKey(Input.ESCAPE, false);
    }
		return true;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
