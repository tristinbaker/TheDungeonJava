package Entities;

import java.awt.Graphics2D;

public class Player extends Entity {
  
  public Player(int hp, int exp, int level, int str, int def, String name) {
   super(hp, exp, level, str, def, name);
  }

  @Override
  public void setHp(int hp) {
    this.hp = hp;
    
  }

  @Override
  public void setExp(int exp) {
    this.exp = exp;
    
  }

  @Override
  public void setLevel(int level) {
    this.level = level;
    
  }

  @Override
  public void setStr(int str) {
    this.str = str;
    
  }

  @Override
  public void setDef(int def) {
    this.def = def;
    
  }

  @Override
  public void setName(String name) {
    this.name = name;
    
  }
  
  public static void drawPlayer(Graphics2D g) {
    
  }
  
  
  
}
