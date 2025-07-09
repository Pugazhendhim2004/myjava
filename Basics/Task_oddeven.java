import java.util.Scanner;
class Task_oddeven{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int s=a.nextInt();
        if(s%2==0){
            System.out.print("Even Number");
        }
        else{
            System.out.print("Odd Number");
        }
    }
}