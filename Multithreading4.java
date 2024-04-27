import java.util.Scanner;

    class MyThread5 extends Thread
    {
        public void run()
        {
            String tname=Thread.currentThread().getName();
            if(tname.equals("disp"))
            {
                disp();
            }
            else{
                show();
            }
            
        }
    public void disp()
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
    
    
      public void show()
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


public class Multithreading4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread5 obj=new MyThread5();
        MyThread5 obj1=new MyThread5();
        obj.setName("disp");
        obj1.setName("show");
   
        obj.start();
        obj1.start();
       
    }
    
}
