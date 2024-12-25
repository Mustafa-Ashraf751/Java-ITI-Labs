package service;

import entity.Client;
import entity.LibraryItem;
import exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class LibraryClient {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client){
        for(Client c : clients){
            if(c.getNationalId().equals(client.getNationalId())){
                throw new RuntimeException("Sorry this id is already exist please enter another one");
            }
        }
        clients.add(client);
        System.out.println("Client added successfully!");
    }

    public void getClients(){
        if(clients.isEmpty()){
            System.out.println("No Clients please add some of clients");
            return;
        }
        for(Client c:clients){
            System.out.println(c.getClientDetails());
        }
    }

    public void getClientById(Long id)throws ItemNotFoundException{
        boolean found = false;
        if(clients.isEmpty()){
            System.out.println("No Clients please add some of clients");
            return;
        }
        for(Client c : clients){
            if(c.getNationalId().equals(id)){
                System.out.println(c.getClientDetails());
                found = true;
                break;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Client",id);
        }
    }

    public void deleteClientById(Long id) throws ItemNotFoundException{
        boolean found = false;
        Client removedClient = null;
        if(clients.isEmpty()){
            System.out.println("No Clients to delete please add some of clients");
            return;
        }
        for(Client c:clients){
            if(c.getNationalId().equals(id)){
                removedClient = c;
                found=true;
                break;
            }
        }
        if(found){
            clients.remove(removedClient);
            System.out.println("Client removed successfully!");
        }else{
            throw new ItemNotFoundException("Client",id);
        }
    }

    public void clientBorrow(String id,Long clientId) throws ItemNotFoundException{
        Library library = new Library();
        library.borrowItem(id);
        Client client = null;
        boolean found = false;
        for(Client c : clients){
            if(c.getNationalId().equals(clientId)){
                client = c;
                found = true;
            }
        }
        if(!found){
            throw new ItemNotFoundException("Client",clientId);
        }
        List<LibraryItem> items = client.getItems();
        LibraryItem item = library.returnElementById(id);
        items.add(item);
        client.setItems(items);
        System.out.println("Item added to user successfully");
    }

}
