package student;

import java.util.ArrayList;

class Student_a{
    int id;
    String name;
    double attendance;
    Student_a(int id, String name, double attendance){
        this.id = id;
        this.name = name;
        this.attendance = attendance;
    }
}
public class Attendance {
    ArrayList<Student_a> students = new ArrayList<>();
    public void addStudent(int id, String name, double attendance){
        students.add(new Student_a(id, name, attendance));
    }
    public void display(){
        for(Student_a s : students){
            IO.println("Id: " + s.id);
            IO.println("Name: " + s.name);
            IO.println("Attendance: " + s.attendance);
        }
    }

}
