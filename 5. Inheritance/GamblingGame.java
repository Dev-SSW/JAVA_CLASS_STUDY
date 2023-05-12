import java.util.Scanner;
class Player{
	private String name;
	Player(String name) { this.name = name;}
	String getName() {return name;}
}
public class GamblingGame {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Player p[] = new Player[2];
		for( int i = 0; i<p.length; i++)
		{
			System.out.print("선수 이름 입력 >> ");
			p[i] = new Player(scanner.next());
		}
				
		int n = 0;
		while(true)
		{
			System.out.println(p[n].getName() + " <ENTER 외 아무거나 입력> ");
			scanner.next();
			int[] val = new int[3];
			for(int i =0; i<val.length;i++)
			{
				val[i]=(int)(Math.random()* 3);
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if(val[0] == val[1] && val[0] == val[2]) 
			{
				System.out.println(p[n].getName() + "가 승리");
				break;
			}
			n++;
			
		}
	}
}
