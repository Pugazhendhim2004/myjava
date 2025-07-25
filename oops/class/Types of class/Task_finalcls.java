

 // final class Task_finalcls {
    class Task_finalcls{
    void Display()
    {
        System.out.print("method for base class.");
    }
}

class Extended extends Task_finalcls {

    void Display()
    {
        System.out.print("final class is not extended");
    }
}

class Finalclss{

    public static void main(String[] arg)
    {
        Extended d = new Extended();
        d.Display();
    }
}