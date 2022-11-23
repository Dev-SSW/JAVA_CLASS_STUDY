import javax.swing.*;
import java.awt.*;
public class Ex11_3 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Ex11_3() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 150);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); // 빨간색 선택
			g.drawLine(20, 20, 100, 100); // 선그리기
		}
	}	
	
	public static void main(String[] args) {
		new Ex11_3();
	}
}