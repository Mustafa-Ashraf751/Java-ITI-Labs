import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.StringTokenizer;

public class Task3{

public static int findNumberOne(String text,String word){
	int counter = 0;
	String[] arr =  text.split(" ");
	for(int i = 0;i<arr.length;i++){
		if(arr[i].equals(word)){
			counter++;
		}
	}
	return counter;
}

public static int findNumberTwo(String text,String word){
	int counter = 0;
	String regex = "\\b"+word+"\\b";
	Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
	while(matcher.find()){
	counter++;
	}
	return counter;
}

public static int findNumberThree(String text,String word){
	int count = 0;
 StringTokenizer str = new  StringTokenizer(text , " ");
 while(str.hasMoreTokens()){
	   String token = str.nextToken();
	   if(token.equals(word)){
	   count++;}
 }
return count; 
}

public static void validateAndPrintIP(String text){
	String regex="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
	Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
	if(matcher.matches()){
		String[] arr = text.split("\\.");
		for(String s:arr){
			System.out.println(s);
		}
	}else{
		System.out.println("Sorry Invalid ip format");
	}
}

public static void main(String args[]){
 String sentence = "ITI develops people and ITI house of developers and ITI for people";
  int index = findNumberThree(sentence,"ITI");
  if(index!=0){
	  System.out.println("The word found  "+index+" times"); 
  }else{
	  System.out.println("Word not found");
  }
   
  
  
   validateAndPrintIP("192.168.1.1");
   validateAndPrintIP("9999.999.9999.1");
  
}


}