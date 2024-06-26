import java.util.*;
public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector(10);
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		for (int i = 0; i< 10; i++) {
			int a = sc.nextInt();
			v.add(a);
		}
		int max = (int)v.get(1) - (int)v.get(0);
		for (int i = 0; i< v.size()-1;i++) {
			if ( max < (int)v.get(i+1) - (int)v.get(i)) {
				max = (int)v.get(i+1) - (int)v.get(i);
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 2004년 "+(double)max+"cm");
	}
}
