package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String[] args){

        Object myObject = new Object();
        String myVar = "hello";
        myObject = myVar;
        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;


        ArrayList<Employee>employees1 = new ArrayList<>();
        ArrayList<Accountant> accountants1 = new ArrayList<>();
       // employees1 = accountants1;//doesnt work b/c types are different in generics its not allowed.

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<String> accountats2 = new ArrayList<>();
        employees2 = accountats2;//this one works b/c java its going to treat Employee as an object b/c it doesn't know what it is

        //upper bound (means only children of parent class(Employee) can go in this list
        ArrayList<? extends Employee>employees3 = new ArrayList<>();
        ArrayList<Accountant> accountats3 = new ArrayList<>();
        employees3 = accountats3;//this one is allowed b/c all children of Employee class can use this list

        //lower bound (means only parent class of Employee would go in the list
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Object>accountants4 = new ArrayList<>();
        employees4 = accountants4; // it works only when we change the type of Accountant to Object b/c object is a parent class of Employee


        //code for the makeEmployeeswork()
        ArrayList<Employee>employees = new ArrayList<>();
        ArrayList<Accountant>accountants = new ArrayList<>();
        employees.add(new Employee());
        accountants.add(new Accountant());

        makeEmployeesWork(accountants);



    }

    public static void makeEmployeesWork(List<? extends Employee> employees){
        for(Employee emp : employees){
            emp.work();
        }

    }



}
