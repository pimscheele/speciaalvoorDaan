package impl.Elements;


import java.util.ArrayList;

import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

public class Enemy extends Element implements Collidable, KeyBehavior {

    private boolean leef = true;
    private int move = 0;
    private boolean start = true;
    private double pos;

    public Enemy() {
        super("/resources/slimeball.png");
    }


	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		System.out.println(" ");
	}


	@Override
	public void handleCollision(Collidable arg0) {
		if(start) {
			pos = super.getY();
		}
		if(leef && move <= 94) {
			start = false;
			super.setY(super.getY() + 6);
        	move +=1;
		}
		else {
			super.setY(pos);
			move = 0;
			start = true;
		}
	}}