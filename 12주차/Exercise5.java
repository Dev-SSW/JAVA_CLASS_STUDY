import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Exercise5 extends JFrame{
	
	public Exercise5() {
		setTitle("마우스로 폐다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	private class MyPanel extends JPanel {
		private Vector<Point> v = new Vector<Point>();
		
		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point p = e.getPoint();
					v.add(p);
					
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.MAGENTA);
			
			for(int i = 0; i < v.size(); i++) {
				if(i == 0) {
					g.drawLine(v.elementAt(0).x, v.elementAt(0).y, v.lastElement().x, v.lastElement().y);
				}
			}
			for(int i = 0; i < v.size() - 1; i++) {
				g.drawLine(v.elementAt(i).x, v.elementAt(i).y, v.elementAt(i+1).x, v.elementAt(i+1).y);
			}
		}
	}
	public static void main(String[] args) {
		new Exercise5();
	}
}
