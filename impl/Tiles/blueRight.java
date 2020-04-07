package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class blueRight extends Tile implements Collidable, Blue{
	public blueRight() {
        super("/resources/img/blueRight.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}