import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable {
	Thread th; // 진동하는 스레드
	public VibratingFrame() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200);
		setLocation(300,300); // 프레임의 위치를 스크린의 (300,300)에 설정
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive()) return; // 이미 스레드가 종료했다면 그냥 리턴
				th.interrupt(); // 진동 스레드에게 InterruptedException 보냄
			}
		});
		
		th = new Thread(this); // 진동하는 스레드 객체 생성
		th.start(); // 진동 시작
	}

	public void run() { // 20ms마다 프레임의 위치를 랜덤하게 이동
		Random r = new Random();
		while(true) {
			try {
				Thread.sleep(20); // 20ms 잠자기
			}
			catch(InterruptedException e){
				return; // 리턴하면 스레드 종료
			}
			int x = getX() + r.nextInt()%5; // 새 위치 x
			int y = getY() + r.nextInt()%5; // 새 위치 y 
//System.out.println(r.nextInt());
			System.out.println(r.nextInt(5));    // 0~4 정수값 발생, 음수값을 받을 수 없어 vibration에서는 사용 불가.


			setLocation(x, y); // 프레임의 위치 이동
		}
	}

	public static void main(String [] args) {
		new VibratingFrame();
	}
} 