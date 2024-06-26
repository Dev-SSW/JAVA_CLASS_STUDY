import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

class Box<T>{
	ArrayList<T> box = new ArrayList<T>();
	void add(T item) {
		box.add(item);
	}
	void remove(T item) {
		box.remove(item);
	}
	T get(int i) {
		return box.get(i);
	}
	public String toString() {
		return box.toString();
	}
}
class Apple extends Box{
	public String toString() {
		return "Apple";
	}
}
class Orange extends Box{
	public String toString() {
		return "Orange";
	}
}

public class FruitBoxTask {
	public static void main(String[] args) {
		Box<Apple> AppleBox = new Box<Apple>();
		Box<Orange> OrangeBox = new Box<Orange>();
		
		System.out.println("●원하는 번호를 입력하시오\n"
				+ "   \"0\" : 오렌지 상자 내용 전체 보기\n"
				+ "   \"1\" : 사과 상자 내용 전체 보기\n"
				+ "   \"2\" : 오렌지 한개 꺼내기\n"
				+ "   \"3\" : 사과 한개 꺼내기\n"
				+ "   \"4\" : 상자에 과일 넣기\n"
				+ "   \"-1\" : 종료");
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while(x == 0) {
			int a = sc.nextInt();
			if(a == 0) //오렌지 상자 내용 전체 보기 
			{
				System.out.println(OrangeBox);
			}					
			else if (a == 1) //사과 상자 내용 전체 보기 
			{
				System.out.println(AppleBox);
			}
			else if (a == 2) //오렌지 한개 꺼내기 
			{	
				
				OrangeBox.remove(OrangeBox.get(0));
			}
			else if (a == 3) //사과 한개 꺼내기 
			{
				
				AppleBox.remove(AppleBox.get(0));
			}
			else if (a == 4) //상자에 과일 넣기
			{
				AppleBox.add(new Apple());
				OrangeBox.add(new Orange());
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