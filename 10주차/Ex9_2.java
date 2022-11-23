import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Ex9_2 extends JFrame {
	public Ex9_2() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(200, 120);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			Ex9_2.this.setTitle(b.getText()); 
			}
	}
	public static void main(String [] args) {
		new Ex9_2();
	}
}