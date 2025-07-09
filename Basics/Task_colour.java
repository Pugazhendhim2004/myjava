import java.util.Scanner;
class Task_colour{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        char f=a.next().charAt(0);
       switch(f){
           case 'R':
               System.out.print("Red");
               break;
            case 'B':
               System.out.print("Blue");
               break;
            case 'G':
               System.out.print("Green");
               break;
             case 'O':
               System.out.print("Orange");
               break;
            case 'Y':
               System.out.print("Yellow");
               break;
            case 'W':
               System.out.print("White");
               break;
               default:
               System.out.print("Invalid Code");
            }
          
    }
}