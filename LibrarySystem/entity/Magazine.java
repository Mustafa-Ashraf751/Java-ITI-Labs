package entity;

public class Magazine extends LibraryItem {
    private String issueNumber;
    private String month;
    private String category;


    public Magazine(String title,
                    String issueNumber, String month, String category) {
        super(title);
        this.issueNumber = issueNumber;
        this.month = month;
        this.category = category;
    }

    @Override
    public String getItemDetail() {
        return "Magazine{"+
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", availability=" + isAvailability() +
                "genre='" + issueNumber + '\'' +
                ", ISBN='" + month + '\'' +
                ", edition='" + category + '\'' +
                '}';
    }
}
