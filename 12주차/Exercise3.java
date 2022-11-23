import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Exercise3 extends JFrame{
	
	public Exercise3() {
		setTitle("두 이미지 나란히");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(500, 500);
		setVisible(true);
	}
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image img1 = new ImageIcon("images/image1.PNG").getImage();
			Image img2 = new ImageIcon("images/image2.PNG").getImage();
			
			g.drawImage(img1, 0, 0, getWidth()/2, getHeight(), this);
			g.drawImage(img2, getWidth()/2, 0, getWidth()/2, getHeight(), this);
			}
		}
	public static void main(String[] args) {
		new Exercise3();
	}
}