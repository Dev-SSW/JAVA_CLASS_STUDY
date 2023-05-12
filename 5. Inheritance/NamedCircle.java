import java.util.*;
class Circle {
	private int radius;
	public Circle() { this.radius = 0; }
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return radius; }
	
}
public class NamedCircle extends Circle {
	private String name;
	public NamedCircle() { super(0); this.name = "";} 
	public NamedCircle(int a, String b) { super(a); this.name = b;}
	public void show() { System.out.println(getRadius() + ", " + name); }
	public static void main(String[] args)
	{ 
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}
