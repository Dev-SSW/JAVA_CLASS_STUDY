import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventPractice extends JFrame {
	Container contentPane;
	JCheckBox [] fruits = new JCheckBox [3]; // 체크박스 배열
	String [] names = {"사과", "배", "왕체리"}; // 체크박스 문자열로 사용할 문자열 배열
    JLabel choiceItem;
	
	 CheckBoxItemEventPractice() {
		setTitle("체크박스와 ItemEvent  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
	
		// 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, Item 리스너 등록
		for(int i=0; i<fruits.length; i++) { // fruits.length=3
			fruits[i] = new JCheckBox(names[i]); // 배열 names[]의 문자열로 체크박스 생성
			fruits[i].setBorderPainted(true); // 체크박스의 외곽선이 보이도록 설정
			contentPane.add(fruits[i]); // 체크박스 컴포넌트를 컨텐트팬에 삽입
			fruits[i].addItemListener(new MyItemListener()); // 체크박스에 Item 리스너 등록
		}
		choiceItem = new JLabel(" "); //  출력하는 레이블 생성
		contentPane.add(choiceItem);
		
		setSize(250,200);
		setVisible(true);
	}
	
	// Item 리스너 구현
	 class MyItemListener implements ItemListener {
		// 체크박스의 선택 상태가 변하면 itemStateChanged()가 호출됨
		 public void itemStateChanged(ItemEvent e) {
			 choiceItem.setText("   ");  
			 JCheckBox obj = (JCheckBox)e.getSource(); 
			 //i 선택된 item을 구별하는 방법    e.getSource() 또는 getItem()
			 if (obj == fruits[0]) 
				 choiceItem.setText(" 네 맞아요! " +  obj.getText()  + "를 선택했지요");
			 else if (obj == fruits[1]) 
				 choiceItem.setText(" 네 맞아요!" +  obj.getText()  + "를 선택했지요");
			 else if (obj == fruits[2]) 
				 choiceItem.setText(" 네 맞아요! " + ((JCheckBox)e.getSource()).getActionCommand()  + "를 선택했지요");
		}
		 //getText() == getActionCommand()
	}

   public static void main(String [] args) {
	   new  CheckBoxItemEventPractice();
   }
} 