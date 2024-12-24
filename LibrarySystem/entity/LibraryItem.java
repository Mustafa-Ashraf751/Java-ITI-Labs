package model;

public abstract class LibraryItem {
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private int publisherYear;
    private boolean availability;

    public LibraryItem(Long id, String title, String author,
                       String publisher, int publisherYear, boolean availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publisherYear = publisherYear;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publisherYear=" + publisherYear +
                ", availability=" + availability +
                '}';
    }

    abstract String getItemDetail();
}
