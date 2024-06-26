import java.util.*;
public class Chap3_Tast2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eng[] = { "student" , "love" , "java"};
		String kor[] = { "학생" , "사랑" , "자바"};
		System.out.println("찾고 싶은 영어 단어를 입력하시오");
		String s;
		while (true) {
			s = sc.next();
			try {
				if (s.equals("exit")) {
					break;
				}
				for (int i =0;true; i++) {
					if (s.equals(eng[i])) {
						System.out.println(kor[i]);
						break;
					}
				}
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("사전에 없습니다.");
			}
		
		}
	}
}
