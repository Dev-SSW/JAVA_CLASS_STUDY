import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳 한 문자를 입력하세요 >>");
		String s = scanner.next();
		char c = s.charAt(0);
		/*
		do {
			System.out.print(i);
			i = (char) (i+1);
		}while(i<=c);
		*/
		for (char i = 'a'; i<=s.charAt(0); i++) 
		{
			for (char j = i; j<=s.charAt(0); j++) {	
				System.out.print(j);
			}
			System.out.println();
		}
	}
}