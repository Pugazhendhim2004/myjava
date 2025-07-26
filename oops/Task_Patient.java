import java.util.*;
public class Task_Patient{
    String PatientName;
    double height,weight;
    Task_Patient(String name,double h,double w){
        PatientName=name;
        height=h;
        weight=w;
    }
    public double computeBMI(){
        return (weight/(height*height));
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name:\t");
        String name=sc.nextLine();
        System.out.print("Enter the Height:\t");
        double h=sc.nextDouble();
        System.out.print("Enter the weight\t");
        double w=sc.nextDouble();
        Task_Patient obj= new Task_Patient(name, h, w);
        System.out.printf("The Result "+"\n Name:"+obj.PatientName+"\n"+"BMI VALUE:"+obj.computeBMI());


    }
}