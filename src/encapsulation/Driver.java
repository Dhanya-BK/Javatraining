package encapsulation;

class Circle{
	private double radius;

	public double getradius() {
		return radius;
	}

	private void setradius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		setradius(radius);
	}
	
}
class Utility{
	public static double cdiameter(Circle r) {
		return r.getradius()*2;
	}
	public static double carea(Circle r) {
		return (22.0/7.0)*((r.getradius())*(r.getradius()));
	}
	
}
public class Driver {

	public static void main(String[] args) {
		Circle r1=new Circle(10);
		System.out.println(Utility.cdiameter(r1));
		System.out.println(Utility.carea(r1));
		

	}

}
