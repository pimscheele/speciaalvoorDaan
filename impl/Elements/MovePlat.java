package impl.Elements;


import java.util.ArrayList;

import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

public class MovePlat extends Element implements Collidable, KeyBehavior {

	private int moveUp = 0;
    private int moveDown = 0;
    private boolean start = true;
    private double pos;

    public MovePlat() {
        super("/resources/img/walkplatform.png");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCollision(Collidable arg0) {
		if(start) {
			pos = super.getY();
		}
		if(moveDown <= 240) {
			start = false;
			super.setY(super.getY()+1);
			moveDown += 1;
		} 	
		else
		{
			super.setY(super.getY() - 1);
			moveUp += 1;
			if(super.getY() == pos) {
				moveDown = 0;
			}
		}		
	}
} 