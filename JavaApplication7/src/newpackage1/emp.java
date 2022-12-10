package newpackage1;

import java.util.*;

public class emp {
    public static void main(String[] args) {
           Employee e1 = new Employee("ank", 2000);
           Employee e2 = new Employee("dav", 500);
           Employee e3 = new Employee("banu", 1000);
           Employee e4 = new Employee("sam", 9000);
           Employee e5 = new Employee("riya", 1000);
           Employee e6 = new Employee("kushi", 2000);
           Employee e7 = new Employee("ravi", 500);
           Employee e8 = new Employee("liam", 1000);
           Employee e9 = new Employee("james", 9000);
           Employee e10 = new Employee("william", 1000);
           Employee e11 = new Employee("henry", 2000);
           Employee e12 = new Employee("emma", 500);
           Employee e13 = new Employee("sophia", 1000);
           Employee e14 = new Employee("mia", 9000);
           Employee e15 = new Employee("krishna", 1000);
           Employee e16 = new Employee("radha", 2000);
           Employee e17 = new Employee("shiva", 500);
           Employee e18 = new Employee("malik", 1000);
           Employee e19 = new Employee("azeeba", 9000);
           Employee e20 = new Employee("shuba", 1000);
 
           List<Employee> l = new ArrayList<>();
           l.add(e1);
           l.add(e2);
           l.add(e3);
           l.add(e4);
           l.add(e5);
           l.add(e6);
           l.add(e7);
           l.add(e8);
           l.add(e9);
           l.add(e10);
           l.add(e11);
           l.add(e12);
           l.add(e13);
           l.add(e14);
           l.add(e15);
           l.add(e16);
           l.add(e17);
           l.add(e18);
           l.add(e19);
           l.add(e20);
        Collections.sort(l, new sorting());
        System.out.println(l);
        }
        
    }

class Employee
{
    String name;
    Integer salary;
   
 
    public Employee(String n, Integer f) {
           name = n;
           salary = f;
           
    }
    @Override
    public String toString() {
           return "\n name=" + name + ",salary=" + salary ;
    }
    
}

class sorting implements Comparator<Employee>
{
    @Override
    public int compare(Employee s1,Employee s2)
    {
        return s2.name.compareTo(s1.name);
    }
}
