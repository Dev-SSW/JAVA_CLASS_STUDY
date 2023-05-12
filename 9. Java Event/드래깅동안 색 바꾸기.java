import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Task2_3 extends JFrame {
	public Task2_3() {
		setTitle("드래깅동안 색 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setBackground(Color.GREEN);
		
		c.addMouseListener(new MouseListener(){
			public void mouseReleased(MouseEvent e) { 
				c.setBackground(Color.GREEN);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
		});
		c.addMouseMotionListener(new MouseMotionListener() {;
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			public void mouseMoved(MouseEvent e) {
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Task2_3();
	}
}
