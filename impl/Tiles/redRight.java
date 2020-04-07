package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class redRight extends Tile implements Collidable, Red{
	public redRight() {
        super("/resources/img/redRight.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}