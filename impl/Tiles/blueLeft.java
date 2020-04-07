package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class blueLeft extends Tile implements Collidable, Blue{
	public blueLeft() {
        super("/resources/img/blueLeft.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}