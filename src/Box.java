import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
//this is an example class for a box

//this is how to create a box in the game method
/*
	//creates a new box and sets its location on the screen and its ID
	handler.addObject(new Box(100, 100, ID.Block));
*/

public class Box extends GameObject{

	public Box(int x, int y, ID id) {
		super(x, y, id);
		
		//seed of box
		velX = 1;
	
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		
	}

	@Override
	public void render(Graphics g) {
		//set the color of the object here
		g.setColor(Color.blue);
		//set the dimensions of the object here
		g.fillRect(x, y, 32, 32);
	}

	@Override
	public Rectangle getbounds() {
		return null;
	}

}
