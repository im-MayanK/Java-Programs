class Bam
{
   public Bam()
   {
    System.out.println("Parent class Constructor");
   }
   public Bam(int a, int b)
   {
    System.out.println(" parent class parametrized construcotr call");
   }
}
class Bam2 extends Bam
{
  public Bam2()
  {
    //super(10,20);
    this(10,20);
    System.out.println("child class constructor");
  }
  public Bam2(int a, int b)
  {   
      System.out.println("child class parametrized consturctor call "+ (a+b));
  }
}
class ConstructorExe
{
   public static void main(String[] args) {
    Bam2 obj=new Bam2();
    Bam2 obj1=new Bam2(10,20);

    
    
    
   }
}