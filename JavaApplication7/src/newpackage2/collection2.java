package newpackage2;
import java.util.*;
public class collection2 {
    public static void main(String[] args) {       
           Student e1 = new Student("a", 2000,10);
           Student e2 = new Student("b", 500,10);
           Student e3 = new Student("c", 1000,10);
           Student e4 = new Student("s", 9000,10);
           Student e5 = new Student("r", 1000,10);
           Student e6 = new Student("k", 2000,10);
           Student e7 = new Student("r", 500,10);
           Student e8 = new Student("l", 1000,10);
           Student e9 = new Student("j", 9000,10);
           Student e10 = new Student("w", 1000,10);
           Student e11 = new Student("henry", 2000,10);
           Student e12 = new Student("emma", 500,10);
           Student e13 = new Student("sophia", 1000,10);
           Student e14 = new Student("mia", 9000,10);
           Student e15 = new Student("krishna", 1000,10);
           Student e16 = new Student("radha", 2000,10);
           Student e17 = new Student("shiva", 500,10);
           Student e18 = new Student("malik", 1000,10);
           Student e19 = new Student("azeeba", 9000,10);
           Student e20 = new Student("shuba", 1000,10); 
           List<Student> l = new ArrayList<>();
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
class Student
{
    String name;
    Integer rollno;
    Integer cgpa;
    public Student(String n, Integer f, Integer g) {
           name = n;
           rollno = f;
           cgpa=g;           
    }
    @Override
    public String toString() {
           return "\n name=" + name + ",rollno=" + rollno + ",cgpa=" + cgpa ;
    }   
}
class sorting implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2)
    {
        return s1.rollno.compareTo(s2.rollno);
    }
}
    


