package Task1.exceptions;

public class ModuleByZero extends RuntimeException {
   public ModuleByZero(){
        super();
    }

    public ModuleByZero(String error){
        super(error);
    }

}
