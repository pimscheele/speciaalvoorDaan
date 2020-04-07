package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class redLeft extends Tile implements Collidable, Red{
	public redLeft() {
        super("/resources/img/redLeft.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}