 class Task_metlocincls {
    int a,b;
    void outMet(int x1,int x2){
        a=x1+x2;
        System.out.println("outer method"+ a);
        
        class Innercls {
                   void inMet(int y1,int y2){
                    b=y1+y2;
                    System.out.println("inner method" + b);
                   }
        }
        Innercls obj1= new Innercls();
        obj1.inMet(10,30);
    }
    
}
class Main{
    public static void main(String[] args) {
        Task_metlocincls obj2= new Task_metlocincls();
        obj2.outMet(33,66);
    }
}
