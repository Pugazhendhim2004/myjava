class Task_Paracontructor{
    String name;
    int age;
    Task_Paracontructor(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Contpa{
    public static void main(String[] args) {
        Task_Paracontructor obj=new Task_Paracontructor("pugazh",20);
        System.out.println("name:"+obj.name+" "+"age:"+obj.age);
    }
}