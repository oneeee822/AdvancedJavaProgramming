package day6;

public class BookStore {

	public static void main(String[] args) {
		
		//Create objects from the book
		Book book1 = new Book();
		
		book1.setTitle("Harry Poter");
		book1.setAuthor("J.K. Rolling");
		book1.setDescription("SCI FI");
		book1.setPrice(23.9);
		book1.setIsbn("67543JI");
		
		book1.printInfo();
		System.out.println(book1.salePrice());
		
		Book book2 = new Book("Lord of the Ring", "Tolkin", "SKFJE@$#", 14.9, "SCI FI");
		
		book2.printInfo();
		System.out.println(book2.salePrice());
	
		
	}

}
