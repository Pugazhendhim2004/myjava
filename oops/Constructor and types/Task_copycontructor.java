 class Task_copycontructor {
    String name;
    int id;
    Task_copycontructor(String name,int id){
        this.name=name;
        this.id=id;
    }
    Task_copycontructor(Task_copycontructor obj2){
        this.name=obj2.name;
        this.id=obj2.id;
    }
}
class contcop{
    public static void main(String[] args) {
        Task_copycontructor obj1=new Task_copycontructor("Pugazh",20);
        System.out.println("name:"+obj1.name+" "+"age:"+obj1.id);
        System.out.println("copy obj1 to obj2");
         Task_copycontructor obj2=new Task_copycontructor(obj1); 
         System.out.println("name:"+obj2.name+" "+"age:"+obj2.id);      
    }
}
