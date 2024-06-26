import java.util.*;
public class Task_2020110223 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("당신의 입력 >> "); String a = sc.next();
		int c = (int) (Math.random() * 3);
		String b = "";
		switch(c)
		{
		case 0: 
			b = "가위";
			break;
		case 1:
			b = "바위";
			break;
		case 2: 
			b = "보";
		}
		System.out.println("컴퓨터의 입력 >> " + b);
		if (a.equals("보"))
		{
			if(b.equals("보"))
			{
				System.out.println("비겼습니다.");
			}
			else if(b.equals("가위"))
			{
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(b.equals("바위"))
			{
				System.out.println("이겼습니다.");
			}
		}
		if (a.equals("가위"))
		{
			if(b.equals("보"))
			{
				System.out.println("이겼습니다.");
			}
			else if(b.equals("가위"))
			{
				System.out.println("비겼습니다.");
			}
			else if(b.equals("바위"))
			{
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
		if (a.equals("바위"))
		{
			if(b.equals("보"))
			{
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else if(b.equals("가위"))
			{
				System.out.println("이겼습니다.");
			}
			else if(b.equals("바위"))
			{
				System.out.println("비겼습니다.");
			}
		}
	}
}
