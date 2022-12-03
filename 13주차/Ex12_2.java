import java.awt.*;
import javax.swing.*;

public class Ex12_2 extends JFrame{
	public Ex12_2() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		class TimerThread extends Thread {
			private JLabel timerLabel;
			
			public TimerThread(JLabel timerLabel) {
				this.timerLabel = timerLabel;
			}
			@Override
			public void run() {
				int n=0;
				while(true) {
					timerLabel.setText(Integer.toString(n));
					n++;
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						return;
					}
				}
			}
		}
		TimerThread th = new TimerThread(timerLabel);
		setSize(250,150);
		setVisible(true);
		th.start();
		
	}
	public static void main(String[] args) {
		new Ex12_2();
	}
}