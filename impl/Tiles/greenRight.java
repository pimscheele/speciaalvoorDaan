package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class greenRight extends Tile implements Collidable, Green{
	public greenRight() {
        super("/resources/img/greenRight.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}