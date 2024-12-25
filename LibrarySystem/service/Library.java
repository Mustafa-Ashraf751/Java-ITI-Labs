package service;

import entity.Book;
import entity.LibraryItem;
import entity.Magazine;
import exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println("Item with ID: "+ item.getId()+" added successfully");
    }

    public void displayBooks() throws RuntimeException{
        if(items.isEmpty()){
            throw new RuntimeException("No magazine to display");
        }
        for(LibraryItem item:items){
            if(item instanceof Book){
                System.out.println(item.getItemDetail());
            }

        }
    }

    public void displayMagazine() throws RuntimeException{
        if(items.isEmpty()){
            throw new RuntimeException("No magazine to display");
        }
        for(LibraryItem item:items){
            if(item instanceof Magazine){
                System.out.println(item.getItemDetail());
            }

        }
    }

    public void getElementByID(String id) throws ItemNotFoundException{
        boolean found = false;
        for(LibraryItem item:items){
            if(item.getId().equals(id)){
                System.out.println(item.getItemDetail());
                found = true;
                break;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Item",Long.parseLong(id));
        }
    }

    public LibraryItem returnElementById(String id) throws ItemNotFoundException{
        boolean found = false;
        for(LibraryItem item:items){
            if(item.getId().equals(id)){
                return item;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Item",Long.parseLong(id));
        }
        return null;
    }


    public void deleteItem(String id) throws ItemNotFoundException{
        boolean found = false;
        LibraryItem removedItem = null;
        for(LibraryItem item:items){
            if(item.getId().equals(id)){
                removedItem = item;
                found = true;
                break;
            }
        }
        if(found){
            items.remove(removedItem);
            System.out.println("Item deleted successfully!");
        }else {
            throw new ItemNotFoundException("Item",Long.parseLong(id));
        }
    }

    public void borrowItem(String id) throws ItemNotFoundException{
        boolean found = false;
        for(LibraryItem item:items){
            if(item.getId().equals(id)){
                if(!item.isAvailability()){
                    throw new RuntimeException("Sorry item is not available now");
                }
                item.setAvailability(false);
                found = true;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Item",Long.parseLong(id));
        }
    }
}
