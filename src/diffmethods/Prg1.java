package diffmethods;

public class Prg1 {
	public static String Check(int a) {
		if(a>0) return "positive";
		else return "negative";
		
	}

	public static void main(String[] args) {
		String value=Check(-25);
		System.out.println("the number is "+value);
	}

}
