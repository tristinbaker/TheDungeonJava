package Text;

import java.awt.Graphics2D;

public abstract class TownStateText {
  
    public static String townText;
    public static String tavernText;
    public static String cathedralText;
    public static String innText;
  
    TownStateText() {}
    
    public void drawString(Graphics2D g, String text, int x, int y) {
      for(String line : text.split(System.lineSeparator()))
        g.drawString(line, x, y+= g.getFontMetrics().getHeight());
    }
}
