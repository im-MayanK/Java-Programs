class Mythread extends Thread
{
   public void run()
    {
        System.out.println("child thread");

    }

}
public class Multithreading {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Mythread t=new Mythread();
        t.run();
        
    }
}