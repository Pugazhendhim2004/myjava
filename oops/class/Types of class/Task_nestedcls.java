class Task_nestedcls{
    class Innercls{
        public void setget(int i){
            System.out.println("The value is:"+i);
        }
    }
}
class nestedclss{
    public static void main(String[] args) {
        Task_nestedcls.Innercls obj = new Task_nestedcls().new Innercls();
        obj.setget(10);
    }
}