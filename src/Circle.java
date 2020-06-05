
public class Circle implements Shape {

	private int radius;
	public Circle(int radius) {
		this.radius=radius;	
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
