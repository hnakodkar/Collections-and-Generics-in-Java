package com.company.Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");


//        for(String animal: animals){
//            System.out.println(animal);
//        }
//        for(int i=0; i<animals.size(); i++){
//            System.out.println(animals.get(i));
//        }


    List<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle2 = new Vehicle("Toyota","Camery",12000,false);
        Vehicle vehicle3 = new Vehicle("Jeep","wranggler", 25000, true);

        vehicles.add(new Vehicle("Honda","accord",12000,false));
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

//        for(Vehicle vehicle: vehicles){
//            System.out.println(vehicle);
//        }
        printElements(vehicles);
        printElements(animals);
    }

    public static void printElements(List someList){
        for(int i =0; i<someList.size(); i++){
            System.out.println(someList.get(i));


        }
    }


}