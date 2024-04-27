import java.util.Scanner;
//class Mythread3 extends Thread{
    class MyThread3 implements Runnable
    {
    public void run()
    {
        System.out.println("My thread3 started");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value one");
        int a=sc.nextInt();
        System.out.println("enter the second value");
        int b=sc.nextInt();
        int result= a+b;
        System.out.println("result"+result);
        System.out.println("Mythread3 ended");
    }    

}
// MyThread4 extends Thread{
    class MyThread4 implements Runnable{
    public void run()
    {
        System.out.println("Thread4 started");
        for(int i=0;i<3;i++)
        {
            System.out.println("in for loop");
            try {
            Thread.sleep(2000);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("some problem");
        }
        
        }
      
        
        System.out.println("thread4 ended");
    }

}
public class Multithrreading3 {
    public static void main(String[] args) {
        MyThread3 obj=new MyThread3();
        MyThread4 obj1=new MyThread4();
        Thread t1= new Thread(obj);
        Thread t2=new Thread(obj1);
        // obj.start();
        // obj1.start();
        t1.start();
        t2.start();
        
    }
    
}
