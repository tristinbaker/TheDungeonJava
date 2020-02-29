package Maps;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Town {
  
  private String name;
  private String[] options;
  private BufferedImage image;
  
  public Town(String name, String[] options) {
    this.name = name;
    this.options = options;
    try {
      this.image = ImageIO.read(getClass().getResourceAsStream(name));
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  public BufferedImage getImage() {
    return this.image;
  }
  
}
