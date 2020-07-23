package Lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    public static void main(String[] args){
        HashSet<Integer> values = new HashSet<>();

        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        values.add(43);


        HashSet<String> words = new HashSet<>();
        words.add("random");
        words.add("animal");
        words.add("people");
        words.add("person");
        words.add("random");
        words.add("random");

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("random");
        names.add("animal");
        names.add("people");
        names.add("zoo");
        names.add("car");
        names.add("car");
        names.add("random");

        HashSet<Animal> animals = new HashSet<>();
         Animal animal1 = new Animal("dog", 12);
         Animal animal2 = new Animal("cat",10);
         Animal animal3 = new Animal("kangroo",15);
         Animal animal4 = new Animal("dog", 12);
         Animal animal5 = new Animal("bird", 5);


        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);


        for(Animal animal : animals){
            System.out.println(animal);
        }



//        for(Integer value: values){
//            System.out.println(value);
//        }
//        System.out.println("printing the elements of words: ");
//        for(String word : words){
//            System.out.println(word);
//        }
//
//
//        System.out.println("printing the elemnts of names");
//        for(String name : names){
//            System.out.println(name);
//        }


    }
}






//set is used to prevent duplicates
//set does not print its elements in order
// if you want to print your elements in order than use linkedHashSet