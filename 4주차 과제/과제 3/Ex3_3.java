import java.awt.*;
import javax.swing.*;

public class Ex3_3 extends JFrame {
    public Ex3_3() {
        Container container = getContentPane();
        container.add(new JButton("hello"));
        setSize(200,400); 
        setVisible(true);
    }
    public static void main(String [] args) {
        new Ex3_3();
    }
}
