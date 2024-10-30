package aggregation;

public class Book {
	
	String BookName;
	int PublishYear;
	int Price;
	
	Author author;
	
	public Book(String BookName,int PublishYear,int Price, Author author) {
		this.BookName=BookName;
		this.PublishYear=PublishYear;
		this.Price=Price;
		this.author=author;
	}
	
	public void BookDetails() {
		System.out.println("Book Name: "+BookName);
		System.out.println("Author: "+author.AuthorName);
		System.out.println("Year Published: "+PublishYear);
		System.out.println("Book Price: "+Price);
		
	}

	public static void main(String[] args) {
		
		Author obj=new Author("Arundathi Roy");
		Book obj1=new Book("God Of Small things",2001,350,obj);
		obj1.BookDetails();
		

	}

}
