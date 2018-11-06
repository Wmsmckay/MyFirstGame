import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Box extends GameObject{

	public Box(int x, int y) {
		super(x, y);
		
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
