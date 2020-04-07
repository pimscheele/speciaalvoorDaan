package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class greenMid extends Tile implements Collidable, Green{
	public greenMid() {
        super("/resources/img/greenMid.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}