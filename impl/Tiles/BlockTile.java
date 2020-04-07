package impl.Tiles;

import behavior.behaviors.Collidable;
import game.Tile;

public class BlockTile extends Tile implements Collidable{
		public BlockTile() {
			super("/resources/img/platformFull.png");
		}
		@Override
		public void handleCollision(Collidable collidable) {
			
		}
	}