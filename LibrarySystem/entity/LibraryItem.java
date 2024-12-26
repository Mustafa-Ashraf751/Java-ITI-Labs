package entity;

import java.util.UUID;

public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean availability;

    public LibraryItem(String title) {
        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.title = title;
        this.availability = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public abstract String getItemDetail();
}
