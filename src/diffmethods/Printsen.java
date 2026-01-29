package diffmethods;
import java.util.Scanner;
import java.util.Scanner;

public class Printsen {

	public static String name(String n) {
		return "how are you "+n;
		
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	String n=sc.next();
	String namest=name(n);
	System.out.println(namest);
}
}