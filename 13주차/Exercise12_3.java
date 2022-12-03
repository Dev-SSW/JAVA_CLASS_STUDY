import java.awt.*;
import javax.swing.*;
 
public class Exercise12_3 extends JFrame {
    private JLabel Label;
    private String text;
    private int length;
    private int index = 1;
    
    public Exercise12_3() {
        setTitle("걸어서 나오는 문자열");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().setLayout(new FlowLayout());
        
        Label = new JLabel("나는 당신을 사랑합니다.");
        
        add(Label);
        
        text = Label.getText();
        length = text.length();
        
        thread th = new thread();
        th.start();
        
        setSize(300, 200);
        setVisible(true);
    }
    
    private class thread extends Thread {
        public void run() {
            while(true) {
                Label.setText(text.substring(0, index));
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
                index++;
                if(index > length) index = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        new Exercise12_3();
    }
}

