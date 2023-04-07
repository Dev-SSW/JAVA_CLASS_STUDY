import java.util.*;

public class Chap2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("주문하려는 아메리카노, 카페라떼, 카푸치노 수량을 적어주세요. ");
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		int e = b+c+d;
		int sum = (b*1000) + (c*1500) + (d*1800);
		System.out.println("주문한 커피는 총 " + e + "잔 입니다. 총 금액은 " + sum + "원 입니다.");
	}
}
