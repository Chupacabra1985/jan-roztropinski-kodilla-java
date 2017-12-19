package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPING:
                return new ShoppingTask("Shopping", "Chocolate", 3);
            case PAINTING:
                return new PaintingTask("Painting", "Red", "Wall");
            case DRIVING:
                return new DrivingTask("Driving", "Poznań", "Car");
                default:
                    return null;

        }
    }

}
