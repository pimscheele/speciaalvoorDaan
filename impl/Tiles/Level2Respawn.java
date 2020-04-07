package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class Level2Respawn extends Tile implements Collidable {
    public Level2Respawn() {
        super("/resources/img/platformFull.png");
    }
    @Override
    public void handleCollision(Collidable collidable){
    }
}

