import java.util.*;
import java.io.*;
public class Lab7 {


    static float Mean(float[] array){
        float sum=0;
        float mean;
        for( int j=0;j<array.length;j++){
            sum=sum+array[j];
        }
        mean=sum/array.length;
        return mean;
    }
    static float Median(float[] array){
        int x;
        float y;
        float median;
        Arrays.sort(array);
        if(array.length%2==0){
            x=array.length/2;
            median=array[x];
        }else{
            x=array.length/2;
            y=(array[x-1]+array[x]);
            median=y/2;
           
        }
        return median;
    }

    static float Mode(float[] array){
        int maxcount=0;
        float mode=0;
        for(int i=0;i<array.length;i++){
             int count=0;
             for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
             }
             if(count>maxcount){
                maxcount=count;
                mode= array[i];
             }
        }
        return mode;
    }
    static float MinValue(float[] array){
        Arrays.sort(array);
        return array[0];
    }
    static float MaxValue(float[] array){
        float maxvalue=0;
        int a=array.length-1;
        maxvalue=array[a];
        return maxvalue;
    }
    static void display(String[][] numbers,int count,String filename){
       
        String[] fst_row={"Parameters","Mean","Median","Mode","Max","Min"};
            String[] sec_row={"Sepal Length",mean(SepalLn)+"",median(SepalLn)+"",mode(SepalLn)+"",max(SepalLn)+"",min(SepalLn)+""};
            String[] third_row={"Sepal Width",mean(SepalWd)+"",median(SepalWd)+"",mode(SepalWd)+"",max(SepalWd)+"",min(SepalWd)+""};
            String[] fourth_row={"Petal Length",mean(PetalLn)+"",median(PetalLn)+"",mode(PetalLn)+"",max(PetalLn)+"",min(PetalLn)+""};
            String[] fifth_row={"Petal Width",mean(PetalWd)+"",median(PetalWd)+"",mode(PetalWd)+"",max(PetalWd)+"",min(PetalWd)+""};
            
            System.out.println(Arrays.toString(fst_trow));
            System.out.println(Arrays.toString(sec_row));
            System.out.println(Arrays.toString(third_row));
            System.out.println(Arrays.toString(fourth_row));
            System.out.println(Arrays.toString(fifth_row));}
            try{
                FileWriter write=new FileWriter(filename,true);
                write.write(Arrays.toString(fst_row)+"\n");
                write.write(Arrays.toString(sec_row)+"\n");
                write.write(Arrays.toString(third_row)+"\n");
                write.write(Arrays.toString(fourth_row)+"\n");
                write.write(Arrays.toString(fifth_row)+"\n");
                write.close();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            



            

    public static void main(String[] args){
    
    String [][]iris=new String[1024][5];
    int count=0;
    try{
        File file=new File("C:/Users/VICTUS/Downloads/Iris.csv");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()){
            String data=scan.nextLine();
            String[] value=data.split(",");
            // System.out.print(value[1]);
            iris[count][0]=value[1];
            iris[count][1]=value[2];
            iris[count][2]=value[3];
            iris[count][3]=value[4];
            iris[count][4]=value[5];
            count++;
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    // for(int i=1;i<count;i++){
        // System.out.println(iris[i][1]);
    // }
   
    
    float[] SepalLn=new float[count-1];   
    float[] SepalWd=new float[count-1];
    float[] PetalLn=new float[count-1];
    float[] PetalWd=new float[count-1];
    String[] Species=new String[count-1];
    for(int i=1;i<=count-1;i++){
        SepalLn[i-1]=Float.parseFloat(iris[i][0]);
        SepalWd[i-1]=Float.parseFloat(iris[i][1]);
        PetalLn[i-1]=Float.parseFloat(iris[i][2]);
        PetalWd[i-1]=Float.parseFloat(iris[i][3]);
        Species[i-1]=iris[i][4];
        
    }
    

    // System.out.println(Mean(SepalLn));
    // System.out.println(Median(SepalLn));
    // System.out.println(Mode(SepalLn));
    // System.out.println(MinValue(SepalLn));
    // System.out.println(MaxValue(SepalLn));
    
    //   display(SepalLn);
    int n1=0;
    int n2=0;
    int n3=0;
    String[][] setosa=new String[1024][6];
    String[][] versicolor=new String[1024][6];
    String[][] virginica=new String[1024][6];
    for(int i=1;i<count;i++){
        if(iris[i][5].equals("Iris-setosa")){
            setosa[n1]=iris[i];
            n1++;
        }
        if(iris[i][5].equals("Iris-versicolor")){
            versicolor[n2]=iris[i];
            n2++;
        } 
        
        if(iris[i][5].equals("Iris-virginica")){
            virginica[n3]=iris[i];
            n3++;
        }

    }
    for(int k=0;k<n2;k++){
        for(int m=0;m<6;m++){
            System.out.print(versicolor[k][m]+" ");
        }
        System.out.println();
    }
    String file="5 point summary.txt";
    System.out.println("Total Summary : ");
    display(iris,count-1,file);
    System.out.println("Setosa : ");
    display(setosa,n1-1,file);
    System.out.println("Versicolor : ");
    display(versicolor,n2-1,file);
    System.out.println("Virginica : ");
    display(virginica,n3-1,file);
    
   
    

    }
}
    
        




    
    




