package GameState;

import java.awt.Graphics2D;

import Maps.Dungeon;

public class DungeonState extends GameState {
  
  private Dungeon dungeon;
  private GameState previousState;

  public DungeonState(GameStateManager gsm) {
    super(gsm);
    
  }

  @Override
  public void init() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void update() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void draw(Graphics2D g) {
    clearScreen(g);
    
  }

  @Override
  public void handleInput() {
    // TODO Auto-generated method stub
    
  }

}
