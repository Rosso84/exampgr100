public class BookRegister {

    private Book[] books;
    private int numberOfRegisteredBooks;

    public BookRegister(int maxNumberOfBooks) {
        books = new Book[maxNumberOfBooks];
        numberOfRegisteredBooks = 0;
    }

    public void addBooks(Book book){
        this.books[this.numberOfRegisteredBooks] = book;
        this.numberOfRegisteredBooks ++;
    }

    public void printAllBooks(){
        for(Book b: books){
            b.printState();
        }
    }

    public void printAllBooksByGenre( String genre ){
        for(Book b: books){
            if ( b.getGenre().equals( genre ) ){
                System.out.println( b.toString() );
            }/*else {
                System.out.println("No books found with genre: " + genre + ". Is your spellings correct?");
            }*/
        }
    }

    public Book[] getAllBooksByAuthor(String author){
        Book[] booksByAuthor = new Book[numberOfRegisteredBooks];
        for(Book b : books){
            int counter = 0;
            if (b.getAuthor().equals(author)){
                booksByAuthor[counter] = b;
                counter ++;
            }
            return booksByAuthor;
        }
        return null;
    }


}
