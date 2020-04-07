package impl.Elements;


import java.util.ArrayList;

import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

public class CollectableRed extends Element implements Collidable, KeyBehavior {

    
    public CollectableRed() {
        super("/resources/RedDiamond.png");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		
	}

	@Override
	public void handleCollision(Collidable collidable) {
		 if(collidable instanceof Fireboy) {
	        	super.setY(0);
	        	super.setX(3120);
	        	Fireboy.CCred += 1;
	        }
		}
}