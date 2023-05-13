
import java.util.*;

class lab2{
  public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      String[] names=new String[1024];
      int a=0;
      int option;
      do{
          System.out.println("choose which operation to be done:\n 1.Enter a name\n 2.Search for a name \n 3.Remove a name \n4. Show all names");
          int choice=Integer.parseInt(scan.nextLine());
          switch(choice){
              case 1:
              System.out.println("Enter the num of names u want to enter:");
              int num=Integer.parseInt(scan.nextLine());
              for(int i=0;i<num;i++){
              System.out.println("Enter the names:");
               String name=scan.nextLine();
               boolean found=false;
               
                  for(int j=0;j<names.length;j++){
                      if(name.equals(names[j])){
                          System.out.println("name already exists");
                          found=true;
                          break;
                          
                      }          
                      
                  } if(!found){
                      names[a]=name;
                      a++;
                  }
                  }
               break;
                case 2:
                System.out.println("enter the name u want to search : ");
                String searchName=scan.nextLine();
                boolean found=false;
                  for(int i=0;i<a;i++){
                      if(names[i].equals(searchName)){
                          System.out.println("The name is: "+searchName+" with the index : " +i);
                          found=true;
                          break;   
                      }  
                  }if(!found){
                      System.out.println("Name not found");
                  }
                  break;
                  case 3:
                  System.out.println("Enter the name you want to remove : ");
                  String removeName=scan.nextLine();
                  boolean exists=false;
                  for(int i=0;i<a;i++){
                      if(names[i].equals(removeName)){
                          names[i]=names[i+1];
                          System.out.println("The name "+removeName+" is removed");
                          exists=true;
                          a--;
                      }
                     
                  }if(!exists){
                      System.out.println("the name doesnt exist");
                  }
                  break;
                  case 4:
                  for(int i=0;i<a;i++){
                      System.out.println(names[i]);
                  }
                  System.out.println();
                  break;
                }
              System.out.println("Do you want to continue: Press 1.yes or 2.No");
              option=Integer.parseInt(scan.nextLine());
          }while(option==1);
      }
  }
  