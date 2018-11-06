import java.awt.Graphics;
import java.util.LinkedList;

// handles the game objects
public class Handler {

	//this is a list of all of the objects in the game
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
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
}
