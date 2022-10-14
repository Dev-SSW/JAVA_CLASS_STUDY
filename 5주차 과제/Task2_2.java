import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Task2_2 extends JFrame {
	public Task2_2() {
		setTitle("키 누르기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container c = getContentPane();
		c.setBackground(Color.CYAN);
		c.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'R') {
					c.setBackground(Color.RED);
				}
			}
			public void keyReleased(KeyEvent e) {
				c.setBackground(Color.CYAN);
			}
			public void keyTyped(KeyEvent e) {}
		});
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Task2_2();
	}
}