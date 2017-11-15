package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> listShape = new ArrayList<Shape>();
    private Shape shape;

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }

    public void addFigure(Shape shape){

    }

    public void removeFigure(Shape shape){

    }

    public Shape getFigure(int n){
        return 0;

    }

    public int getListShapeQuantity(){
        return 0;
    }

    public Shape getShape() {
        return shape;
    }

}
