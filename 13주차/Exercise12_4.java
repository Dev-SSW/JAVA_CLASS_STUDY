import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
 
public class Exercise12_4 extends JFrame {
    private Calendar c;
    private int hour, min, second;
    private JLabel time;
    public Exercise12_4() {
        setTitle("디지털 시계");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container ct = getContentPane();
        
        ct.setLayout(null);
        
        time = new JLabel();
        time.setFont(new Font("Gothic", Font.ITALIC, 80));
        time.setBounds(35, 30, 400, 100);
        ct.add(time);
        
        thread th = new thread();
        th.start();
        
        setSize(400, 200);
        setVisible(true);
    }
    
    private class thread extends Thread {
        public void run() {
            while(true) {
                c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                String clockText = Integer.toString(hour);
                clockText = clockText.concat(":");
                clockText = clockText.concat(Integer.toString(min));
                clockText = clockText.concat(":");
                clockText = clockText.concat(Integer.toString(second));
                
                time.setText(clockText);
            }
        }
    }
 
    public static void main(String[] args) {
        new Exercise12_4();
    }
}
