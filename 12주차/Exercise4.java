import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise4 extends JFrame{
	
	public Exercise4() {
		setTitle("이미지 위에 원 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(new MyPanel());
		
		setSize(400, 400);
		setVisible(true);
	}
	private class MyPanel extends JPanel {
		private Point p = null;
		public MyPanel() {
			addMouseMotionListener(new MouseMotionListener() {
				public void mouseDragged(MouseEvent e) {
					p = e.getPoint();
					repaint();
				}
				public void mouseMoved(MouseEvent e) {}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image img = new ImageIcon("images/image2.PNG").getImage();
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			g.setColor(Color.GREEN);
			
			if(p == null) return;
			g.fillOval(p.x-10, p.y-10, 20, 20);
			
		}
	}
	public static void main(String[] args) {
		new Exercise4();
	}
}