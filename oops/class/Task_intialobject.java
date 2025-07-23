public class Task_intialobject {
        String Name;
        long price;
        int mileage,Discount;
        public Task_intialobject(String Name,long price,int mileage,int Discount){
            this.Name=Name;
            this.Discount=Discount;
            this.price=price;
            this.mileage=mileage;
        }
        public String getName(){
            return Name;
        }
         public long getprice(){
            return price;
        }
         public int getdiscount(){
            return Discount;
        }
         public int getmileage(){
            return mileage;
        }
        public String setprint(){
            System.out.println("Name: "+getName());
            System.out.println("prize: "+getprice());
            System.out.println("Mileage:  "+getmileage());
            System.out.println("Discount: "+getdiscount());
            return ("Name: "+getName()+"\tPrize: "+getprice()+"\tMileage: "+getmileage()+"\tDiscount: "+getdiscount());
        }
        public static void main(String[] args) {
            Task_intialobject Ns = new Task_intialobject("Puslar", 150000, 35, 7000);
            System.out.println("REGISTER COUNTER");
            Ns.setprint();
            System.out.println("\nBILL COUNTER");
            System.out.println(Ns.setprint());
        }
}