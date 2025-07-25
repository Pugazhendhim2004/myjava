 class Task_Anonymouscls {
      String name;
      int id;
      Task_Anonymouscls(String name,int id){
        this.name=name;
        this.id=id;
      }
      void show(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
      }
}
class Innercls{
  static Task_Anonymouscls obj =new Task_Anonymouscls(null, 0){
     void show(){
      super.show();
      System.out.println("demo inner clss");
    }
  };
    public static void main(String[] args) {
        new Task_Anonymouscls("Pugazhendhi", 13579).show();
     Innercls.obj.show();
    }
}
