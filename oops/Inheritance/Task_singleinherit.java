class Parent{
void showip(){
    System.out.println("parent class method-1");
}
     Parent() {
        System.out.println("Parent class");
    }
}
class Childclas extends Parent{

    void showip(){
        System.out.println("child class method -2");
    }
     Childclas(){
            System.out.println("child class");
          }
}
class Task_singleinhert{
    public static void main(String [] args) {
        Parent obj= new Childclas();
        Childclas obj1= new Childclas();
        Parent objj= new Parent();
        objj.showip();
        obj.showip();
        obj1.showip();
    }
}