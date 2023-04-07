import javax.swing.*;
import java.awt.*;

public class Ex11_6 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Ex11_6() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.PNG");
		private Image img = icon.getImage(); // 이미지 객체
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}	
	
	public static void main(String[] args) {
		new Ex11_6();
	}
}
