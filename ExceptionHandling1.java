//learn about throws keyword
// class Except{
//     public void B() throws ArithmeticException
//     {
//         int num1=20,num2=0,result=0;
//         result= num1/num2;
//         System.out.println(result);
//     }
        
//     public void A() throws Exception
//     {
//         B();

//     }
// }
// public class ExceptionHandling1  {
//     public static void main(String[] args)  {
//         Except obj=new Except();
//         try{
//             obj.A();
//         }
//         catch(Exception e)
//         {
//             System.out.println("error" +e);

//         }
// }
// }

//throw keyword
public class ExceptionHandling1  {
   public static void main(String[] args)  {
    int num1=10,num2=2,result=0;
    try{
        if(num2<0)
        {
            Exception e =new ArithmeticException("Negative no.");
            throw e;

        }
        else{
            result=num1/num2;
            System.out.println(result);
        

        }
        

    }
    catch(Exception e)
    {
        System.out.println("enter a valid no." +e);
    }
    

        
        

    }
}
// }


// custom exception
// class MyException extends Exception{
//     MyException(String msg)
//     {
//       super(msg);   
//     }

// }

// public class ExceptionHandling1  {
//    public static void main(String[] args)  {
//     int num1=10,num2=-2,result=0;
//     try{
//         if(num2<0)
//         {
//             Exception e =new MyException("Negative no.");
//             throw e;

//         }
//         else{
//             result=num1/num2;
//             System.out.println(result);
        

//         }
        

//     }
//     catch(Exception e)
//     {
//         System.out.println("enter a valid no." +e);
//     }
    

        
        

//     }
    
// }
