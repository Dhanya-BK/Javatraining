package object;

public class FlipkartEnduser {
	
	String name;
	String address;
	long cno;
	String email_id;
	String product;

	public static void main(String[] args) {
		
		FlipkartEnduser user1=new FlipkartEnduser();
		user1.name="Akshaya";
		user1.address="Uppinangady";
		user1.cno=8367645832l;
		user1.email_id="akshaya123@gmail.com";
		user1.product="camera";
		
		FlipkartEnduser user2=new FlipkartEnduser();
		user2.name="Srijanya";
		user2.address="adyanadka";
		user2.cno=9364531832l;
		user2.email_id="srijanya453@gmail.com";
		user2.product="Phone";
		
		FlipkartEnduser user3=new FlipkartEnduser();
		user3.name="Sharanya";
		user3.address="Eshwaramangala";
		user3.cno=76769532l;
		user3.email_id="sharanya25@gmail.com";
		user3.product="TV";
		
		System.out.println("User Name:"+user1.name);
		System.out.println("User Email_id:"+user1.email_id);
		System.out.println("User Product:"+user1.product);
		System.out.println("-------------");
		
		System.out.println("User Name:"+user2.name);
		System.out.println("User Email_id:"+user2.email_id);
		System.out.println("User Product:"+user2.product);
		System.out.println("-------------");
		
		
		System.out.println("User Name:"+user3.name);
		System.out.println("User Email_id:"+user3.email_id);
		System.out.println("User Product:"+user3.product);
		System.out.println("-------------");
		
		

	}

}
