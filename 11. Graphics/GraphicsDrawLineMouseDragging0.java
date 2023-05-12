import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseDragging0 extends JFrame {

	GraphicsDrawLineMouseDragging0() {
		setTitle("Drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
                            add(panel, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String [] args) {
		new GraphicsDrawLineMouseDragging0();
	}
	
	// 선을 그릴 수 있는 패널을 구현한다.
	// 이 패널에 Mouse 리스너를 구현한다.
	class MyPanel extends JPanel {
	   // 그려진 선을 모두 저장하기 위해 시작점은 vStart에 
	  // 끝점은 vEnd 벡터에 각각 저장한다.
	   Vector<Point> vStart = new Vector<Point>();
	   Vector<Point> vEnd = new Vector<Point>();
		
	   public MyPanel() {
			
	   // Mouse 리스너를 등록한다. 
  
/*
 // 이 리스너는 마우스 버튼이 눌려지면 마우스 포인터(시작점)를 vStart 벡터에 저장하고
// 마우스 버튼이 놓여지면 마우스포인터(끝점)를 vEnd 벡터에 기억한다.
          
	      addMouseListener(new MouseAdapter(){

		 public void mousePressed(MouseEvent e) {
			Point startP = e.getPoint(); // 마우스 포인터를 알아낸다.
			vStart.add(startP); // 시작점을 vStart에 저장한다.
		 }
		public void mouseReleased(MouseEvent e) {
			Point endP = e.getPoint(); // 마우스 포인터를 알아낸다.
			vEnd.add(endP); // 끝점을 vEnd에 저장한다.
					
			// 패널의 다시 그리기를 요청한다. 
			repaint();
		 }
                 });
*/
                   addMouseMotionListener(new MouseAdapter(){
                        public void mouseDragged(MouseEvent e) {
                       // 이 리스너는 마우스 버튼이 눌려서 드래깅하는 동안 모든 마우스 포인터(점)들이  vStart 벡터에만 저장시키는 방법이다.
                            Point startP = e.getPoint(); // 마우스 포인터를 알아낸다.
                     //     Point endP = e.getPoint(); // 마우스 포인터를 알아낸다.
	              vStart.add(startP); // 시작점을 vStart에 저장한다.
                    //	vEnd.add(endP); // 끝점을 vEnd에 저장한다.
                             repaint();
                        }
		
                 });			
      }
		
      public void paintComponent(Graphics g) {
           super.paintComponent(g);
           g.setColor(Color.BLUE); // 파란색을 선택한다.
			
 // 벡터의 크기만큼 루프 돌면서 선을 그린다.
 /*
          for(int i=0; i<vStart.size()-1; i++) { //vStart 벡터의 크기는 만들어진 선의 개수와 동일
              Point s = vStart.elementAt(i); // 벡터에 들어 있는 시작점을 알아낸다.
              Point e = vEnd.elementAt(i+1); // 벡터에 들어 있는 끝점을 알아낸다.
          }
*/
          for(int i=1; i<vStart.size(); i++) { //vStart 벡터의 크기는 만들어진 선의 개수와 동일
              Point s = vStart.elementAt(i-1);
              Point e = vStart.elementAt(i);  
	// 시작점에서 끝점까지 선을 그린다.
             g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
             System.out.println( (int)s.getX() + " " + (int)s.getY()+ " "+ (int)e.getX()+ " "+ (int)e.getY());		
          }  // of for loop
      } // of paintComponent()
  }
} 