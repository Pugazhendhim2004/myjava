 class Task_staticcls {
    static int a;
    static void set(int x,int y){
        a=x+y;
         System.out.println("the answer is:"+ a);
    }
    static class staticlass{
        public void get(){
             set(10,20);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Task_staticcls.staticlass obj= new Task_staticcls.staticlass();
        obj.get();
      }
}