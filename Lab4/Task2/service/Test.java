package service;

import Shapes.Shape;

import java.util.List;

public class Test {

    public void drawAndGetArea(List<? extends Shape> list){
        for(Shape s:list){
            s.draw();
            System.out.println("Area is "+s.getArea());
        }

    }


}
