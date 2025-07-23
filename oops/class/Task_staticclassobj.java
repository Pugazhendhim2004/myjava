public class Task_staticclassobj {

    static int token_no;
    static String lottery;
    static void setinput(int no,String company){
        token_no=no;
        lottery=company;
    }
    static void getShow(){
        System.out.println("Name:"+ lottery);
        System.out.println("Num: "+ token_no);
    }
    public static void main(String[] args) {
        setinput(6789,"Bajaj");
        getShow();
    }
}