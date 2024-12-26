package service;

import entity.Book;
import entity.LibraryItem;
import entity.Magazine;
import exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println("Item with ID: "+ item.getId()+" added successfully");
    }

    public void displayBooks() throws RuntimeException{
        if(items.isEmpty()){
            throw new RuntimeException("No Books to display");
        }
       /* for(LibraryItem item:items){
            if(item instanceof Book){
                System.out.println(item.getItemDetail());
            }
        }*/
        items.stream()
                .filter(item->item instanceof Book)
                .forEach(System.out::println);
    }

    public void displayMagazine() throws RuntimeException{
        if(items.isEmpty()){
            throw new RuntimeException("No magazine to display");
        }
      /*  for(LibraryItem item:items){
            if(item instanceof Magazine){
                System.out.println(item.getItemDetail());
            }
        }*/
        items.stream()
                .filter(item->item instanceof Magazine)
                .forEach(System.out::println);
    }

    public void getElementByID(String id) throws ItemNotFoundException{
       // boolean found = false;
       /* for(LibraryItem item:items){
            if(item.getId().equals(id)){
                System.out.println(item.getItemDetail());
                found = true;
                break;
            }
        }*/
        items.stream()
                .filter(item->item.getId().equals(id))
                .forEach(item->System.out.println(item.getItemDetail()));
        Optional<LibraryItem> found = items.stream()
                .filter(item->item.getId().equals(id)).findFirst();
        if(found.isEmpty()){
            throw new ItemNotFoundException("Item",id);
        }
    }

    public LibraryItem returnElementById(String id) throws ItemNotFoundException{
      /*  boolean found = false;
        for(LibraryItem item:items){
            if(item.getId().equals(id)){
                return item;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Item",id);
        }
        return null;*/
        Optional<LibraryItem> found = items.stream()
                .filter(item->item.getId().equals(id)).findFirst();
        if(found.isEmpty()){
            throw new ItemNotFoundException("Item",id);
        }
        return found.get();
    }


    public void deleteItem(String id) throws ItemNotFoundException{
       // boolean found = false;
        //LibraryItem removedItem = null;
        /*for(LibraryItem item:items){
            if(item.getId().equals(id)){
                removedItem = item;
                found = true;
                break;
            }
        }*/
        Optional<LibraryItem> found = items.stream()
                .filter(item->item.getId().equals(id)).findFirst();
        if(found.isPresent()){
            items.remove(found.get());
            System.out.println("Item deleted successfully!");
        }else {
            throw new ItemNotFoundException("Item",id);
        }
    }

    public void borrowItem(String id) throws ItemNotFoundException{
      /*  boolean found = false;
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
            throw new ItemNotFoundException("Item",id);
        }*/
        Optional<LibraryItem> found = items.stream()
                .filter(item->item.getId().equals(id)).findFirst();
        if(found.isPresent()){
            if(!found.get().isAvailability()){
                throw new RuntimeException("Sorry item is not available now");
            }
            found.get().setAvailability(false);
        }else {
            throw new ItemNotFoundException("Item",id);
        }
    }


    public void returnBook(String id){
      /*  boolean found = false;
        for(LibraryItem item:items){
            if(item.getId().equals(id)){
                item.setAvailability(true);
                found = true;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Item",id);
        }*/
        Optional<LibraryItem> found = items.stream()
                .filter(item->item.getId().equals(id)).findFirst();
        if(found.isPresent()){
            found.get().setAvailability(true);
        }else {
            throw new ItemNotFoundException("Item",id);
        }
    }
    public void validateString(String input){
        if(!input.matches("[a-zA-Z ]+"))
            throw new IllegalArgumentException("Invalid input only String is allowed");
    }

}
