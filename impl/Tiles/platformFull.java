package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class platformFull extends Tile implements Collidable{
	public platformFull() {
        super("/resources/img/platformFull.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
		
	}
}