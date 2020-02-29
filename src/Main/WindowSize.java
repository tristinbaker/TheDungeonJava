package Main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class WindowSize {
	
	public static int WIDTH = 400;
	public static int HEIGHT = 300;
	public static int SCALE = 2;
	
	public static final int PLAYBOX_HEIGHT = (int) (0.6 * WindowSize.HEIGHT);
  public static final int PLAYBOX_WIDTH = (int) (0.7 * WindowSize.WIDTH);
  public static final int PLAYBOX_LOCATION = (int) (0.01 * WindowSize.WIDTH);
  
  public static final int PLAYER_HEIGHT = (int) (0.6 * WindowSize.HEIGHT);
  public static final int PLAYER_WIDTH = (int) (0.2 * WindowSize.WIDTH);
  public static final int PLAYER_LOCATION_X = (int) (0.05 * WindowSize.WIDTH) + PLAYBOX_WIDTH;
  
  public static final int TEXTBOX_HEIGHT = (int) (0.25 * WindowSize.HEIGHT);
  public static final int TEXTBOX_LOCATION_Y = (int) (0.05 * WindowSize.HEIGHT) + PLAYBOX_HEIGHT;
  
	
	private static Dimension currentDimension;
	
	public static void resizeWindow(JPanel panel)  {
	  currentDimension = new Dimension(WindowSize.WIDTH * WindowSize.SCALE, WindowSize.HEIGHT * WindowSize.SCALE);
    panel.setSize(currentDimension);
    JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(panel);
    parent.setSize(currentDimension);
	}
	
}
