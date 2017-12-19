package com.kodilla.patterns.factory.tasks;

import java.time.LocalDate;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "I'm painting: " + whatToPaint + " color: " + color;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
     if ( LocalDate.now().isAfter(LocalDate.of(2017, 12, 18))){
         return true;
       }else{
         return false;
       }
     }
}