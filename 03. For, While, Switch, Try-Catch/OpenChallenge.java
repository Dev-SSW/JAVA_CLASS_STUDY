import java.util.*;

public class Test {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int k = rand.nextInt(100);
		int check = 0;
		int start = 0;
		int end = 99;
		while(true) {
			if (check == 0) {
				System.out.println("수를 결정하였습니다. 맞추어 보세요");
				System.out.println(start + " - " + end);
				check++;
			}
			int a = sc.nextInt();
			if (a<k) {
				start = a;
				System.out.println(start + " - " + end);
				System.out.println("더 높게");
			}
			else if (a>k) {
				end = a;
				System.out.println(start + " - " + end);
				System.out.println("더 낮게");
			}
			if (a == k)
			{
				System.out.println("맞았습니다\n다시하시겠습니까(y/n)>>");
				String b = sc.next();
				if (b.equals("y")) {
					k = rand.nextInt(100);
					check = 0;
					start = 0;
					end = 99;
				}
				else if (b.equals("n"))
				{
					break;
				}
			}
		}
	}
}
