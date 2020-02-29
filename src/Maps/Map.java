package Maps;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public abstract class Map {
  
  private BufferedImage image;
  private Map northExit;
  private Map southExit;
  private Map eastExit;
  private Map westExit;
  
  public Map(String s, Map north, Map south, Map east, Map west) {
    try {
      image = ImageIO.read(getClass().getResourceAsStream(s));
    } catch(Exception e) {
      e.printStackTrace();
    }
    northExit = north;
    southExit = south;
    eastExit = east;
    westExit = west;
  }

}
