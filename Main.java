import java.util.*;
import student.*;

public class Main{
    public static void main(String[] args) {
        boolean lock = true;
        StudentDetails s = new StudentDetails();
        
        try{
            while(lock){
            
            IO.println("Choose the method: ");
            IO.println("1. Add StudentDetails ");
            IO.println("2. Display StudentDetails");
            IO.println("3. Search By Student Id");
            IO.println("4. Exit");
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
                    lock = false;
                    break;

            }
            }
        }catch(Exception e){
            System.out.println("Error Occured: " + e.getMessage());
        }
        
        
    }
}