package entity;

public class Book extends LibraryItem {
    private String genre;
    private String ISBN;
    private String edition;


    public Book(String title, String genre,String ISBN,String edition) {
        super(title);
        this.genre = genre;
        this.ISBN= ISBN;
        this.edition = edition;
    }

    @Override
    public String getItemDetail() {
        return "Book{"+
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", availability=" + isAvailability() +
                "genre='" + genre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Book{"+
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", availability=" + isAvailability() +
                "genre='" + genre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }
}
