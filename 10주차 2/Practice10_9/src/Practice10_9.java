import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Practice10_9 extends JFrame{
	private HashMap<String, String> h = new HashMap<String, String>();
	private JTextField tf1;
	private JTextField tf2;
	private JButton [] btn = new JButton[2];
	private String [] text = { "저장", "찾기" };
	private Color [] color = { Color.YELLOW, Color.GREEN };
	private JLabel label;
	private JTextArea ta;
	public Practice10_9() {
		setTitle("단어 사전 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
				
		tf1 = new JTextField(8);
		tf2 = new JTextField(8);
		ta = new JTextArea(7, 20);
		label = new JLabel(Integer.toString(h.size()));
		
		c.add(new JLabel("영어"));
		c.add(tf1);
		c.add(new JLabel("한글"));
		c.add(tf2);
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(text[i]);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if(b == btn[0] && !tf1.getText().equals("")) {
						if(h.containsKey(tf1.getText())) {
							h.put(tf1.getText(), tf2.getText());
							ta.setText(ta.getText() + "변경 " + "(" + tf1.getText() + ", " + tf2.getText() + ")" + "\n");
						}
						else {
							h.put(tf1.getText(), tf2.getText());
							ta.setText(ta.getText() + "삽입 " + "(" + tf1.getText() + ", " + tf2.getText() + ")" + "\n");
							label.setText(Integer.toString(h.size()));
						}
						tf1.setText("");
						tf2.setText("");
					}
					else {
						Set<String> keys = h.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = h.get(key);
							if(tf1.getText().equals(key)) {
								tf2.setText(value);
							}
						}
					}
				}
			});
		}
		
		c.add(label);
		c.add(new JScrollPane(ta));
		
		setSize(300, 250);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Practice10_9();
	}
}
