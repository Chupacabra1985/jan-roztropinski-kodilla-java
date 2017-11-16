package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> listShape = new ArrayList<Shape>();

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }


    public void addFigure(Shape shape){
        listShape.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result =  false;
        if(listShape.contains(shape)){
            listShape.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if(n>=0 && n<listShape.size()){
            shape = listShape.get(n);
        }
        return shape;
    }

    public int getListShapeQuantity(){
        return listShape.size();
    }

}
