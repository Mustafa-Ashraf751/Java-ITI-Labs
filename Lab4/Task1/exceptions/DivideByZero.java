package Task1.exceptions;

import java.lang.RuntimeException;

public class DivideByZero extends RuntimeException {
  public DivideByZero() {
    super();
  }

  public DivideByZero(String error) {
    super(error);
  }

}