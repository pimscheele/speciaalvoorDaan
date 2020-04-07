package impl.Elements;


import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

import java.util.ArrayList;

public class Tutorial2 extends Element implements Collidable, KeyBehavior {

    
    public Tutorial2() {
        super("/resources/Tutorial2.0.jpeg");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCollision(Collidable collidable) {
	}
}
