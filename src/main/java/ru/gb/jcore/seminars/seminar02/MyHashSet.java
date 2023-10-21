package ru.gb.jcore.seminars.seminar02;

import java.util.HashSet;
import java.util.Random;

public class MyHashSet {

    private static HashSet<Integer> myHashSet = new HashSet<>();

    public static void add(int value){
        myHashSet.add(value);

    }
    public static boolean delete(int value){
    if(myHashSet.contains(value)){
        myHashSet.remove(value);
        return true;
    }
       return false;
    }
    public static boolean isValue(int value){
        return myHashSet.contains(value);
//        int size = myHashSet.size();
//        add(value);
//        if(size != myHashSet.size()){
//            return false;
//        }
//        delete(value);
//        return true;
    }


    public static int findRandomValue(){
        int size = myHashSet.size();
        Integer[] arr = myHashSet.toArray(new Integer[myHashSet.size()]);
        return arr[new Random().nextInt(myHashSet.size())];
    }
}
