import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Practice10_1 extends JFrame{
	private JLabel [] label = new JLabel[4];
	private ImageIcon [] ii = 
	{
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpeg"),
			new ImageIcon("images/mango.jpg"),
			new ImageIcon("images/tiger.jpeg")
	};
	
	public Practice10_1() {
		setTitle("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout());
		
		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel(ii[i]);
			c.add(label[i]);
		}
		
		setSize(500, 180);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Practice10_1();
	}
}