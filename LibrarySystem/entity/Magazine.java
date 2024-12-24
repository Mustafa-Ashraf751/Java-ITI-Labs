package model;

public class Magazine extends LibraryItem {
    private String issueNumber;
    private String month;
    private String category;


    public Magazine(Long id, String title, String author, String publisher,
                    int publisherYear, boolean availability,
                    String issueNumber, String month, String category) {
        super(id, title, author, publisher, publisherYear, availability);
        this.issueNumber = issueNumber;
        this.month = month;
        this.category = category;
    }

    @Override
    String getItemDetail() {
        return "Magazine{"+
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", publisher='" + getPublisher() + '\'' +
                ", publisherYear=" + getPublisherYear() +
                ", availability=" + isAvailability() +
                "genre='" + issueNumber + '\'' +
                ", ISBN='" + month + '\'' +
                ", edition='" + category + '\'' +
                '}';
    }
}
