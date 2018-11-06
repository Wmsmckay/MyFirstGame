import java.awt.Graphics;
import java.util.LinkedList;

// handles the game objects
public class Handler {

	//this is a list of all of the objects in the game
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	private boolean up = false, down = false, right = false, left = false;

	public void tick() {
		//runs though all objects and and updates them with tick()
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		//runs though all of the objects and renders them
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		} 
	}
	
	//add objects to the list
	public void addObject(GameObject tempObject) {
		object.add(tempObject);
	}
	//remove objects from the list
	public void removeObject(GameObject tempObject) {
		object.remove(tempObject);
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}
}
