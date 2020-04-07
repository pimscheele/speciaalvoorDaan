package impl.Elements;


import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

import java.util.ArrayList;

public class Tutorial3 extends Element implements Collidable, KeyBehavior {

    
    public Tutorial3() {
        super("/resources/Tutorial3.0.jpeg");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCollision(Collidable collidable) {
	}
}