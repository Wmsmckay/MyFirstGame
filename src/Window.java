import java.awt.Dimension;

import javax.swing.JFrame;

//window that displays the game
public class Window {

	//window constructor 
	public Window( int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title);
		//set window dimensions
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.add(game);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
}
