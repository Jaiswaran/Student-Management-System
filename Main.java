import java.util.*;
import student.*;

public class Main{
    public static void main(String[] args) {
        
        boolean lock = true; //lock is designed to exit the program in the while loop
        StudentDetails s = new StudentDetails();
        Attendance a = new Attendance();
        //Some students are added in Student Detail Class
        s.addStudent(156, "Jai", 95);
        s.addStudent(101, "Rohan", 90);
        s.addStudent(105, "Rahul", 95);
        s.addStudent(150, "Alex", 70);
        s.addStudent(804, "Amaran", 60);
        s.addStudent(630, "Bishnoi", 20);
        s.addStudent(890, "Rajendra", 10);
        s.addStudent(950, "Hari", 26);
        s.addStudent(606, "Smith", 40);
        s.addStudent(703, "Rossie", 35);
        s.addStudent(107, "James", 50);
        s.addStudent(560, "Kamala", 5);

        a.addStudent(156, "Jai", 95);
        a.addStudent(101, "Rohan", 90.56);
        a.addStudent(105, "Rahul", 20.58);
        a.addStudent(150, "Alex", 56.8);
        a.addStudent(804, "Amaran", 75.623);
        a.addStudent(630, "Bishnoi", 45.6);
        a.addStudent(890, "Rajendra", 89.563);
        IO.println("Student Management: ");
        try{
            while(lock){
            IO.println();
            IO.println("Choose the method: ");
            IO.println("1. Add StudentDetails ");
            IO.println("2. Display StudentDetails");
            IO.println("3. Search By Student Id");
            IO.println("4. Delete Student By Id");
            IO.println("5. Search the highest mark");
            IO.println("6. Get the Average Marks");
            IO.println("7. Get Statistics");
            IO.println("8. Attendance");
            IO.println("9. Exit");
            IO.println();
            Scanner sc = new Scanner(System.in);
            int user_in = sc.nextInt();
            
            switch(user_in){
                
                case 1:
                    IO.println("Enter Id: "); 
                    int id = sc.nextInt();
                    IO.println("Enter Name: ");
                    String name = sc.next();  
                    IO.println("Enter marks: ");
                    int marks = sc.nextInt();
                    
                    s.addStudent(id, name, marks);
                    break;

                case 2:
                    s.display();
                    break;
                case 3:
                    IO.println("Enter Id: ");
                    int id_2 = sc.nextInt();
                    s.searchById(id_2);
                    break;

                case 4:
                    IO.println("Enter Id: ");
                    int id_3 = sc.nextInt();
                    s.delete(id_3);
                    break;

                case 5:
                    s.highestMarkStudent();
                    break;
            
                case 6:
                    s.classAvg();
                    break;
                
                case 7:
                    s.statistics();
                    break;
                case 8:
                    boolean l = true;
                    while(l){
                        IO.println("Selct Options: ");
                        IO.println("1. Add Students");
                        IO.println("2. Display Students");
                        IO.println("3. Exit");
                        int user_choice = sc.nextInt();
                        switch(user_choice){
                            case 1:
                                IO.println("Enter Id: ");
                                int id_a = sc.nextInt();
                                IO.println("Enter Name: ");
                                String name_a = sc.next();
                                IO.println("Enter Attendance: ");
                                double attendance = sc.nextDouble();
    
                                a.addStudent(id_a, name_a, attendance);
                                break;
                            case 2:
                                a.display();
                                break;
                            case 3:
                                IO.println("Exited From Attendance Module");
                                l = false;
                                break;
                        } 
                    }
                    break;
                case 9:
                    lock = false;
                    System.out.println("Exited Successfully !");
                    break;

            }
            }
        }catch(Exception e){
            System.out.println("Try again and enter a valid answer");
        }
        
      
    }
}