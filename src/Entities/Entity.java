package Entities;

public abstract class Entity {
  
  protected int hp;
  protected int exp;
  protected int level;
  protected int str;
  protected int def;
  protected String name;
  protected int numStats;

  public Entity(int hp, int exp, int level, int str, int def, String name) {
    this.hp = hp;
    this.exp = exp;
    this.level = level;
    this.str = str;
    this.def = def;
    this.name = name;
    this.numStats = 6;
  }
  
  public abstract void setHp(int hp);
  public abstract void setExp(int exp);
  public abstract void setLevel(int level);
  public abstract void setStr(int str);
  public abstract void setDef(int def);
  public abstract void setName(String name);
  
  public int getHp() {
    return this.hp;
  }
  
  public int getExp() {
    return this.exp;
  }
  
  public int getLevel() {
    return this.level;
  }
  
  public int getStr() {
    return this.str;
  }
  
  public int getDef() {
    return this.def;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getNumStats() {
    return this.numStats;
  }
  
}
