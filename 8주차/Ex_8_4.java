import javax.swing.*;
import java.awt.*;
public class Ex_8_4 extends JFrame{
	public Ex_8_4() {
		setTitle ("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane ();
		contentPane.setLayout(new BorderLayout(30, 20));
		contentPane.add(new JButton ("Calculate"), BorderLayout.CENTER);
		contentPane.add(new JButton ("add"), BorderLayout.NORTH);
		contentPane.add(new JButton ("sub"), BorderLayout.SOUTH);
		contentPane.add(new JButton ("mul"), BorderLayout.EAST);
		contentPane.add(new JButton ("div"), BorderLayout.WEST);
		setSize(300 , 200); // 프레임 크기 300x200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	public static void main(String[] args ) {
		new Ex_8_4();
	}
}