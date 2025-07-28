 class Grand{
    void display(){
        System.out.println("grand Parent class method-1");
    }
       Grand() {
        System.out.println("grand Parent class");
    }
}
class Parent extends Grand{
    void display(){
        System.out.println("parent class method-2");
    }
    Parent(){
        System.out.println("parent class ");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("child class method -3");
    }
    Child(){
        System.out.println("child class");
        }
}
 public class Task_multilevelinhert{ 
    public static void main(String[] args) {
        Grand objj=new Grand();
       Grand obj =new Parent();
       Grand obj1=new Child();
       Parent objj1= new Parent();
       Parent obj2 = new Child();
       Child obj3 =new Child();
       objj.display();
       objj1.display();
       obj.display();
        obj1.display();
        obj2.display();
       obj3.display();
       }
}
