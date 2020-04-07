package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class redMid extends Tile implements Collidable, Red{
	public redMid() {
        super("/resources/img/redMid.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}