package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class platformLeft extends Tile implements Collidable{
	public platformLeft() {
        super("/resources/img/platformLeft.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
		
	}

}
