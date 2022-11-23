package task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;


public class task4 extends JFrame{

	public task4() {
		setTitle("과제4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		MyPanel panel = new MyPanel();
	    add(panel);
	    
	    setSize(500, 500);
	    setVisible(true);
	}
	
	class mPoint{
		int x;
		int y;
		boolean draw;
		
		mPoint(int dx , int dy , boolean bdraw){
			x = dx;
			y = dy;
			draw = bdraw;
		}
	}
	
	class MyPanel extends JPanel{	
		JButton clear = new JButton("CLEAR");
		JButton save = new JButton("Save");
		
		BufferedImage image = new BufferedImage(500, 500, 1);
		Graphics gr = image.getGraphics();
		
		Vector<mPoint> Po = new Vector<mPoint>();
		
		public MyPanel() {
			
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (mPoint element : Po) {
			              element.x = 0;
			              element.y = 0;
			        }  
		            repaint();
		            gr.setColor(Color.white);
		            gr.fillRect(0, 0, 500, 500);
		          }
		        });
			
			save.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ImageIO.write(image,"jpg" , new File("Save.png"));
					}
					catch (Exception ee){
						ee.printStackTrace();
					}
				}
			});
			
			add(clear);
			add(save);
			
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					Point a = e.getPoint();
					mPoint p1 = new mPoint((int)a.getX(),(int)a.getY(),true);
		            Po.add(p1);
		            repaint();
				}
			});
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					Point b = e.getPoint();
					mPoint p2 = new mPoint((int)b.getX(),(int)b.getY(),false);
		            Po.add(p2);
		            repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    g.setColor(Color.BLUE);
		    gr.setColor(Color.BLUE);
		    
		    for (int i = 1; i < Po.size(); i++) {
		      if (((mPoint)Po.get(i)).draw) {
		        g.drawLine(((mPoint)Po.get(i - 1)).x, ((mPoint)Po.get(i - 1)).y, 
		        		((mPoint)Po.get(i)).x, ((mPoint)Po.get(i)).y);
		        gr.drawLine(((mPoint)Po.get(i - 1)).x, ((mPoint)Po.get(i - 1)).y, 
		        		((mPoint)Po.get(i)).x, ((mPoint)Po.get(i)).y);
		      } 
		    } 
		  }
	}
	
	
	public static void main(String[] args) {
		new task4();
	}
}
