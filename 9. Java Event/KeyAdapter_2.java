import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

	public class Ex9_7 extends JFrame {
		private JLabel la = new JLabel("HELLO");
		public Ex9_7() {
			super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			c.setLayout(null);
			c.addKeyListener(new MyKeyListener());
			
			la.setLocation(50,50);
			la.setSize(100,20);
			
			c.add(la);
			
			setSize(200,200);
			setVisible(true);
			
			c.setFocusable(true);
			c.requestFocus();
		}
		class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				int KeyCode = e.getKeyCode();
				switch(KeyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(),la.getY()-10); break;
				
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(),la.getY()+10); break;
			
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-10,la.getY()); break;
		
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+10,la.getY()); break;
				}
			}
		}
		
		public static void main(String [] args) {
			new Ex9_7();
		}
}

