import java.util.*;
public class Chap2_Task2 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요 >> ");
		int won = scan.nextInt();
		//65245
		int fif_t = won / 50000; // 65245 / 50000 = 1
		int ten_t = (won %50000) / 10000; // 15245 / 10000 = 1
		int t = (won%50000%10000) / 1000; // 5245 / 1000 = 5
		int s = (won%50000%10000%1000); // 245
		int five_h = s / 500; // 245 / 500 = 0
		int h =  (s%500)/ 100; // 245 / 100 = 2
		int ten = (s%500%100) / 10; // 45 / 10 = 4
		int one = (s%500%100%10) / 1; // 5 / 1 = 5;
		System.out.println("오만원" + fif_t + "개,"+"만원" + ten_t + "개,"+"천원" + t + "개," 
				+"오백원" + five_h + "개,"+"백원" + h + "개," + "십원" + ten + "개,"
				+"1원" + one + "개,");
	}
}
