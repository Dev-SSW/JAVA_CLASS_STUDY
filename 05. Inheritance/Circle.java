class Point{
 private int x, y;
 public Point(int x, int y) {this.x=x; this.y=y;}
 public int getX() { return x;}
 public int getY() { return y;}
 protected void move(int x, int y) { this.x = x; this.y=y;}
}
public class Circle extends Point {
	private int radius;
	public Circle() { super(0 , 0); this.radius = 0;}
	public Circle(int x, int y, int radius) { super(x,y); this.radius = radius; }
	public void setPoint( int x , int y) { move(x,y);}
	public void setRadius (int radius) { this.radius = radius;}
	public void show() { System.out.println("반지름 " + this.radius + "인 원(" + getX() + "," + getY() + ")");}
	
	public static void main(String[] args){
		 Circle c = new Circle(5,5,10); //중심점 5,5    반지름이 10
		 c.setPoint(20,30); //중심점 20,30
		 c.setRadius(7); //반지름 7
		 c.show();
		}
}

//<출력결과>
//반지름 7인 원(20,30)