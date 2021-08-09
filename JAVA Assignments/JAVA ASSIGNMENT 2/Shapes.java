abstract class Shape{
	public abstract void draw();
}
class line extends Shape{
	public void draw() {
		System.out.println("Draw a line");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
}
class circle extends Shape{
	public void draw() {
		System.out.println("Draw a circle");
	}
}
class square extends Shape{
	public void draw() {
		System.out.println("Draw a square");
	}
}
public class Shapes  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		line l=new line();
		l.draw();
		Rectangle r=new Rectangle();
		r.draw();
		square s=new square();
		s.draw();
		circle c=new circle();
		c.draw();
	}

}

