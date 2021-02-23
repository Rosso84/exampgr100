import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String genre;
    private Chapter[] chapters;

    public Book(String title, String author, int numberOfPages, String genre, Chapter[] chapters) {
        setTitle(title);
        setAuthor(author);
        setNumberOfPages(numberOfPages);
        setGenre(genre);
        setChapters(chapters);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Chapter[] getChapters() {
        return chapters;
    }

    public void setChapters(Chapter[] chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", numberOfPages: " + numberOfPages +
                ", genre: '" + genre + '\'' +
                ", chapters: " + Arrays.toString(chapters) +
                '}';
    }


    /**Egentlig ikke nødvendig å ha denne metoden da en bare kan kalle på toString(),
     men jeg lar den være da oppgaven beskriver det slik.*/
    public void printState(){
        System.out.println( this.toString());
    }

}
