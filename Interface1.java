interface Boy
{
    void disp();
    default void disp1()
    {
        System.out.println("interface default method");
    }
    static void disp2()
    {
        System.out.println("interface static method");
    }
}

   class Girl implements Boy
{
  
    public void disp()
    {
        System.out.println("interface inherited method");
    }
     void disp2()
    {
       System.out.println("static method overide");
    }


}

public class Interface1 {
    public static void main(String[] args) {
        Girl obj =new Girl();
        obj.disp2();
        obj.disp1();
        Boy.disp2();
        //Boy.disp1(); gives error

        
    }
    
}
