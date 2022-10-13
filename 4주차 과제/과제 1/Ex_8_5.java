import java.awt.*;
import javax.swing.*;

public class Ex_8_5 extends JFrame{
		public Ex_8_5() {
			super ("GridLayout 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contentPane = getContentPane ();
			contentPane.setLayout(new GridLayout (1, 10));
			for(int i =0; i <10; i ++) { // 10 개의 버튼 부착
				String text = Integer.toString(i); // i 를 문자열로 변환
				JButton button = new JButton (text);
				contentPane.add(button);
				}
			setSize(500 , 200);
			setVisible(true);
		}
		public static void main(String[] args ) {
			new Ex_8_5();
		}	
}
