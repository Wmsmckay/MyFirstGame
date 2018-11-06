import java.awt.Graphics;
import java.awt.Rectangle;

//bones of every object in the game
public abstract class GameObject {
	
	//location of object
	protected int x, y;
	// speed of the object
	protected float velX = 0, velY = 0;
	protected ID id;
	
	//gameObject constructor
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	

	//this updates the object
	public abstract void tick();
	//this renders the object
	public abstract void render(Graphics g);
	//this gets collision detection for the objects in a rectangle
	public abstract Rectangle getbounds();

	
	//getters and setters for all fields
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getVelX() {
		return velX;
	}

	public void setVelX(float velX) {
		this.velX = velX;
	}

	public float getVelY() {
		return velY;
	}

	public void setVelY(float velY) {
		this.velY = velY;
	}


	public ID getId() {
		return id;
	}


	public void setId(ID id) {
		this.id = id;
	}
}
