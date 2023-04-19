import java.util.*;

class PhoneManager
{
	String name;
	String number;
	public PhoneManager(String a, String b) {
		name = a;
		number = b;
	}
}
public class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수>>");
		int b = sc.nextInt();
		PhoneManager p[] = new PhoneManager[b];
		for (int i = 0; i<p.length;i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력)>>");
			p[i] = new PhoneManager(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다.");
		String a = "";
		
		while(true) 
		{
			System.out.println("검색할 이름>>");
			int check =0;
			a = sc.next();
			if(a.equals("exit"))
			{
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			for(int i =0; i<p.length; i++) {
				if(a.equals(p[i].name)) 
				{
					System.out.println(a + "의 번호는 " + p[i].number + "입니다.");
					check = 1;
				}
			}
			if(check == 0) {
			System.out.println(a + "이 없습니다.");
			}
			
		}
	}
}