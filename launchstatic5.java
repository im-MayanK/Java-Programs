// // class A{
// //     void disp()
// //     {
// //         System.out.println("iam a static method");
// //     }

// // }
// // class Q{
// //     static class P{
// //          static void t1()
// //         {
// //             System.out.println("hello");
// //         }
// //     }   
// // }
// // class Demo{
// //     static void disp()
// //     {
// //         System.out.println("iam a static method");
// //     }
// //     void disp2()
// //     {
// //         System.out.println(" iam non static method i need object reference to call");
// //     }
// // } 

// // public class launchstatic5 {
// //     public static void main(String[] args) {
        
// //         Demo.disp();
// //         Demo a= new Demo();
// //         a.disp();
// //         a.disp2();
// //         Q obj=new Q();
// //         Q.P.t1();

// //         //B.C.t1();

        
// //     }
    
// // }
// public class launchstatic5{
//     // class InnerClass
//     // {
//     //     void innerMethod()
//     //     {
//     //         System.out.println("hi");
//     //     }
//     // }
//     public static void main(String[] args) {
//         //  launchstatic5 obj=new launchstatic5();
//         //  InnerClass obj1=obj.new InnerClass();
//         //  obj1.innerMethod();
//         int a[][]={{3,4},{4,5},{7,8}};
//         for(int n[]: a)
//         {
//             for (int n1: n)
//             {
//                 System.out.println(n1);
                

//             }

//         }
      class A{
        void c()
        {
            System.out.println("s");
        }
      }
      class B extends A{
        
      }
      public class launchstatic5{
        public static void main(String[] args) {
            
        }
      }

//     }
// }
