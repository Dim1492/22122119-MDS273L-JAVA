import java.util.*;
class lab3{
    static float Mean(int[] array){
        float sum=0;
        float mean;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        mean=sum/array.length;
        return mean;
    }
    static float Median(int[] array){
        float median;
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                }
            }
        }

        if(array.length%2==0){
            int x=array.length/2;
            float y=array[x-1]+array[x];
            median=y/2;
        }else{
            int x=array.length/2;
           median=array[x];
        }
      
        return median;
    }
    static int Mode(int[] array){
    int mode=0;
        int maxcount=0;
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
                if(count>maxcount){
                    maxcount=count;
                    mode=array[i];
                }
            }
        }
        return mode;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of values u want to enter: ");
        int n=Integer.parseInt(scan.nextLine());
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the values : ");
            arr[i]=Integer.parseInt(scan.nextLine());
        }
        int con;
        do{
            System.out.println("Enter the operation u want to perform :\n 1.Mean\n 2.Mode\n3.Median\n 4.All 3");
            int op=Integer.parseInt(scan.nextLine());
            switch(op){
                case 1:
                System.out.println("The mean is : "+Mean(arr));
                break;
                case 2:
                System.out.println("the mode is "+Mode(arr));
                break;
                case 3:
                System.out.println("The median is : "+Median(arr));
                break;
                case 4:
                System.out.println("The mean is : "+Mean(arr));
                System.out.println("the mode is "+Mode(arr));
                System.out.println("The median is : "+Median(arr));
                break;

            }
            System.out.println("Do u wish to continue .Press 1 to continue");
             con=Integer.parseInt(scan.nextLine());

            }while(con==1);
        }
     
    
     
    }

