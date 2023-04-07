import java.util.*;

public class Chap4_Text {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		
		try {
			for(int i = 0; i<a.length; i++) {
				a[i] = s.nextInt();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다. 다시 입력하세요!");
		}
		for (int k : a)
			if(k%3 == 0)
				System.out.println(k);
	}
}
