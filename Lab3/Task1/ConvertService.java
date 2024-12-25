package Task1;
import java.util.Scanner;
public class ConvertService{
	
	public void startConvert(){
		
	boolean flag = true;
	Scanner scan = new Scanner(System.in);
	while(flag){
	try{
		System.out.println("Please choose one option from below: ");
		System.out.println("1-convert temp to c \n2-convert temp to f \n3-quit the program");
	    String input = scan.nextLine(); 
		int choose = Integer.parseInt(input);
		switch(choose){
			case 1:
			System.out.println("Please enter a number to convert: ");
			String input2 = scan.nextLine();
			double number = Double.parseDouble(input2);
			ConvertTempToC c = new ConvertTempToC();
			System.out.println("The new temp is  :"+c.apply(number));
			break;
			case 2:
			System.out.println("Please enter a number to convert: ");
			String input3 = scan.nextLine();
			double number2 = Double.parseDouble(input3);
			ConvertTempToF f = new ConvertTempToF();
			System.out.println("The new temp is  :"+f.apply(number2));
			break;
			case 3:
			flag = false;
		}
	
	}catch(NumberFormatException e){
		flag = true;
	}
	}
	}
	
	
}