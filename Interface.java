interface Computer
{
  void compileCode();
   
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("gives 5 errors , faster");
    }
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("gives 5 errors");
    }
}
class Developer 
{
    public void app(Computer obj)
    { 
        obj.compileCode();
        System.out.println("Build App");
    }
}
public class Interface {
    public static void main(String[] args) {
        Computer ref1 =new Laptop();
          Developer obj =new Developer();
        Computer ref2 =new Desktop();
        obj.app(ref1);

        
    }
    
}
