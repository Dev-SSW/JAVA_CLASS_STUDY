import java.util.ArrayList;
import java.util.*;
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList(10);
		for(int i =0; i<5; i++) {
			String s = sc.next();
			list.add(s);
		}
		int a =list.indexOf("A");
		list.set(a, 4.0);
		int b =list.indexOf("B");
		list.set(b, 3.0);
		int c =list.indexOf("C");
		list.set(c, 2.0);
		int d =list.indexOf("D");
		list.set(d, 1.0);
		int f =list.indexOf("F");
		list.set(f, 0.0);
		System.out.println(list);
	}
}
