
package taskques;

public class PrintAlphabet {
	public void alpha() {
		int j=1;
		for(int i=65;i<91;i++) {
			System.out.println(j+" "+(char)i);
			j++;
		}
	}

	public static void main(String[] args) {
		PrintAlphabet pa=new PrintAlphabet();
		pa.alpha();
		
		

	}

}
/* or

package taskques;

public class PrintAlphabet {

	public void alpha() {
		int j=1;
		for(int i=65;i<91;i++) {
			System.out.println(j+" "+(char)i);
			j++;
		}
	}
	public static PrintAlphabet objref() {
		return new PrintAlphabet();
		
	}

	public static void main(String[] args) {
		PrintAlphabet pa=objref();
		pa.alpha();
		


	}

}
*/

