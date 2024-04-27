class Mythread7 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=2;i++)
        {
        try{
             
        
            System.out.println("in loop");
            Thread.sleep(2000);
        
        }
        catch(Exception e)
        {
            System.out.println("interupted exception");
        }
    }
    
}
}
public class Multithreading6 {
    public static void main(String[] args)  {
        Mythread7 obj=new Mythread7();
        Thread t1=new Thread(obj);
        t1.start();
        t1.interrupt();
       


        
    }
    
}
