package task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class task extends JFrame{
	MyPanel panel;
	JLabel la = new JLabel();
	Container c;
	boolean board[][];
	int count;
	int x = 0;
	int y = 0;
	public task() {
		setTitle("마우스로 원그리기와 키보드로 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(getOwner());
		
		//패널
		panel = new MyPanel();
		//격자
		board = new boolean[10][10];
		setLayout(null);
		
		//마우스,키보드 입력 받기
		panel.addMouseListener(new MyMouse());
	    panel.setFocusable(true); //포커스 주기 
	    panel.addKeyListener(new MyKey());
	    
	    c = getContentPane();
	    
	    panel.setBounds(20, 20, 401, 401); //위치, 크기 지정 
	                   //x , y , 가로 , 세로
	    //원의 개수 세기
	    la.setSize(500, 10);
	    la.setText("Count : " + count);
	    la.setLocation(10, 5);
	    c.add(la);
	    add(panel);
	    
	    for (int i = 0; i < 10; i++) {
	      for (int j = 0; j < 10; j++)
	        board[i][j] = false; 
	    } 
	    
	    getContentPane().setBackground(Color.white); //전체 배경 흰색
	    setSize(500, 500);
	    setVisible(true);
		
	}
	class MyPanel extends JPanel {
	    public void paintComponent(Graphics g) {
	    	setForeground(Color.white); //사각형 색 흰색 선택
	    	g.fillRect(0, 0, 401, 401); //전체 틀 사각형 그리기
	    	la.setText("Count : " + count); //라벨에 카운트 붙이기
	    	g.setColor(Color.BLACK); //검은색 선택
	   
	    	for (int i = 0; i < 10; i++) {
	    		for (int j = 0; j < 10; j++)
	    			g.drawRect(i * 40, j * 40, 40, 40); //격자 그리기
	    	}
	      
	    	for (int i = 0; i < 10; i++) {
	    		for (int j = 0; j < 10; j++) {
	    			if (board[i][j]) {           //board[i][j] 에 true가 들어오면 원을 그려라
	    				g.setColor(Color.blue);
	    				g.fillOval(i * 40, j * 40, 40, 40);
	    			} 
	    			else {                       //board[i][j] 가 false이면 하얀 원을 그려라
	    				g.setColor(Color.white);
	    				g.fillOval(i * 40, j * 40, 40, 40);
	    			} 
	    		} 
	    	} 
	    }
	}
	
	class MyMouse extends MouseAdapter {
	    public void mouseClicked(MouseEvent e) {
	      if (count < 100) {
	    	  x = e.getX() / 40;
	    	  y = e.getY() / 40;
	    	  
	    	  System.out.println(" X :  " + x + "  Y : " + y);
	    	  
	    	  if (!board[x][y]) {
	    		  board[x][y] = true;
	    		  count++;
	    		  panel.repaint();
	    	  } 
	      	} 
	    }	
	}
	
	 public boolean checkX(int a) { //왼쪽과 오른쪽의 끝 이상으로 못 가게 하는 함수
		 boolean check = false;
		 if (x + a >= 0 && x + a < 10)
			 check = true; 
		 return check;
		 }
		  
	public boolean checkY(int b) { //위와 아래의 끝 이상으로 못 가게 하는 함수
		boolean check = false;
		if (y + b >= 0 && y + b < 10)
			check = true; 
		return	check;
		}
	
	class MyKey extends KeyAdapter {
	    public void keyPressed(KeyEvent e) {
	      int keyCode = e.getKeyCode();
	      
	      if (keyCode == KeyEvent.VK_LEFT) {
	    	  if (checkX(-1)) { 
	    		  board[x][y] = false; //현재 board false로 바꿈
	    		  x--;                 //왼쪽으로 공 이동
	    		  if (board[x][y]) {   //공이 이미 있으면 카운트 -1
	    			  count--;
	    		  } 
	    		  else {               //없으면 공을 새로 그림
	    			  board[x][y] = true;
	    		  } 
	    	  } 
	      } 
	      else if (keyCode == KeyEvent.VK_RIGHT) {
	    	  if (checkX(1)) {
	    		  board[x][y] = false;
	    		  x++;
	    		  if (board[x][y]) {
	    			  count--;
	    		  } 
	    		  else {
	    			  board[x][y] = true;
	    		  } 
	    	  } 
	      } 
	      else if (keyCode == KeyEvent.VK_UP) {
	    	  if (checkY(-1)) {
	    		  board[x][y] = false;
	    		  y--;
	    		  if (board[x][y]) {
	    			  count--;
	    		  } 
	    		  else {
	    			  board[x][y] = true;
	    		  } 
	    	  } 
	      } 
	      else if (keyCode == KeyEvent.VK_DOWN) {
	    	  if (checkY(1)) {
	    		  board[x][y] = false;
	    		  y++;
	    		  if (board[x][y]) {
	    			  count--;
	    		  } 
	    		  else {
	    			  board[x][y] = true;
	    	  	  } 
	    	  }
	      } 
	      repaint();
	    }
	  }
	public static void main(String[] args) {
		new task();
	}
}
