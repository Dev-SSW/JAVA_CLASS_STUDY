import java.awt.*;
import javax.swing.*;
public class Ex4_6 extends JFrame {
	public Ex4_6() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(null);
		for(int i = 0; i < 20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*220)+30;
			int y = (int)(Math.random()*220)+30;
			label.setLocation(x,y);
			label.setSize( 20 , 20);
			label.setForeground(Color.MAGENTA);
			container.add(label);
		}		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4_6();
	}
}