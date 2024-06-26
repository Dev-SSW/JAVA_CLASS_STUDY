import java.awt.*;
import javax.swing.*;

public class Ex4_4 extends JFrame {
	public Ex4_4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new GridLayout(1, 10));
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
				Color.CYAN,Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY };
		for(int i = 0; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
            button.setOpaque(true); //배경색이 보이게 설정
            button.setBackground(color[i]); // 각 버튼의 색 설정
            container.add(button); // 컨텐트 팬에 버튼 부착
		}
		setSize(500, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex4_4();
	}
}