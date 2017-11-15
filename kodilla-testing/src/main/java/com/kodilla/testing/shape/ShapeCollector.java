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

    public boolean removeFigure(Shape shape){
        return false;
    }

    public Shape getFigure(int n){
        return null;

    }

    public int getListShapeQuantity(){
        return 0;
    }

    public Shape getShape() {
        return shape;
    }

}
