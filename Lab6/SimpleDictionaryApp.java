import java.util.*;

public class SimpleDictionaryApp {
    private TreeMap<String, SortedSet<String>> dictionary;

    public SimpleDictionaryApp(){
        dictionary = new TreeMap<>();
        SortedSet<String> wordsStartWithA = new TreeSet<>();
        wordsStartWithA.add("apple");
        wordsStartWithA.add("ant");
        wordsStartWithA.add("arrow");
        dictionary.put("a",wordsStartWithA);
        SortedSet<String> wordsStartWithB = new TreeSet<>();
        wordsStartWithB.add("bee");
        wordsStartWithB.add("book");
        wordsStartWithB.add("bat");
        dictionary.put("b",wordsStartWithB);
        SortedSet<String> wordsStartWithC = new TreeSet<>();
        wordsStartWithC.add("circle");
        wordsStartWithC.add("car");
        wordsStartWithC.add("cup");
        dictionary.put("c",wordsStartWithC);
    }


    public void lookUpWord(String word){
         for(Map.Entry<String,SortedSet<String>> entry:dictionary.entrySet()){
             String firstLetter = word.substring(0,1);
             if(entry.getKey().equals(firstLetter)){
                 if(entry.getValue().contains(word)){
                     System.out.println("The word is found successfully");
                     return;
                 };
             }
         }
        System.out.println("Sorry the word is not found in dictionary");
     }

     public void addWord(String word){
        boolean found = false;
         String firstLetter = word.substring(0,1);
         for(Map.Entry<String,SortedSet<String>> entry:dictionary.entrySet()){
             if(entry.getKey().equals(firstLetter)){
                 entry.getValue().add(word);
                 System.out.println("Word added to dictionary successfully");
                 found = true;
                 return;
             }
         }
         if(!found){
             String letter = word.substring(0,1);
             SortedSet<String> newSet = new TreeSet<>();
             newSet.add(word);
             dictionary.put(letter,newSet);
             System.out.println("Word added to dictionary successfully");
         }
     }

     public void listWords(String letter){
        for(Map.Entry<String,SortedSet<String>> entry:dictionary.entrySet()){
            if(entry.getKey().equals(letter)){
                System.out.println(dictionary.get(letter));
                return;
            }
        }
         System.out.println("No words Found with this letter yet!");
     }

     public void deleteWord(String word){
         String firstLetter = word.substring(0,1);
         for(Map.Entry<String,SortedSet<String>> entry:dictionary.entrySet()){
             if(entry.getKey().equals(firstLetter)){
                 entry.getValue().remove(word);
                 System.out.println("The word deleted successfully");
                 return;
             }
         }
     }

   public void validateString(String input){
        if(!input.matches("[a-zA-Z ]+"))
            throw new IllegalArgumentException("Invalid input only String is allowed");
   }

}
