package Lesson4;

import java.util.*;

public class MainClass {
    public static void main(String[] args){

      HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);

        HashSet<String> hashset2 = new HashSet<>();

        hashset2.add("random");
        hashset2.add("tooth brush");
        hashset2.add("computer");
        hashset2.add("cloths");


        ArrayList<Integer> myList = new ArrayList<>(hashSet);

        ArrayList<String> myList2 = new ArrayList<>(hashset2);


       Collections.sort(myList);
       Collections.sort(myList2);

       System.out.println(myList);
        System.out.println(myList2);


        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("Mike",3500,"Accounting"));
        employees.add(new Employee("John",2500,"maintainance"));
        employees.add(new Employee("Doe",4500,"IT"));
        employees.add(new Employee("Peter",3000,"Admin"));

        ArrayList<Employee> empList = new ArrayList<>(employees);
        Collections.sort(empList);
        System.out.println(empList);


    }
}
