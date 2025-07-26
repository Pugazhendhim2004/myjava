import java.util.*;
public class Task_Calculator{
     static int  powInt(int num1,int num2){
         return (int)Math.pow(num1,num2);
    }
     static double powDouble(double num1,int num2){
        return Math.pow(num1,num2);
     }
     public static void main(String[] arg){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the int value:\t");
        int powerInt=powInt(sc.nextInt(),sc.nextInt());
        System.out.println("value:\t"+powerInt);
        System.out.print("Enter the (Double,int)3 value:\t");
        double powerDouble=powDouble(sc.nextDouble(),sc.nextInt());
        System.out.println("value:\t"+powerDouble);

     }
}