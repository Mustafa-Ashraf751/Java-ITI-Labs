package entity;

import exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println("Item with ID: "+ item.getId()+" added successfully");
    }

    public void displayItems(){
        for(LibraryItem item:items){
            System.out.println(item.getItemDetail());
        }
    }

    public void getElementByID(String id){
        Long input = Long.parseLong(id);
        boolean found = false;
        for(LibraryItem item:items){
            if(item.getId().equals(input)){
                item.getItemDetail();
                found = true;
                break;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Sorry item not found please try again");
        }
    }


    public void deleteItem(String id) throws ItemNotFoundException{
        Long input = Long.parseLong(id);
        boolean found = false;
        LibraryItem removedItem = null;
        for(LibraryItem item:items){
            if(item.getId().equals(input)){
                removedItem = item;
                found = true;
                break;
            }
        }
        if(found){
            items.remove(removedItem);
            System.out.println("Item deleted successfully!");
        }else {
            throw new ItemNotFoundException("Sorry item not found please try again");
        }
    }

}
