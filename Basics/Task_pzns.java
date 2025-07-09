import java.util.Scanner;
class Task_pzns{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0){
             System.out.print(" Positive Number");
        }
        else if(a==0){
             System.out.print(" Zero ");
        }
        else{
            System.out.print(" Negative Number"); 
        }
    }
}