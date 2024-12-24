package model;

public class Book extends LibraryItem {
    private String genre;
    private String ISBN;
    private String edition;


    public Book(Long id, String title, String author, String publisher,
                int publisherYear, boolean availability,String genre,String ISBN,String edition) {
        super(id, title, author, publisher, publisherYear, availability);
        this.genre = genre;
        this.ISBN= ISBN;
        this.edition = edition;
    }

    @Override
    String getItemDetail() {
        return "Book{"+
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publisher='" + getPublisher() + '\'' +
                ", publisherYear=" + getPublisherYear() +
                ", availability=" + isAvailability() +
                "genre='" + genre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }
}
