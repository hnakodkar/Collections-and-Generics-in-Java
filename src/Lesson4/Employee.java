package Lesson4;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.salary< employee.salary ){
            return -1;
        }
        else if(this.salary > employee.salary){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
