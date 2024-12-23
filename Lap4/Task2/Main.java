import Shapes.Circle;
import Shapes.Rectangle;
import service.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Rectangle> arr = new ArrayList<>();
        arr.add(new Rectangle(10,5));
        arr.add(new Rectangle(20,10));

        ArrayList<Circle> arr2 = new ArrayList<>();
        arr2.add(new Circle(5));
        arr2.add(new Circle(8));

        Test t = new Test();
        t.drawAndGetArea(arr);
        t.drawAndGetArea(arr2);
    }


}
