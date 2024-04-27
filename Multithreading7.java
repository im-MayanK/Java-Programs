//learn about synchronised keyword in java
class car implements Runnable
{
    public void run()
    {
        try{
        System.out.println(Thread.currentThread().getName()+"go to parking lot");
        Thread.sleep(2000);
        synchronized(this){

        
         System.out.println(Thread.currentThread().getName()+"enter in driving seat of a car");
         Thread.sleep(2000);
          System.out.println(Thread.currentThread().getName()+"drive the car");
          Thread.sleep(2000);
           System.out.println(Thread.currentThread().getName()+"park again into parking lot");
    }
}
    catch(Exception e){
        System.out.println("some problem");

    }
    }
    }

public class Multithreading7 {
    public static void main(String[] args) {
        car obj=new car();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        t1.setName("Son 1");
        t2.setName("Son 2");
        t3.setName("Son 3");
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
