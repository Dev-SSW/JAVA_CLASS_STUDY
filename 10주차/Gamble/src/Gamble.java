import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gamble extends JFrame{
	JLabel one,two,three,la;
	public Gamble(){
		setTitle("Open Challenge 9"); // 제목 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		
		setLayout(null); // 배치관리자 없음
		addKeyListener(new MyKeyAdapter());
		
		one = new JLabel("0",SwingConstants.CENTER);
		two = new JLabel("0",SwingConstants.CENTER);
		three = new JLabel("0",SwingConstants.CENTER);
		
		la = new JLabel("시작합니다.");
		
		one.setBackground(Color.MAGENTA);
		one.setFont(new Font("Arial",Font.PLAIN,30));
		one.setForeground(Color.YELLOW);
		one.setSize(100,50);
		one.setLocation(40,80);
		one.setOpaque(true);
		
		two.setBackground(Color.MAGENTA);
		two.setFont(new Font("Arial",Font.PLAIN,30));
		two.setForeground(Color.YELLOW);
		two.setSize(100,50);
		two.setLocation(180,80);
		two.setOpaque(true);
		
		three.setBackground(Color.MAGENTA);
		three.setFont(new Font("Arial",Font.PLAIN,30));
		three.setForeground(Color.YELLOW);
		three.setSize(100,50);
		three.setLocation(320,80);
		three.setOpaque(true);
		
		la.setSize(300,50);
		la.setLocation(80,150);
		
		
		add(one);
		add(two);
		add(three);
		add(la);
		
		setVisible(true);
		requestFocus();
	
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {
				one.setText((int)(Math.random()*5)+"");
				two.setText((int)(Math.random()*5)+"");
				three.setText((int)(Math.random()*5)+"");
				if(one.getText().equals(two.getText())) {
					if(two.getText().equals(three.getText()))
						la.setText("축하합니다.");
					else
						la.setText("아쉽군요");
				}
				else
					la.setText("아쉽군요");
			}
		}
	}
	public static void main(String[] args) {
		new Gamble();
	}
}