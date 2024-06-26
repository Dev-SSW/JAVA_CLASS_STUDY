import java.util.*;

public class Task{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector(10);
		for (int i = 0; i<5; i++) {
			double a = sc.nextDouble();
			v.add(a);
		}
		double max = (double) v.get(0);
		for(int i =0; i<v.size(); i++) {
			if((double)v.get(i) > max)
				max = (double)v.get(i);
		}
		System.out.println("가장 큰 수는 " + max);
		sc.close();
		
	}
}