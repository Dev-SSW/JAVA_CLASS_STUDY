import javax.swing.*;
import java.awt.*;

public class Exercise1_4 extends JFrame{
	
	public Exercise1_4() {
		setTitle("격자");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int x = 0;
			int y = 0;
			for(int i = 0; i < 9; i++) {
				g.drawLine(getWidth()/10 + x, 0, getWidth()/10 + x, getHeight());
				g.drawLine(0, getHeight()/10 + y, getWidth(), getHeight()/10 + y);
				x += getWidth()/10;
				y += getHeight()/10;
			}
		}
	}
	public static void main(String[] args) {
		new Exercise1_4();
	}
}