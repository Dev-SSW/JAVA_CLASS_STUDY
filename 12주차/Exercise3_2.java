import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Exercise3_2 extends JFrame{
	
	public Exercise3_2() {
		setTitle("두 이미지 밑으로 나란히");
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
			
			g.drawImage(img1, 0, 0, getWidth(), getHeight()/2, this);
			g.drawImage(img2, 0, getHeight()/2, getWidth(), getHeight()/2, this);
			}
		}
	public static void main(String[] args) {
		new Exercise3_2();
	}
}