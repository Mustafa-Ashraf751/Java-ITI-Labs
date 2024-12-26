package service;

import entity.Client;
import entity.LibraryItem;
import exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryClient {
    private List<Client> clients = new ArrayList<>();
    private Library library;

    public LibraryClient(Library library) {
        this.library = library;
    }

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
            throw new ItemNotFoundException("Client",String.valueOf(id));
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
            throw new ItemNotFoundException("Client",String.valueOf(id));
        }
    }

    public void clientBorrow(String id,Long clientId) throws ItemNotFoundException{
        this.library.borrowItem(id);
        Client client = null;
        for(Client c : clients){
            if(c.getNationalId().equals(clientId)){
                client = c;
            }
        }
        if(client == null){
            throw new ItemNotFoundException("Client",String.valueOf(clientId));
        }
       List<LibraryItem> items = client.getItems();
        LibraryItem item = library.returnElementById(id);
        items.add(item);
        client.setItems(items);
        System.out.println("Item added to user successfully");
    }

    public void clientBack(String id,Long clientId){
        library.returnBook(id);
        Client client = null;
        for(Client c : clients){
            if(c.getNationalId().equals(clientId)){
                client = c;
            }
        }
        if(client==null){
            throw new ItemNotFoundException("Client",String.valueOf(clientId));
        }
        List<LibraryItem> items = client.getItems();
        LibraryItem item = library.returnElementById(id);
        items.remove(item);
        client.setItems(items);
        System.out.println("Item deleted from user successfully");
    }

    public void getBooksByUserId(Long id){
          clients.stream()
                .filter(client->client.getNationalId().equals(id))
                .map(Client::getItems)
                .forEach(System.out::println);

    }

}
