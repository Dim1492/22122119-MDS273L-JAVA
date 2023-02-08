package LAB2;

import java.util.*;

public class lab2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=5;
        String[] names=new String[n];
        int Option;
        char c;
      
        do{
        System.out.println("MENU");
        System.out.println("1.Enter the name");
        System.out.println("2.Search for a name");
        System.out.println("3.Remove a name");
        System.out.println("4.Show all names");
        System.out.println("5.Exit the program");
        System.out.println("Choose the right option");
        
        Option=Integer.parseInt(scan.nextLine());
        switch(Option){
            case 1:
            System.out.println("Enter a name:");
          for(int i=0;i<n;i++){
            names[i]=scan.nextLine();
          }
            break;
            case 2:
          System.out.println("Enter a name to search:");
          String name = scan.nextLine();
          boolean found = false;
         for (int i = 0; i < n; i++) {
            if (names[i].equals(name)) {
             System.out.println("Name found at index: " + i);
             System.out.println("Name is:" +names[i]);
             found = true;
             break;
}
}
if (!found) {
System.out.println("Name not found.");
}
break;

case 3:
System.out.println("Enter a name to remove:");
name = scan.nextLine();
int index = -1;
for (int i = 0; i < n; i++) {
if (names[i].equals(name)) {
index = i;
break;
}
}
if (index == -1) {
System.out.println("Name not found.");
break;
} else {
for (int i = index; i < n - 1; i++) {
names[i] = names[i + 1];
}
n--;
System.out.println("Name removed successfully.");
}
break;
          
               


        case 4:
          System.out.println("List of all names:");
          for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
          }
          break;

        case 5:
          System.out.println("Exiting the program...");
          break;

        default:
          System.out.println("Invalid choice, try again.");
      }
      
      System.out.println("If you want to continue press(Yes/yes)");
      c=scan.nextLine().charAt(0);

      

    } while ( c=='Y'||c=='y');
    
  }
}




        
        

        

        

    
