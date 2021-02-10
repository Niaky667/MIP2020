package task.book;

/**
 *
 * @author nicol
 */
public class Main {

    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Stefan Tanase", "s_tanasa@javabook.com", 'm');
        authors[1] = new Author("Cristian Olariu", "c.olariu@yahoo.com", 'm');

        Book aBook = new Book("Java de la 0 la expert", authors, 45.10, 1000);

        Book anotherBook = new Book(
                "Introduction to Algorithms",
                new Author[]{
                    new Author("Thomas H.Cormen", "cormen@alg.com", 'm'),
                    new Author("Clifford Stein", "c_stein@here.com", 'm')
                },
                33.15, 625);

        System.out.println(aBook);
        aBook.printAuthors();
        System.out.println();
        
        System.out.println(anotherBook);
        anotherBook.printAuthors();
        System.out.println();
    }
}
