package impl.Elements;

import behavior.behaviors.Collidable;
import game.Element;

public class redDoor extends Element implements Collidable{
	public redDoor() {
		super("/resources/img/blueDoor.jpg");
		super.setY(240);
        super.setX(2800);
	}
	
    @Override
    public void handleCollision(Collidable collidable){
    }
}
