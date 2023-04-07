import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*이벤트 리스너는  MouseListener를 구현한 EventHandler 객체에 구현되어 있고, 
이벤트 소스는 Button1,Button2 (들)이며, 
여기에 이벤트 리스너가 등록되어 있고, 이벤트 객체는 마우스 동작 이벤트로서 EventHandler class type으로 만들어져  
이벤트 리스너에게 전달하게 된다.)*/
class EventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e) {
      	System.out.println("마우스 버튼을 클릭함");	
    	}
    public void mousePressed(MouseEvent e) {
    	System.out.println("마우스 버튼을 누름");
  	}
    public void mouseReleased(MouseEvent e) {
 		System.out.println("마우스 버튼을 놓음");
	}
    public void mouseEntered(MouseEvent e) {
    	System.out.println("마우스가 버튼 안에 들어옴");
    }
    public void mouseExited(MouseEvent e) {
    	System.out.println("마우스가 버튼 밖으로 나감");
	}
}
public class MouseEvent1_Button extends JFrame {	
	public MouseEvent1_Button(String str) {
	      
		  super(str);
		
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLayout(new FlowLayout());
          
          
          JButton button1 = new JButton("ONE");
          JButton button2 = new JButton("TWO");

          add(button1);
          add(button2);
          EventHandler Eh = new EventHandler();
          button1.addMouseListener(Eh);
          button2.addMouseListener(Eh);

	      setSize(300,300);
	      setVisible(true);
	}

    
    	
	public static void main(String[] args) {
		new MouseEvent1_Button("마우스 이벤트 1번 과제");
 	 }	
}

