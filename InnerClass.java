import javax.swing.event.SwingPropertyChangeSupport;
//member class 
// class Q
// {
//     void disp()
//     {
//         System.out.println("in show");
//     }
//     class P{
//         void disp1()
//         {
//             System.out.println("inner class");
//         }

//     }
// }
// public class InnerClass {
//     public static void main(String[] args) {
//         Q obj =new Q();
//         Q.P obj1=obj.new P();
//         obj1.disp1();
//         obj.disp();
        
//     }
    
// }

//static member

// class Q
// {
//     void disp()
//     {
//         System.out.println("in show");
//     }
//     static class P{
//         void disp1()
//         {
//             System.out.println("inner class");
//         }

//     }
// }
// public class InnerClass {
//     public static void main(String[] args) {
//        // Q obj =new Q();
//         Q.P obj1=new Q.P();
//         obj1.disp1();
        
        
//     }
    
// }

// Anonymous class and lambda expression
// interface Q
// {
//     void car();
// }
// class P implements Q{  /// instead of doing this   
//     public void car()    
//     {
//         System.out.println("driving....");
//     }
// }
// class InnerClass{
//     public static void main(String[] args) {
//         Q obj=new Q(){
//              public void car()           // anonymous class
//     {
//         System.out.println("driving....");
//     }
//         };
//         obj.car();
        
        
//     }
// }

@FunctionalInterface
interface Q
{
    //void drive();
    void drive(int age ,String nameeee);
    
}
class InnerClass{
    public static void main(String[] args) {
        // Q obj =new Q()
        // {
        //     public void drive()
        //     {
        //         System.out.println("driving....");
        //     }
        // };

        // Q obj = () ->  System.out.println("driving.....");
        // obj.drive();
        Q obj = ( age ,  name) ->   System.out.println("driving....." +age+name);
           
        obj.drive(20,"Mayank");
        
     }

}