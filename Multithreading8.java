class Library implements Runnable
{
    String res1= "Java";
    String res2="DSA";
    String res3="SQL";
    public void run()
    {
        String  name=Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
            try{
                Thread.sleep(2000);
            synchronized(res1)
            {
                System.out.println("student1 access the res1"+res1);
                Thread.sleep(2000);
                synchronized(res2){
                System.out.println("student1 access the res2"+res2);
                Thread.sleep(2000);
                 synchronized(res3){
                System.out.println("student1 access the res3"+res3);
                Thread.sleep(2000);

                }

                }
            }
        }
        catch(Exception e)
        {
            System.out.println("some problem"+e);
        }

        }
        else{
             try{
                Thread.sleep(2000);
            synchronized(res3)
            {
                System.out.println("student2 access the res1"+res3);
                Thread.sleep(2000);
                synchronized(res2){
                System.out.println("student2 access the res2"+res2);
                Thread.sleep(2000);
                 synchronized(res1){
                System.out.println("student2 access the res3"+res1);
                Thread.sleep(2000);

                }

                }
            }
        }
        catch(Exception e)
        {
            System.out.println("some problem"+e);
        }

        }
        }
        
    }

class Multithreading8
{
    public static void main(String[] args) {
        Library obj =new Library();
        Library obj1=new Library();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();
        
    }
}