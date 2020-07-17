import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements KeyListener, ActionListener{
	Timer t = new Timer(5,this);
	double x = 0, y = 0, chX = 0, chY = 0;
	BeachBall myBall;
	
	public MyPanel() {
		// Constructor method, gives the initial conditions
		myBall = new BeachBall();
		t.start();
		addKeyListener(this); // be on the lookout for key presses from this class
		setFocusable(true); // make the key presses happen on this class
		setFocusTraversalKeysEnabled(false); // makes some keys act differently
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(myBall.getBall(), (int) x, (int) y, null);
		g2.fill(new Rectangle2D.Double(400,400,100,100));
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		x += chX;
		y += chY;
		if (x >400) {
			x = 0;
		}
	}
	
	public void up() {
		chX = 0;
		chY = -1.5;
	}
	public void down() {
		chX = 0;
		chY = 1.5;
	}
	public void left() {
		chX = -1.5;
		chY = 0;
	}
	public void right() {
		chX = 1.5;
		chY = 0;
	}
	public void stop() {
		chX = 0;
		chY = 0;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			up();
		}
		if (code == KeyEvent.VK_DOWN) {
			down();
		}
		if (code == KeyEvent.VK_LEFT) {
			left();
		}
		if (code == KeyEvent.VK_RIGHT) {
			right();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		stop();
	}


}
