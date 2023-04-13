import java.util.*;

class namespace
{
	String name;
	String number;
	
}
public class Test{
	public static void main(String[] args) {
		//이름과 전화번호를 입력받아 객체를 생성하도록 작성하라.
		//동작의 예
		// 이름과 전화번호 입력 >>> 백설공주 777-7777
		// 이름과 전화번호 입력 >> 홍길동 888-8888ㅇㅇㅇ
		// 백설공주의 전화번호는 777-7777입니다;
		// 홍길동의 전화번호는 888 - 8888 입니다.
		Scanner sc = new Scanner(System.in);
		namespace ns1 = new namespace();
		namespace ns2 = new namespace();
		System.out.println("이름과 전화번호를 적어주세요 >> ");
		ns1.name = sc.next();
		ns1.number = sc.next();
		System.out.println("이름과 전화번호를 적어주세요 >> ");
		ns2.name = sc.next();
		ns2.number = sc.next();
		
		System.out.println(ns1.name + "의 전화번호는 " + ns1.number + "입니다.");

		System.out.println(ns2.name + "의 전화번호는 " + ns2.number + "입니다.");
	}
}