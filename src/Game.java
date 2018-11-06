import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

//main class where the game loops lives
public class Game extends Canvas implements Runnable{

	//serial ID
	private static final long serialVersionUID = 1L;

	private boolean isRunning = false;
	private Thread thread;
	private Handler handler;
	
	//game constructor
	public Game() {
		//This is the size and name of the window
		new Window(1000, 563, "Dungeon Crawler", this);
		start();
		
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));
		
		handler.addObject(new Wizard(100, 100, ID.Player, handler));

		
	}
	
	//this starts the thread
	private void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	//this stops the thread
	private void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//game loops goes through here
	public void run() {
		//Notch's game loop
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (isRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				tick();
				//updates++;
				delta--;	
			}
			render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				frames = 0;
				//updates = 0;
			}
		}
		stop();
	}
	//updates everything in the game
	public void tick() {
		handler.tick();
	}
	//renders everything in the game
	public void render() {
		//this counts how many frames are pre-loaded in advance
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			//change this to increase loaded frames
			this.createBufferStrategy(3);
			return; 
		}
		
		Graphics g = bs.getDrawGraphics();
		//////////////////////////////////
		//this is where you can draw game things
		
		g.setColor(Color.red);
		g.fillRect(0, 0, 1000, 563);
		
		handler.render(g);
		
		//////////////////////////////////
		g.dispose();
		bs.show();
		
	}
	public static void main (String args[]) {
		new Game();
	}
}
