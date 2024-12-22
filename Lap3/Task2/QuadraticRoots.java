package Task2;
import java.util.function.Function;
import java.lang.Math;
import java.util.Scanner;
public class QuadraticRoots implements Function<Double[],String[]>{
	
	@Override
	public String[] apply(Double[] array){
		if(array.length!=3){
			throw new RuntimeException("Invalid size please enter 3 elements");
		}
		String[] arrResult = new String[2];
		double a = array[0];
        double b = array[1];
      	double c = array[2];
		double underRoot = b*b-4*a*c;
		if(underRoot < 0){
		underRoot = underRoot * - 1;
		String result = -b/ 2 * a +" + "+Math.sqrt(underRoot) / 2 * a+" i";
		String result2 = -b/ 2 * a +" - "+Math.sqrt(underRoot) / 2 * a+" i";
		arrResult[0] = result;
		arrResult[1] = result2;
		}else{
		double result = (-b+Math.sqrt(underRoot)) / 2 * a;
		double result2 = (-b-Math.sqrt(underRoot)) / 2 * a;
		arrResult[0]=String.valueOf(result);
		arrResult[1]=String.valueOf(result2);
		}
		return arrResult;
	};
	
	public void startApp(){
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			try{
			System.out.println("Please enter first  paramter of equation: ");
			double a = scan.nextDouble();
			if(a==0){
				throw new RuntimeException();
			}
			System.out.println("Please enter second  paramter of equation: ");
			double b = scan.nextDouble();
			System.out.println("Please enter third  paramter of equation: ");
			double c = scan.nextDouble();
			 scan.nextLine(); 
			Double[] inputArray = new Double[3];
			inputArray[0] = a;
			inputArray[1] = b;
			inputArray[2] = c;
			String[] roots = apply(inputArray);
			System.out.println("First root is "+roots[0]);
			System.out.println("Second root is "+roots[1]);
		     flag = false;
			}catch(Exception e){
				scan.nextLine();
				System.out.println("Invalid input please try again!");
			}
		
	}
	}
	
	
}