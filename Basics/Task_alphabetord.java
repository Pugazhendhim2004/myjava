import java.util.Scanner;
class Task_alphabetord{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        char f=a.next().charAt(0);
        char s=a.next().charAt(0);
        if(f<s){
            System.out.print(f+" "+s);
        }
        else{
            System.out.print(s+" "+f);
        }
    }
}