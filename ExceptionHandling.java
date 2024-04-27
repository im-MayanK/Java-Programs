import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        // int num1=6;
        // int num2 =0;
        // int result=0;
        // try{
        //     result=num1/num2;
        //     System.out.println("in try block");
        // }
        // catch(ArithmeticException e)
        // {
        //       System.out.println("someting error.....");
        // }
        // System.out.println(result);
        // System.out.println("bye");


        // multiple catch blocks
         int num1=40,num2=2,result=0;
         int a[] ={12,13,14,15};
        try{
          result=num1/num2;
          System.out.println(a[4]);

        }
        catch(ArithmeticException e)
        {
          System.out.println("error" +  e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println("stay in your limits" +e);
        }
        catch(Exception e)
        {
          System.out.println("something error");
        }
        System.out.println(result);
        System.out.println("bye");



        /// learn about finally keyword

        //Scanner sc=new Scanner(System.in);
      //  try{
      //    int a =sc.nextInt();
      //    System.out.println(a);
      //  }
      //  catch(Exception e){
      //   System.out.println("please re enter the correct interger value");
      //  }
      //  finally{
      //   sc.close();
      //  }
      // try{
      //    int a =sc.nextInt();
      //    System.out.println(a);
      //  }
      //  catch(Exception e){
      //   System.out.println("please re enter the correct interger value");
      //  }
      //   finally{
      //   sc.close();
      //  }
      //    Scanner sc1=new Scanner(System.in);
      //  int b=sc1.nextInt();
      //  System.out.println(b);
        // try with resource

//          try(Scanner sc=new Scanner(System.in))
//          {
//            int a=sc.nextInt();
//            System.out.println(a);
//          }

    }
}
