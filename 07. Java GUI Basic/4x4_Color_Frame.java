import java.awt.*;
import javax.swing.*;
public class Ex4_5 extends JFrame {
	public Ex4_5() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();	
		container.setLayout(new GridLayout(4, 4));
		Color [] color = { 
				Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
                Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA };
		for(int i = 0; i < 16; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setOpaque(true);
			label.setBackground(color[i]);
			container.add(label);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4_5();
	}
}
