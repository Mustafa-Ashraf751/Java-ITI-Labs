public class Complex<T extends Number> {
    T real;
    T img;

    public Complex(T real, T img) {
        this.real = real;
        this.img = img;
    }

    public T getReal() {
        return real;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public T getImg() {
        return img;
    }

    public void setImg(T img) {
        this.img = img;
    }

    public Complex<Double> sum(Complex<? extends Number> o){
        Double real = this.getReal().doubleValue()+o.getReal().doubleValue();
        Double img = this.getImg().doubleValue()+o.getImg().doubleValue();
        return new Complex<>(real,img);
    }

    public Complex<Double> subtract(Complex<? extends Number> o){
        Double real = this.getReal().doubleValue()-o.getReal().doubleValue();
        Double img = this.getImg().doubleValue()-o.getImg().doubleValue();
        return new Complex<>(real,img);
    }

    public Complex<Double> multiply(Complex<? extends Number> o){
        double a = this.getReal().doubleValue();
        double b = this.getImg().doubleValue();
        double c = o.getReal().doubleValue();
        double d = o.getImg().doubleValue();
        double newReal = (a*c) - (b*d);
        double newImg = (a*d) + (b*c);
        return new Complex<>(newReal,newImg);
    }

    public Complex<Double> divide(Complex<? extends Number> o){
        double a = this.getReal().doubleValue();
        double b = this.getImg().doubleValue();
        double c = o.getReal().doubleValue();
        double d = o.getImg().doubleValue();
        double divideBy = (c*c)+(d*d);
        if(divideBy == 0){
            throw new ArithmeticException("You can't divide by zero");
        }
        double newReal = ((a*c) + (b*d))/divideBy;
        double newImg = ((b*c) - (a*d))/divideBy;
        return new Complex<>(newReal,newImg);
    }

    @Override
    public String toString() {
        return this.getReal() +" + "+this.getImg()+" i";
    }
}
