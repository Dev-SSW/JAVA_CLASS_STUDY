import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LineDrawExPaint extends JFrame {
	public LineDrawExPaint(){
                          	add(new MyPanel());
//                         	setContentPane(new MyPanel());
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Point startP = null;
		Point endP = null;
		
		public MyPanel(){
		      this.addMouseListener(new MyMouseListener());
		}
		
		class MyMouseListener extends MouseAdapter{
		      public void mousePressed(MouseEvent e){
			   startP = (Point)e.getPoint(); // 클릭한부분을 시작점으로
	    	      }
		      public void mouseReleased(MouseEvent e){
          		                endP = (Point)e.getPoint(); // 드래그 한부분을 종료점으로
                                           repaint();
		        }
		       
		}
 		public void paintComponent(Graphics g){
//                                         super.paintComponent(g);
		              if(startP != null && endP != null)
//			    g.drawLine(startP.x, startP.y, endP.x, endP.y);
			    g.drawLine((int)startP.getX(), (int)startP.getY(), (int)endP.getX(), (int)endP.getY());
     		}
	}
	
	public static void main(String[] args) {
		new LineDrawExPaint();
	}
}