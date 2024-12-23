public class Main {
    public static void main(String[] args) {
        Complex<Double> c = new Complex<>(5.5,10.9);
         try{
             System.out.println(c.sum(new Complex<>(6.7,8.5)));
             System.out.println(c.multiply(new Complex<>(6.7,8.5)));
             System.out.println(c.divide(new Complex<>(6.7,8.5)));
             System.out.println(c.subtract(new Complex<>(6.7,8.5)));
         }catch (ArithmeticException a){
             System.out.println(a.getMessage());
         }


    }


}
