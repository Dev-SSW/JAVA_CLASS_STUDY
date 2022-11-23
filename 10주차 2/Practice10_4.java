import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Practice10_4 extends JFrame{
	private JCheckBox [] cb = new JCheckBox[2];
	private String [] text = { "버튼 비활성화", "버튼 감추기" };
	private JButton btn = new JButton("test button");

	public Practice10_4() {
		setTitle("CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(text[i]);
			c.add(cb[i]);
			cb[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == cb[0]) {
							btn.setEnabled(false);
						}
						else {
							btn.setVisible(false);
						}
					}
					else {
						if(e.getItem() == cb[0]) {
							btn.setEnabled(true);
						}
						else {
							btn.setVisible(true);
						}
					}
				}
			});
		}
		
		c.add(btn);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Practice10_4();
	}
}