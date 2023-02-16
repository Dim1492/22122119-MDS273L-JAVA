import java.util.*;
  class lab3{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int d;
        int ch;
        System.out.println("Enter the number of values u want in the array: ");
         d=Integer.parseInt(scan.nextLine());
       int [] arr=new int[d];
       for(int i=0;i<d;i++){
                System.out.println("Enter value for index "+i+" for the array : ");
                arr[i]=Integer.parseInt(scan.nextLine());

    }
    float a =Mean(arr);
    int b= Mode(arr);
    float h = median(arr);
    do{
        System.out.println("Choose your Operation\n1. Mean\n2. Median\n3. Mode\n4. All 3");
        int choice=Integer.parseInt(scan.nextLine());
       switch(choice){
        case 1:
    
    System.out.println("The mean of the array element is: "+a);
    break;
    case 2:
    
    System.out.println("The median is: "+h);
    break;
    case 3:
    System.out.println("The mode is: "+b);
    break;
    case 4:
   
    System.out.println("The mean is  :"+a+"\nThe median is  :"+h+"\nThe mode is :"+b);
    break;
   
    default:
    System.out.println("Invalid choice!!!");


       }
       System.out.println("Press 1 continue: ");
       ch=Integer.parseInt(scan.nextLine());
    }while(ch==1);
    
    
    
}
static float Mean(int[] array){
        int sum=0;
        float mean;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        mean=sum/array.length;
        return mean;
}
static float median(int[] array){
    int x;
    float median;
    float y;
    Arrays.sort(array);
    if (array.length%2!=0){
        x=(array.length/2);
        median = array[x];
    }else{
        x=(array.length/2);
        y=(array[x-1]+array[x]);
        median=y/2;
        
    }
    return median;   
}


static int Mode(int [] array){
    int maxvalue=0;
    int maxcount=0;
    for(int i =0;i<array.length;i++){
        int count=0;
        for(int j =0;j<array.length;j++){
            if(array[i]==array[j]){
            count++;
            }
        }
        if(count>maxcount){
            maxcount=count;
            maxvalue = array[i];

        }
     }
    return maxvalue;
}
 }
