class Vehicle {
    void setup(){
        System.out.println("parent method -1");
    }
    Vehicle() {
        System.out.println("Parent");
    }
}

class Car extends Vehicle {
    void setup(){
        System.out.println("child method -1");
    }
    Car() {
        System.out.println("child-1");
    }
}

class Bus extends Vehicle {
    void setup(){
        System.out.println("child method -2");
    }
    Bus() {
        System.out.println("child-2");
    }
}

public class Task_heiracinhert{
    public static void main(String[] args) {
        Vehicle objj= new Vehicle();
        Vehicle objj1= new Car();
        Vehicle objj3=new Bus();
        objj1.setup();
        objj.setup();
        objj3.setup();
        Car obj1 = new Car(); 
        obj1.setup();
        Bus obj2 = new Bus(); 
        obj2.setup();
        
    }
}