package encapsulation;

public class Bottle {
	
	String name;
	double length;
	double breadth;
	String colour;
	
	public String getcolour() {
		return colour;
	}
	public Bottle setcolour(String colour) {
		this.colour = colour;
		return this;
	}
	public String getName() {
		return name;
	}
	public Bottle setName(String name) {
		this.name = name;
		return this;
	}
	public double getLength() {
		return length;
	}
	public Bottle setLength(int length) {
		this.length = length;
		return this;
	}
	public double getBreadth() {
		return breadth;
	}
	public Bottle setBreadth(int breadth) {
		this.breadth = breadth;
		return this;
	}
	
	Bottle(){
		
	}
	public Bottle(String name,double length,double breadth,String colour) {
		this.name=name;
		this.length=length;
		this.breadth=breadth;
		this.colour=colour;
	}
	public void printProperties() {
		System.out.println("Bottle[colour="+colour+",name="+name+",length="+length+",breadth="+breadth+"]");
	}
public static Bottle addBottle(String name,double length,double breadth,String colour) {
	return new Bottle(name,length,breadth,colour);
}
public static Bottle addBottle() {
	return new Bottle();
}	
public static void main(String[] args) {
	addBottle("bindu",12.5,3.0,"grey").printProperties();
}

	

}
