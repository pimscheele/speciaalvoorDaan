package impl.Elements;


import java.util.ArrayList;

import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;

public class MovePlatHor extends Element implements Collidable, KeyBehavior {

	private int moveUp = 0;
    private int moveDown = 0;
    private boolean start = true;
    private double pos;

    public MovePlatHor() {
        super("/resources/img/walkplatform.png");
       
    }
	@Override
	public void handleKeyPresses(ArrayList<String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCollision(Collidable arg0) {
		if(start) {
			pos = super.getX();
		}
		if(moveDown <= 240) {
			start = false;
			super.setX(super.getX()+1);
			moveDown += 1;
	} else {
			super.setX(super.getX() - 1);
			moveUp += 1;
			if(super.getX() == pos) {
				moveDown = 0;
			}
	}
		
	}} 