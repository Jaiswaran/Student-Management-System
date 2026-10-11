package student;
import java.util.*;

class Student{
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
}

public class StudentDetails{
    ArrayList<Student> students = new ArrayList<>();
    public void addStudent(int id, String name, int marks){
        students.add(new Student(id, name, marks));
    }
    public void display(){
        for(Student s : students){
            System.out.println("ID: " + s.id + " Name: " + s.name + " Marks: " + s.marks);
        }
    }
    public void searchById(int id){
        boolean ans = false;
        for(Student s : students){
            if(s.id == id){
                System.out.println("ID: " + s.id + " Name: " + s.name + " Marks: " + s.marks);
                ans = true;
            }
        }
        if(ans == false){
            System.out.println("Not Found");
        }
    }
}
