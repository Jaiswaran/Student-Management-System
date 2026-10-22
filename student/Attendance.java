package student;

import java.util.ArrayList;
import java.util.Comparator;

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
            IO.println("--------------------------");
            IO.println("Id: " + s.id);
            IO.println("Name: " + s.name);
            IO.println("Attendance: " + s.attendance);
            IO.println("--------------------------");
        }
    }
    public void debarList(){
        for(Student_a s : students){
            if(s.attendance < 75){
                IO.println("Debared Status: ");
                IO.println("--------------------------");
                IO.println("Id: " + s.id);
                IO.println("Name: " + s.name);
                IO.println("Attendance: " + s.attendance);
                IO.println("--------------------------");
            }
        }
    }
    public void searchAttendanceById(int id){
        students.sort(Comparator.comparingInt(s -> s.id));

        int low = 0;
        int high = students.size() - 1;
        boolean found = false;
        while(low <= high){
            int mid = (low + high)/2;
            if(students.get(mid).id == id){
                System.out.println("Found !");
                System.out.println("Student Details :");
                IO.println("Id: " + students.get(mid).id);
                IO.println("Name: " + students.get(mid).name);
                IO.println("Marks: " + students.get(mid).attendance);
                found = true;
                break;
            }else if(students.get(mid).id < id){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(!found){
            System.out.println(id + " Not Found");
        }
    }
    public void highestAttendance(){
        IO.println("Full Attendance Scorers:");
        for(Student_a s : students){
            if(s.attendance == 100){
                IO.println("----------------------------");
                IO.println("Id: " + s.id);
                IO.println("Name: " + s.name);
                IO.println("----------------------------");
            }
        }
    }
    
}
