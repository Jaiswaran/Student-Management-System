package student;
import java.util.ArrayList;

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
        for(Student s : students){
            if(s.id == id){
                System.out.println("ID: " + s.id + " Name: " + s.name + " Marks: " + s.marks);
                return;
            }
        }
        IO.println("Not Found");
    }
    public void delete(int id){
        for(Student s : students){
            if(s.id == id){
                students.remove(s);
                IO.println(s.id + "Removed sucessfully");
                return;
            }
        }
        IO.println("Not Found");
    }
    public void highestMarks(){
        int highestMarks = 0;
        String name = "";
        for(Student s : students){
            if(s.marks > highestMarks){
                highestMarks = s.marks;
                name = s.name;
            }
        }
        System.out.println(name + " got the highest marks: " + highestMarks);
    }
}
