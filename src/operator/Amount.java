package operator;

public class Amount {

	public static void main(String[] args) {
		int fiveNote=0;
		int twoNote=0;
		int amount=5500;
		while(amount>=2000) {
			int two=amount/2000;
			amount=amount%2000;
			twoNote=twoNote+two;
		}
		while(amount>=500) {
			int five=amount/500;
			amount=amount%500;
			fiveNote=fiveNote+five;
		}
		System.out.println("no. of 2000 notes:"+twoNote);
		System.out.println("no. of 2000 notes:"+fiveNote);

	}

}
