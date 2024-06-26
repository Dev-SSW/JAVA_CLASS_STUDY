import java.util.*;
interface StackInterFace{
	int length();
	String pop();
	boolean push(String ob);
}
class StringStack implements StackInterFace
{
	String[] stack = new String[5];
	int top = 0;
	public int length()
	{
		return top;
		
	}
	public String pop()
	{
		return stack[top--];
	}
	public boolean push(String ob) {
		stack[top] = ob;
		top++;
		return false;
	}
}
public class Stack {
	public static void main(String[] args)
	{
		StringStack ss = new StringStack();
		Scanner sc = new Scanner(System.in);
	}
}
