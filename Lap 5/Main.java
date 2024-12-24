
import task1.StringUtils;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        //Task1
        String str1 = "mustafa";
        String str2 = "mustafa ashraf";
         String longer = StringUtils.longerString(str1,str2,(s1,s2)->
                 s1.length()>s2.length());
        System.out.println(longer);

        //Task2
        String str = "smkwkfvn#985%w";
        char[] arr = str.toCharArray();
        boolean check = true;
        for(int i = 0;i<arr.length;i++){
            if(!Character.isLetter(arr[i])){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("str is a string");
        }else{
            System.out.println("str is not a string");
        }
    }
}
