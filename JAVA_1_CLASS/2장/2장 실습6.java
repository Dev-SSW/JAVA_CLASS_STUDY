import java.util.*;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = "박수";
		int check =0;
		if(a/10 == 3 || a/10 == 6 || a/10 == 9)
		{
			s = s+"짝";
			check =1;
		}
		if(a%10 == 3 || a%10 == 6 || a%10 == 9)
		{
			s = s+"짝";
			check =1;
		}
		if(check == 0)
		{
			s = s+"없음";
		}
		System.out.println(s);
	
	}
}
