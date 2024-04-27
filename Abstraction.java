abstract class Aeroplane3{
    abstract public void takeoff();
    abstract public void fly();
    public void landing()
    {
      System.out.println("land the airplane");
    }
}
class Cargoplane3 extends Aeroplane3{
    public void takeoff()
    {
      System.out.println("takeoff mt kro");
    }
    public void fly()
    {
      System.out.println("fly mt kro");
    }
    public void alert()
    {
        System.out.println("alert the plane.....");
    }

}
class Passengerplane3 extends Aeroplane3{
    public void takeoff()
    {
      System.out.println("takeoff krna hai 5 bje");
    }
    public void fly()
    {
      System.out.println("fly krna hai 9 bje");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Aeroplane3 ref1 =new Cargoplane3();
        Aeroplane3 ref2 =new Passengerplane3();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        ((Cargoplane3)ref1).alert();
        ref2.landing();
        ref2.takeoff();
        ref2.fly();
        // Aeroplane3 obj =new Aeroplane3(); abstract class ka obj nhi bnta
            
         }

        
    }
    

