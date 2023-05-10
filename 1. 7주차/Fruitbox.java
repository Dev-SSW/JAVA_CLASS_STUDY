import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Apple extends Box
	{
	public void AppleAdd(int i) {AppleList.add("Apple");}
	}
class Orange extends Box
	{
	public void OrangeAdd(int i) {OrangeList.add("Orange");}
	}
		
class Box
{
	ArrayList AppleList = new ArrayList(10);
	ArrayList OrangeList = new ArrayList(10);
	
	public void FindApple() {
		Iterator itr1 = AppleList.iterator();
		while (itr1.hasNext()){ 
		}
		String e = (String) itr1.next();
		int Applecount =0;
		if (e == "Apple") {
			Applecount++;
		}
	}
	
	public void FindOrange() {
		Iterator itr2 = OrangeList.iterator();
		while (itr2.hasNext()){ 
		}
		String e = (String) itr2.next();
		int Orangecount =0;
		if (e == "Orange") {
			Orangecount++;
		}
	}
}
class Fruitbox {
	public static void main(String[] args) {
		System.out.println("●원하는 번호를 입력하시오\n"
				+ "   \"0\" : 오렌지 상자 내용 전체 보기\n"
				+ "   \"1\" : 사과 상자 내용 전체 보기\n"
				+ "   \"2\" : 오렌지 한개 꺼내기\n"
				+ "   \"3\" : 사과 한개 꺼내기\n"
				+ "   \"4\" : 상자에 과일 넣기\n"
				+ "   \"-1\" : 종료");
		Scanner sc = new Scanner(System.in);
		int x = 0;
		Box box = new Box();
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		while(x == 0) {
			int a = sc.nextInt();
			if(a == 0) {
				System.out.println(orange.OrangeList);
			}					
			else if (a == 1) {
				System.out.println(apple.AppleList);
			}
			else if (a == 2) {
				orange.OrangeList.remove(orange.OrangeList.size()-1);
			}
			else if (a == 3) {
				apple.AppleList.remove(apple.AppleList.size()-1);
			}
			else if (a == 4) {
				System.out.println("어떤 과일 상자에 넣을 것인지 선택하시요\n"
						+"1:오렌지 상자\n"
						+"2:사과 상자\n"
						);
				Scanner i = new Scanner(System.in);
				int y = i.nextInt();
				if (y==1) {orange.OrangeAdd(1);}
				if (y==2) {apple.AppleAdd(1);}
			}
			else if (a == -1) {
				System.out.println("프로그램을 종료합니다");
				x = 1;
			}
			else {
				System.out.println("잘못된 번호를 입력했습니다.");
			}
		 } 
		
		}
	}


