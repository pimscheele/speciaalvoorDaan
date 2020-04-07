package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class greenLeft extends Tile implements Collidable, Green{
	public greenLeft() {
        super("/resources/img/greenLeft.png");
    }
	@Override
    public void handleCollision(Collidable collidable){
	}
}