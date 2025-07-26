import java.util.*;
public class Task_BOX{
    int width,height,depth,volume;
    Task_BOX(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public int volumeGet(){
        volume=width*height*depth;
        return volume;
    }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the width,height,depth:\t");
        Task_BOX box= new Task_BOX(sc.nextInt(),sc.nextInt(),sc.nextInt());
       System.out.println( box.volumeGet());

    }
}
