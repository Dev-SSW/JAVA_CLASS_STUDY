import javax.swing.*;
import java.awt.*;

public class Ex4_2 extends JFrame{
    public Ex4_2(){
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new BorderLayout(50, 5));
        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center"), BorderLayout.CENTER);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        setSize(400, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        new Ex4_2();
    }
}
