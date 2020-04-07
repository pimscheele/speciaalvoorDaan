package impl.Elements;


import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

import java.util.ArrayList;

public class Tutorial5 extends Element implements Collidable, KeyBehavior {

    
    public Tutorial5() {
        super("/resources/Tutorial5.0.jpg");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCollision(Collidable collidable) {
	}
}