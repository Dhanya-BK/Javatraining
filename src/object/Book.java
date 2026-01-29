package object;

public class Book {
	
	String bname;
	int bid;
	String bauthor;
	String publisher;
	int pages;
	int sections;
	

	public static void main(String[] args) {
		Book book1=new Book();
		book1.bname="The Famous Five";
		book1.bid=101;
		book1.bauthor="Enid Blyton";
		book1.publisher="Abc";
		book1.pages=236;
		book1.sections=19;
		
		Book book2=new Book();
		book2.bname="The Five in the sand moor";
		book2.bid=102;
		book2.bauthor="Enid Blyton";
		book2.publisher="XYZ";
		book2.pages=248;
		book2.sections=22;
		
		Book book3=new Book();
		book3.bname="Revolution 2020";
		book3.bid=103;
		book3.bauthor="Chethan Bhagath";
		book3.publisher="ABC";
		book3.pages=368;
		book3.sections=35;
		
		System.out.println(book1.bname);
		System.out.println(book1.bauthor);
		System.out.println(book1.bid);
		System.out.println(book1.publisher);
		System.out.println(book1.pages);
		System.out.println(book1.sections);
		System.out.println("----------------------");
		
		System.out.println(book2.bname);
		System.out.println(book2.bauthor);
		System.out.println(book2.bid);
		System.out.println(book2.publisher);
		System.out.println(book2.pages);
		System.out.println(book2.sections);
		System.out.println("----------------------");
		
		System.out.println(book3.bname);
		System.out.println(book3.bauthor);
		System.out.println(book3.bid);
		System.out.println(book3.publisher);
		System.out.println(book3.pages);
		System.out.println(book3.sections);
}

}
