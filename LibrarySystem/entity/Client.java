package entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private List<LibraryItem> items;

    public Client(Long nationalId, String firstName, String lastName, String email) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.items = new ArrayList<>();
    }

    public Long getNationalId() {
        return nationalId;
    }

    public void setNationalId(Long nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public void setItems(List<LibraryItem> items) {
        this.items = items;
    }

    public String getClientDetails(){
        return "Client{" +
                "nationalId=" + nationalId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", items=" + items+
                '}';
    }


}
