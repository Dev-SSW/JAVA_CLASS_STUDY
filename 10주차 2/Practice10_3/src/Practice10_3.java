import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Practice10_3 extends JFrame{
	private JRadioButton [] rb = new JRadioButton[2];
	private String [] color = { "Red", "Blue" };

	public Practice10_3() {
		setTitle("Two Radio Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		ButtonGroup bg = new ButtonGroup();
		
		for(int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(color[i]);
			c.add(rb[i]);
			rb[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JRadioButton r = (JRadioButton)e.getSource();
					if(e.getActionCommand() == "Red") {
						c.setBackground(Color.RED);
					}
					else {
						c.setBackground(Color.BLUE);
					}
				}
			});
			bg.add(rb[i]);
		}
		
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Practice10_3();
	}
}