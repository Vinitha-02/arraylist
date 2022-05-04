import java.util.*;
import java.util.Comparator;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;

    }

    public int getRollno() {
        return rollno;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }
}

public class arraylist {
    public static void main(String args[]) {
        Student a = new Student(102, "Vijay", 14);
        Student a1 = new Student(103, "Arun", 15);
        Student a2 = new Student(101, "Vishali", 17);
        Student a3 = new Student(100, "priya", 16);
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(a);
        al.add(a1);
        al.add(a2);
        al.add(a3);

        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        Comparator<Student> cm1 = Comparator.comparing(Student::getRollno);
        Collections.sort(al, cm1);
        System.out.println("Sorting by Rollno");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        Comparator<Student> cm2 = Comparator.comparing(Student::getName);
        Collections.sort(al, cm2);
        System.out.println("Sorting by Name");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        Comparator<Student> cm3 = Comparator.comparing(Student::getAge);
        Collections.sort(al, cm3);
        System.out.println("Sorting by age");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        Collections.reverse(al);
        System.out.println("Reverse the list in the collection");
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}