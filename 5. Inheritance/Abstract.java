import java.util.*;

abstract class Calculator{
	protected int a,b;
	abstract protected void calc();
	protected void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 >> ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void run()
	{
		input();
		calc();
//		int res = calc();
//		System.out.println("계산 값은 " + res);
	}
}
class Adder extends Calculator
{
	protected void calc()
	{
		System.out.println("계산 값은 " + (a + b));
	}
}
class Substracter extends Calculator
{
	protected void calc()
	{
		System.out.println("계산 값은 " + (a - b));
		
	}
}
public class NamedCircle {
	public static void main(String[] args)
	{
		Adder ad = new Adder();
		Substracter sub = new Substracter();
		ad.run();
		sub.run();
	}
}
