package task.author;

public class Main {
	
	public static void main(String[] args) {
		
		Book bookJava24h = new Book("Java24h",null, 12.00, 1);
		Book bookCplusplus = new Book("Cplusplus",null, 67.00, 1);
		Author author = new Author("Mihai", "mihai@yahoo.com", 'm');
		Author author1 = new Author("Georgeta", "georgeta@gmail.com", 'f');
		bookJava24h.setAuthor(author);
		bookCplusplus.setAuthor(author1);
		System.out.println(bookJava24h);
		System.out.println(bookCplusplus);
		
	}
}
