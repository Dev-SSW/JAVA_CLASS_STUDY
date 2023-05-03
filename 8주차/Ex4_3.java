import javax.swing.*;
import java.awt.*;

public class Ex4_3 extends JFrame{
    public Ex4_3(){
        setTitle("FlowLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(new JLabel(100 + " + " + 200));
        container.add(new JButton("="), BorderLayout.CENTER);
        container.add(new JLabel(Integer.toString(300)));
        setSize(400, 100);
        setVisible(true);
    }
    public static void main(String[] args){
        new Ex4_3();
    }
}
