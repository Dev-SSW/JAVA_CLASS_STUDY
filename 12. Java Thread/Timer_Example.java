import java.awt.*;
import javax.swing.*;
 
public class Exercise12_1 extends JFrame {
    public Exercise12_1() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setBackground(Color.YELLOW);
        
        thread th = new thread();
        th.start();
        
        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    private class thread extends Thread {
        public void run() {
            setTitle("실행 시작");
            try {
                Thread.sleep(10000);
            }
            catch(InterruptedException e) { return; }
            setTitle("실행 종료");
            getContentPane().setBackground(Color.BLUE);
        }
    }
    
    public static void main(String[] args) {
        new Exercise12_1();
    }
}
