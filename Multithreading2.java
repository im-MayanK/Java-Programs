class MyThread2 extends Thread{
    public void run()
    {
        System.out.println("gr");
    }

}
public class Multithreading2 {
    public static void main(String[] args) {
        System.out.println("main thread");
        System.out.println("before changing");
        String name=Thread.currentThread().getName();
        System.out.println("the name of main thread is"+name);
        System.out.println("the priority of main thread is "+ Thread.currentThread().getPriority());
        System.out.println("after changing");
        Thread t= Thread.currentThread();
        t.setName("Mayank");
        t.setPriority(3);
        String name1=Thread.currentThread().getName();
        System.out.println("the name of main thread is"+name1);
        System.out.println("the priority of main thread is "+ Thread.currentThread().getPriority());
        MyThread2 obj=new MyThread2();
        obj.start();
        try{
            t.sleep(2000);
        }
        catch(Exception e){
            System.out.println("problem solved");

        }
            System.out.println(obj.getPriority());
    

    }
    
}
