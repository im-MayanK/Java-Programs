class MyThread6 implements Runnable {
    
    public void run()
    {
        
             try
              {
                for(int i=0;i<2;i++)
             {
                System.out.println("focus is more important");
                Thread.sleep(3000);
              }
              }
              catch(Exception e)
              {
                System.out.println("some problem");

              }

}
}
public class Multithreading5 {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        MyThread6 obj=new MyThread6();
        Thread t1=new Thread(obj);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("main thread ended");


        
    }
    
}
