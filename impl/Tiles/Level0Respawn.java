package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class Level0Respawn extends Tile implements Collidable {
    public Level0Respawn() {
        super("/resources/img/platformFull.png");
    }
    @Override
    public void handleCollision(Collidable collidable){
    }
}

