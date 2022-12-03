import java.awt.*;
import javax.swing.*;
 
public class Exercise12_2 extends JFrame {
    public Exercise12_2() {
        setTitle("원을 0.5초 간격으로 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(new MyPanel());
        thread th = new thread();
        th.start();
        
        setSize(300, 300);
        setVisible(true);
    }
    
    private class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            int x = (int)(Math.random()*(getWidth()-50));
            int y = (int)(Math.random()*(getHeight()-50));
            
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }
    }
    
    private class thread extends Thread {
        public void run() {
            while(true) {
                repaint();
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }
    
    public static void main(String[] args) {
        new Exercise12_2();
    }
}