public class Task_contructoroverloading {
    Task_contructoroverloading(String name){
        System.out.println(name);
    }
     Task_contructoroverloading(String dept,int regno){
        System.out.println(dept+" "+regno);
    }
     Task_contructoroverloading(double cgpa){
        System.out.println(cgpa);
    }
}
class overload{
    public static void main(String[] args) {
        Task_contructoroverloading obj1=new Task_contructoroverloading("Pugazhendhi M");
         Task_contructoroverloading obj2=new Task_contructoroverloading("Ece",123456789);
          Task_contructoroverloading obj3=new Task_contructoroverloading(7.43);
    }
}
