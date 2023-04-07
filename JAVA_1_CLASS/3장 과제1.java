import java.util.Scanner;
public class Test_re{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳 한 문자를 입력하세요 >>");
		String s = scanner.next();
		char c = s.charAt(0);
		char i = 'a';
		do {
			System.out.print(i);
			i = (char) (i+1);
		}while(i<=c);
	}
}