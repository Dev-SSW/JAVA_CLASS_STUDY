import javax.swing.*;
import java.awt.*;
public class Ex_8_6 extends JFrame{
	public Ex_8_6() {
	setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = getContentPane();
	contentPane.setLayout(null); 
	JLabel la = new JLabel ("Hello, Press Buttons!");
	la.setLocation(130 , 50); 
	la.setSize(200 , 20); 
	contentPane.add(la); 
	for(int i=1; i<=9; i++) {
		JButton b = new JButton (Integer.toString (i)); // 버튼 생성
		b.setLocation (i *15 , i *15); // 버튼의 위치 설정
		b.setSize (50 , 20); // 버튼의 크기는 동일하게 50x20
		contentPane.add(b ); // 버튼을 컨텐트팬에 부착
	}
	setSize(300 ,200 );
	setVisible(true);
}
	public static void main(String[] args ) {
		new Ex_8_6();
	}
}