package Task1;

import Task1.functions.Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Methods m = new Methods();
        Scanner scan = new Scanner(System.in);
        double input = 0.0;
        double input2 = 0.0;
        int choose = 0;
        while (flag) {
            try {
                System.out.println("Please choose operation\n1-divide\n2-module\n3-root\n4-exit");
                String chooseNumber = scan.nextLine();
                choose = Integer.parseInt(chooseNumber);
                String strInput;
                switch (choose) {
                    case 1:
                        System.out.println("Please enter first number");
                        strInput = scan.nextLine();
                        input = Double.parseDouble(strInput);
                        System.out.println("Please enter second number");
                        strInput = scan.nextLine();
                        input2 = Double.parseDouble(strInput);
                        System.out.println(m.divide(input, input2));
                        break;
                    case 2:
                        System.out.println("Please enter first number");
                        strInput = scan.nextLine();
                        input = Double.parseDouble(strInput);
                        System.out.println("Please enter second number");
                        strInput = scan.nextLine();
                        input2 = Double.parseDouble(strInput);
                        System.out.println(m.getModule((int) input, (int) input2));
                        break;
                    case 3:
                        System.out.println("Please enter a number");
                        strInput = scan.nextLine();
                        input = Double.parseDouble(strInput);
                        System.out.println(m.getRoot(input));
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid input please try again");
                }
                flag = false;
            } catch (NumberFormatException n) {
                System.out.println("Invalid input please enter a number");
            } catch (RuntimeException r) {
                System.out.println(r.getMessage());
            }
        }
    }

}
