package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    ArrayList<Integer> newList;

    public OddNumbersExterminator(){
        newList = new ArrayList<Integer>();
    }

    public void exterminate(ArrayList<Integer> numbers){
        for(int n=0; n<numbers.size(); n++ ){
            Integer nextNumber = numbers.get(n);
            if(nextNumber % 2 == 0){
                newList.add(nextNumber);
            }
        }


    }

    public ArrayList<Integer> getNewList() {
        return newList;
    }
}
