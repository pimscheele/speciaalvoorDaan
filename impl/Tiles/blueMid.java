package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class blueMid extends Tile implements Collidable, Blue{
	public blueMid() {
        super("/resources/img/blueMid.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}