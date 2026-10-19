package student;
import java.util.ArrayList;
import java.util.Comparator;


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
    ArrayList<Student> students = new ArrayList<>(); // Contaains id, name, marks
    
    public void addStudent(int id, String name, int marks){
        students.add(new Student(id, name, marks));
    }
    //Display the students in the arraylist
    public void display(){
        // Sort the arraylist on basis of ID's
        students.sort(Comparator.comparingInt(s -> s.id));
        for(Student s : students){
            System.out.println("ID: " + s.id + " Name: " + s.name + " Marks: " + s.marks);
        }
    }
    // Implemented Binary Search
    // Time Complexity = O(logn)
    public void searchById(int id){
        // Sort the arraylist on basis of ID's
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
                IO.println("Marks: " + students.get(mid).marks);
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
    //Delete Student by Id
    public void delete(int id){
        for(Student s : students){
            if(s.id == id){
                students.remove(s);
                IO.println(s.id + " Removed sucessfully");
                return;
            }
        }
        IO.println("Not Found");
    }
    //Get the highest Marks
    public void highestMarkStudent(){
        int highestMark = 0;
        
        
        for(Student s : students){
            if(s.marks > highestMark){
                highestMark = s.marks;
            }
            if(s.marks == highestMark){
                IO.println(s.name + " got the highest marks " + s.marks);
                IO.println();
            }
        }
    }
    //Get the class Average
    public void classAvg(){
        int count = students.size();
        int sum = 0;
        
        for(Student s : students){
            sum = sum + s.marks;
        }
        int avg = sum / count;
        System.out.println("Class Average is: " + avg);
    }
    // Used to compute the Mean, Variance, Standard Deviation, Pass Percentage.
    public void statistics(){
        double total = students.size();
        double sum = 0;
        
        for(Student s : students){
            sum = sum + s.marks;
        }
        double avg = sum / total;

        double var_num = 0;
        for(Student s : students){
            var_num = var_num + (s.marks - avg) * (s.marks - avg);
        }
        double var = var_num / total;
        double sd_deviation = Math.sqrt(var);
        IO.println("Statistics");
        System.out.printf("Variance: %.5f\n", var);
        System.out.printf("Mean: %.5f\n", avg);
        System.out.printf("Standard Deviation: %.5f\n", sd_deviation);

        double no_of_students = students.size();
        double pass_marks = 40; // 40 marks is the pass mark.
        double passed = 0; // Number of students passed the exam.
        for(Student s : students){
            if(s.marks >= pass_marks){
                passed++;
            }
        }
        double not_passed = no_of_students - passed;
        double pass_percent = (passed / no_of_students) * 100;
        double fail_percent = (not_passed / no_of_students) * 100;

        IO.println("Pass Percentage is: " + pass_percent);
        IO.println("Fail Percentage is: " + fail_percent);


    }
}
