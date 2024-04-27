abstract class Aeroplane2
{
    public void takeoff()
    {
        System.out.println("aeroplane take off");
    }
    public void fly()
    {
        System.out.println("aeroplane fly");
    }
}
class Cargoplane extends Aeroplane2
{
    public void takeoff()
    {
        System.out.println("cargoplane carry less fuel");
    }
    public void fly()
    {
        System.out.println("cargoplane fly over the sea surface");
    }
}
class Passengerplane extends Aeroplane2
{
    public void takeoff()
    {
        System.out.println("passenger plane take off with passenger");
    }
    public void fly()
    {
        System.out.println("passenger plane fly with passenger");
    }
}
class Fighterplane extends Aeroplane2
{
    public void takeoff()
    {
        System.out.println("fighter plane take to fight");
    }
    public void fly()
    {
        System.out.println("fighter plane fly with top speed");
    }
}
 class Airport
{
  public void poly(Aeroplane2 ref)
  {
    ref.takeoff();
    ref.fly();
    System.out.println("----------------------------------");
  }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Cargoplane cp =new Cargoplane();
        Passengerplane pp =new Passengerplane();
        Fighterplane fp =new Fighterplane();
        Airport ref = new Airport();
        ref.poly(cp);
        ref.poly(pp);
        ref.poly(fp);

        
        
        
    }
    
}
