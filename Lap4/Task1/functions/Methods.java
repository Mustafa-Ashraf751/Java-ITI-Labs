package Task1.functions;

import Task1.exceptions.DivideByZero;
import Task1.exceptions.ModuleByZero;
import Task1.exceptions.NegativeRootException;

public class Methods {

  public double divide(double num1,double num2) throws DivideByZero {
    if(num2 == 0){
      throw new DivideByZero("You can't divide by zero please try again");
    }
    return num1 / num2;
  }

  public int getModule(int num1,int num2) throws ModuleByZero {
    if(num2 == 0){
      throw new ModuleByZero("You can't get module by zero try again");
    }
    return num1 % num2;
  }

  public double getRoot(double num) throws NegativeRootException {
     if(num < 0){
      throw new NegativeRootException("You can't get the root for negative number");
     }
     return Math.sqrt(num);
  }

}
