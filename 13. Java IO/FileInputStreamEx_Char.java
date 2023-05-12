// 교재 예제 13-1 FileReader와 비교할 것.

import java.io.*;

public class FileInputStreamEx_Char {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("aa.txt");
			int  c;
			while((c = in.read())!= -1) {
				System.out.print((char)c);
			}
			System.out.println();
            System.out.println(c); // -1
			in.close();
		} catch(IOException e) {
                                 System.out.println("입출력 오류"); }
	             }
}