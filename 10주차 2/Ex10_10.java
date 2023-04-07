import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_10 extends JFrame {
	private String [] fruits = {"apple", "banana", "mango"};
	private ImageIcon [] images = { new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpeg"),
			new ImageIcon("images/mango.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);
	
	
	public Ex10_10() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> Combo = new JComboBox<String>(fruits);
		c.add(Combo);
		c.add(imgLabel);
		
		Combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Ex10_10();
	}
}