class Car {
    String color;
    int Seats;
     
    public void mechanism() {
        System.out.println("Running");
        System.out.println(this.color);
        System.out.println(this.Seats);
    
    }

    Car()
        {
           System.out.println("Constructor");
        }
        Car(Car c2) //Copy constructor
         {
        this.Seats=c2.Seats;
        this.color=c2.color;
         }
}

class Lipstick{
    String color;
    int price;

    public void does() {
        System.out.println("Color lips");
        
    }
    Lipstick(String color, int price){
        this.color=color;
        this.price=price;
        System.out.println(this.color);
    }
}


public class Practice {
    
    public static void main(String args[]) {
        Lipstick ls1= new Lipstick("Red",600);
        ls1.does();
         
       //////////////////

        Car c1= new Car();
        c1.color="black";
        c1.Seats=5;

        Car c2= new Car(c1);
        c2.mechanism();

       //////////////////

      
    }    
}