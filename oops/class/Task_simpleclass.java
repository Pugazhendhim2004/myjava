 class simpleclas{
   int reg_no;
   String name;
   public simpleclas(int reg_no,String name){
    this.reg_no=reg_no;
    this.name=name;
   }
}
public class Task_simpleclass{
   public static void main(String[] args) {
    simpleclas obj=new simpleclas(12345,"Pugazhendhi");
    System.out.println("Name: "+obj.name+" "+" Reg no:"+obj.reg_no);
   }
}