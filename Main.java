import java.util.*;
import student.*;

public class Main{
    public static void main(String[] args) {
        //lock is designed to exit the program in the while loop
        boolean lock = true;
        StudentDetails s = new StudentDetails();
        //Some students are added
        s.addStudent(156, "Jai", 80);
        s.addStudent(101, "Rohan", 90);
        s.addStudent(105, "Rahul", 100);
        s.addStudent(150, "Alex", 70);
        s.addStudent(50, "Priya", 60);
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
            IO.println("8. Exit");
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
                    s.highestMarks();
                    break;
            
                case 6:
                    s.classAvg();
                    break;
                
                case 7:
                    s.statistics();
                    break;
                case 8:
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