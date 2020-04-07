package impl.Elements;


import java.util.ArrayList;

import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

public class CollectableBlue extends Element implements Collidable, KeyBehavior {

    
    public CollectableBlue() {
        super("/resources/BlueDiamond.png");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		
	}

	@Override
	public void handleCollision(Collidable collidable) {
		 if(collidable instanceof Watergirl) {
	        	super.setY(0);
	        	super.setX(3120);
	        	Watergirl.CCblue += 1;
	        }
		}
}