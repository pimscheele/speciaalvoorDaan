package impl.Elements;


import java.util.ArrayList;

import behavior.behaviors.Collidable;
import behavior.behaviors.KeyBehavior;
import game.Element;
import impl.Tiles.BlockTile;
import impl.Tiles.Blue;
import impl.Tiles.Green;
import impl.Tiles.Level0Respawn;
import impl.Tiles.Level1Respawn;
import impl.Tiles.Level2Respawn;
import impl.Tiles.Red;
import impl.Tiles.platformFull;
import impl.Tiles.platformLeft;
import impl.Tiles.platformRight;
import javafx.scene.image.Image;

public class Fireboy extends Element implements Collidable, KeyBehavior {

    private double deltaY;
    private double deltaX;
    private boolean canJump;
    private int jumpmeter;
    private boolean falling = true;
    public static int CCred = 0;	//Collectable Counter

    public Fireboy() {
        super("/resources/fireboy.png");
        this.deltaY = 0;
        this.deltaX = 0;
        this.canJump = true;
        this.jumpmeter = 0;
    }


    @Override
    public void handleKeyPresses(ArrayList<String> arrayList) {
    	this.deltaX = 0;
    	
    	if(falling) {
    		this.deltaY = 7;
    	}
    	
        super.setY(super.getY() + deltaY);
        
        if(arrayList.contains("UP") && canJump) {
        	if(canJump) {
        		super.setY(super.getY() - 14);
        		this.deltaY = -14;
        		canJump = false;
        		jumpmeter += 1;
        	}
        }
        if(jumpmeter <=30 && canJump == false) {
        	super.setY(super.getY() - 14);
        	this.deltaY = -14;
        	jumpmeter +=1;
        }
        if (arrayList.contains("RIGHT")) {
        	this.setImage(new Image("resources/fireboyRight.png"));
            super.setX(super.getX()+10);
            this.deltaX = 10;
        }
        if (arrayList.contains("LEFT")) {
        	this.setImage(new Image("resources/fireboyLeft.png"));
            super.setX(super.getX()-10);
            this.deltaX = -10;
        }
        if(arrayList.isEmpty()) {
        	this.setImage(new Image("resources/fireboy.png"));
        }
        
    }

    @Override
    public void handleCollision(Collidable collidable) {
    	if(collidable instanceof BlockTile ) {
        	super.setY(super.getY() - deltaY);
        }
        if(collidable instanceof platformFull) {
            super.setX(super.getX() - deltaX);
        }
        if(collidable instanceof platformLeft || collidable instanceof platformRight) {
        	super.setY(super.getY() - deltaY);
        	canJump = true;
        	jumpmeter = 0;
        }
        if(collidable instanceof Blue) {
        	System.out.println("you died");
        	super.setY(0);
            super.setX(0);
        }
        if(collidable instanceof Green) {
        	System.out.println("you died");
        	super.setY(0);
            super.setX(0);
        }
        if(collidable instanceof Red) {
        	super.setY(super.getY() - deltaY);
        	canJump = true;
        	jumpmeter = 0;
        }
        if(collidable instanceof Enemy) {
        	System.out.println("you died");
        	super.setY(0);
            super.setX(0);
        }
        if(collidable instanceof MovePlat) {
        	super.setY(super.getY() - (deltaY + 4));
        	canJump = true;
        	jumpmeter = 0;
        }
        if(collidable instanceof MovePlatHor) {
        	super.setY(super.getY() - (deltaY + 2));
        	canJump = true;
        	jumpmeter = 0;
        }
        if(collidable instanceof Level0Respawn) {
        	super.setY(2960);
        	super.setX(240);
        }
        if(collidable instanceof Level1Respawn) {
        	super.setY(2400);
        	super.setX(2880);
        }
        if(collidable instanceof Level2Respawn) {
        	super.setY(2850);
        	super.setX(150);
        }
    }
        
       
    public double getDeltaY() {
        return deltaY;
    }
    public void setDeltaY(double deltaY) {
        this.deltaY = deltaY;
    }
    public double getDeltaX() {
        return deltaX;
    }
    public void setDeltaX(double deltaX) {
        this.deltaX = deltaX;
    }
}