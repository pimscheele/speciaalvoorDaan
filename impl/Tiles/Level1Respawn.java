package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class Level1Respawn extends Tile implements Collidable {
    public Level1Respawn() {
        super("/resources/img/platformFull.png");
    }
    @Override
    public void handleCollision(Collidable collidable){
    }
}

