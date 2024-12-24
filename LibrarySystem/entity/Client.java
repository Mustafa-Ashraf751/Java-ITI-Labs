package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long nationalId;
    private String firstName;
    private String lastName;
    private String address;
    private List<Book> books;
    private List<Magazine> magazines;

    public Client(Long nationalId, String firstName, String lastName, String address) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.books = new ArrayList<>();
        this.magazines = new ArrayList<>();
    }
}
