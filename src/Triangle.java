
public class Triangle implements Shape {

	private int base,height;
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}
	public double getArea() {
		return base*height*0.5;	
	}
}
