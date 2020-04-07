package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class platformRight extends Tile implements Collidable{
	public platformRight() {
        super("/resources/img/platformRight.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
		
	}

}
