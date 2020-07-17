import javax.swing.JFrame;


public class MovingCircle {
	
	public MovingCircle() {
		// Constructor method always has the same name as the class
		JFrame frame = new JFrame(); //Frame for program
		MyPanel panel = new MyPanel(); // panel that contains graphics
		frame.add(panel); // adding panel to frame
		frame.setVisible(true); // making frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What happens when I close
		frame.setSize(800,800); // making frame 800 x 800
		frame.setTitle("Moving Circle");
		
	}
	public static void main(String[] args) {
		new MovingCircle();
		
	}

}
