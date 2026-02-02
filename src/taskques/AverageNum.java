package taskques;

public class AverageNum {
	public static void average(String name,int... num) {
		int sum=0;
		double av=0;
		for(int i=0;i<num.length;i++)
			sum+=num[i];
		av=(double)sum/(num.length);
		
		System.out.println("Name :"+name);
		System.out.println("average:"+av);
	}
	public static void average(String name) {
		System.out.println("Name:"+name);
		System.out.println("Average:0");
	}

	public static void main(String[] args) {
		average("manvi",20,40,10,30);
		System.out.println("---------------");
		average("Sanvi",10,25,18);
		System.out.println("---------------");
		average("Abc");
		System.out.println("---------------");
		

	}

}
