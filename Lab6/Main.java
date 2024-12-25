import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose = 0; String word;
      SimpleDictionaryApp app = new SimpleDictionaryApp();
      breakloop: while(true){
           try{
               System.out.println("Please choose a option");
               System.out.println("1-add word\n2-check word\n3-search " +
                       "for words by letter\n4-delete word\n5-Exist program");
               choose = Integer.parseInt(scanner.nextLine());
               switch (choose){
                   case 1:
                       System.out.println("Please enter a word to add");
                       word = scanner.nextLine();
                       app.validateString(word);
                       app.addWord(word);
                       break;
                   case 2:
                       System.out.println("Please enter a word to check");
                       word = scanner.nextLine();
                       app.validateString(word);
                       app.lookUpWord(word);
                       break;
                   case 3:
                       System.out.println("Please enter a letter to search");
                       word = scanner.nextLine();
                       app.validateString(word);
                       if(word.length()>1){
                           throw new IllegalArgumentException("Only character is allowed");
                       }else{
                           app.listWords(word);
                       }
                       break;
                   case 4:
                       System.out.println("Please enter a word to delete");
                       word = scanner.nextLine();
                       app.deleteWord(word);
                       break;
                   case 5:
                       break breakloop;
                   default:
                       System.out.println("Invalid number option try again");
               }
           }catch (NumberFormatException n){
               System.out.println(n.getMessage());
           }catch(IllegalArgumentException i){
               System.out.println(i.getMessage());
           } catch (StringIndexOutOfBoundsException e) {
               System.out.println("Invalid input please try again");
           }
       }


    }


}
