
import java.util.*;
public class lab1 {
    public static void main(String[] args){
        String Name;
        int Age;
        String Class;
        char Gender;
        String State;
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter Your Name : ");
        Name=scan.nextLine();
        System.out.print("Enter ur age : ");
        Age=Integer.parseInt(scan.nextLine());
        System.out.print("Enter class :" );
        Class=scan.nextLine();

        System.out.print("Gender : ");
        Gender=scan.nextLine().charAt(0);
        if(Gender=='m'){
            System.out.println("Male");
        }else if(Gender=='f'){
            System.out.println("Female");
        }
        
        
        System.out.print("Enter where u are from : ");
        State=scan.nextLine();
        System.out.println("STUDENT DETAILS");
        
        System.out.println("Name :"+Name);
        System.out.println("Age :"+Age);
        System.out.println("Class :"+Class);
        System.out.println("Gender :"+Gender);
        System.out.println("State :"+State);
        switch(State){
            case "Kerala":
            case "KN":
            case "TN":
            System.out.println("The student is from Southern States of India");
            break;
            case "Delhi":
            case "Jammu":
            System.out.println("Northern States of India");
            break;

        }
       
        
        

    }
}