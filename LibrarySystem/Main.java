import entity.Book;
import entity.Client;
import entity.Magazine;
import exception.ItemNotFoundException;
import service.Library;
import service.LibraryClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library libraryItems = new Library();
        LibraryClient libraryClient = new LibraryClient(libraryItems);
        String strInput;           int choose=0;
        main_loop: while(true){
            try{
                System.out.println("Please choose option from below");
                System.out.println("1-CRUD clients\n2-CRUD Items\n3-Exist");
                strInput= scan.nextLine();
                choose = Integer.parseInt(strInput);
                switch (choose){
                    case 1:
                        System.out.println("1-create Client\n2-get all" +
                                " clients\n3-get client by id\n4-delete Client by " +
                                "Id\n5-Borrow a book\n6-Return book\n7-get books by user");
                        strInput = scan.nextLine();
                        choose = Integer.parseInt(strInput);
                        switch (choose){
                            case 1:
                                System.out.println("Please enter national id");
                                String clientID = scan.nextLine();
                                System.out.println("Please enter firstName: ");
                                String firstName = scan.nextLine();
                                System.out.println("Please enter lastName: ");
                                String lastName = scan.nextLine();
                                System.out.println("Please enter email: ");
                                String email = scan.nextLine();
                                Client c = new Client(Long.parseLong(clientID),firstName,lastName,email);
                                libraryClient.addClient(c);
                                break;
                            case 2:
                                libraryClient.getClients();
                                break;
                            case 3:
                                System.out.println("Please enter client id: ");
                                String id = scan.nextLine();
                                libraryClient.getClientById(Long.parseLong(id));
                                break;
                            case 4:
                                System.out.println("Please enter client id: ");
                                String deleteId = scan.nextLine();
                                libraryClient.deleteClientById(Long.parseLong(deleteId));
                                break;
                            case 5:
                                System.out.println("Please enter Item id: ");
                                String itemID = scan.nextLine();
                                System.out.println("Please enter user id: ");
                                String userID = scan.nextLine();
                                libraryClient.clientBorrow(itemID,Long.parseLong(userID));
                                break;
                            case 6:
                                System.out.println("Please enter Item id: ");
                                String itemIdDel = scan.nextLine();
                                System.out.println("Please enter user id: ");
                                String userIdDel = scan.nextLine();
                                libraryClient.clientBack(itemIdDel,Long.parseLong(userIdDel));
                                break;
                            case 7:
                                System.out.println("PLease enter user id");
                                String uid = scan.nextLine();
                                libraryClient.getBooksByUserId(Long.parseLong(uid));
                        }
                        break;
                    case 2:
                        System.out.println("1-CURD Books\n2-CURD magazine");
                        strInput = scan.nextLine();
                        choose = Integer.parseInt(strInput);
                        switch (choose){
                            case 1:
                                System.out.println("1-add book\n2-get Books\n3-get book by Id\n4-delete Book");
                                strInput = scan.nextLine();
                                choose = Integer.parseInt(strInput);
                                switch (choose){
                                    case 1:
                                        System.out.println("Enter book title: ");
                                        String title = scan.nextLine();
                                        libraryItems.validateString(title);
                                        System.out.println("Enter book genre: ");
                                        String genre = scan.nextLine();
                                        libraryItems.validateString(genre);
                                        System.out.println("Enter book ISBN: ");
                                        String ISBN = scan.nextLine();
                                        System.out.println("Enter book edition");
                                        String edition = scan.nextLine();
                                        Book book = new Book(title,genre,ISBN,edition);
                                        libraryItems.addItem(book);
                                        break;
                                    case 2:
                                        libraryItems.displayBooks();
                                        break;
                                    case 3:
                                        System.out.println("Please enter book Id");
                                        String bookId = scan.nextLine();
                                        libraryItems.getElementByID(bookId);
                                        break;
                                    case 4:
                                        System.out.println("Please enter book Id");
                                        String deleteId = scan.nextLine();
                                        libraryItems.deleteItem(deleteId);
                                    break;
                                    default:
                                        System.out.println("Invalid number option please try again");
                                }
                                break;
                            case 2:
                                System.out.println("1-add magazine\n2-get magazine\n3-get magazine by Id\n4-delete magazine");
                                strInput = scan.nextLine();
                                choose = Integer.parseInt(strInput);
                                switch (choose){
                                    case 1:
                                        System.out.println("Enter magazine title: ");
                                        String title = scan.nextLine();
                                        libraryItems.validateString(title);
                                        System.out.println("Enter book issueNumber: ");
                                        String issueNumber = scan.nextLine();
                                        System.out.println("Enter book month: ");
                                        String month = scan.nextLine();
                                        System.out.println("Enter book category");
                                        String category = scan.nextLine();
                                        libraryItems.validateString(category);
                                        Magazine magazine = new Magazine(title,issueNumber,month,category);
                                        libraryItems.addItem(magazine);
                                        break;
                                    case 2:
                                        libraryItems.displayMagazine();
                                        break;
                                    case 3:
                                        System.out.println("Please enter magazine Id");
                                        String bookId = scan.nextLine();
                                        libraryItems.getElementByID(bookId);
                                        break;
                                    case 4:
                                        System.out.println("Please enter magazine Id");
                                        String deleteId = scan.nextLine();
                                        libraryItems.deleteItem(deleteId);
                                        break;
                                    default:
                                        System.out.println("Invalid number option please try again");
                                }
                                break;
                            default:
                                System.out.println("Invalid number option please try again");
                        }
                        break;
                    case 3:
                        break main_loop;
                    default:
                        System.out.println("Invalid number option try again!");
                }
            }catch(NumberFormatException n){
                System.out.println("Invalid number format please try again");
            }catch(ItemNotFoundException i){
                System.out.println(i.getMessage());
            }catch(RuntimeException r){
                System.out.println(r.getMessage());
            }

        }
    }
}
