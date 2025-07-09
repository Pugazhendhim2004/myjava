import java.util.Scanner;

class Task_malefemale{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String gender = sc.next();
            int age = sc.nextInt();
            if (gender.equals("female") && age >= 1 && age <= 58) {
                  System.out.print("8.4%");
            } else if (gender.equals("female") && age >= 59 && age <= 100) {
                  System.out.print("9.2%");
            } else if (gender.equals("male") && age >= 1 && age <= 58) {
                  System.out.print("8.4%");
            } else if (gender.equals("male") && age >= 59 && age <= 100) {
                  System.out.print("10.5%");
            } else {
                  System.out.println("Invalid code");
            }
      }
}
