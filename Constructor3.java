class Student3
{
    String name;
    int age;
   Student3()
   {
    this("Mayank",19);
    System.out.println("without parametrized constructor");
   }
   Student3(String name, int age)
   {
    this("Aman");
     System.out.println("dual parametrized constructor");
     this.name=name;
     this.age=age;
   }
   Student3(String name)
   {
    // int age=0;
    this.name=name;
     this.age=age;
     System.out.println("Single parametrized constructor");
   }
   void show()
   {
    System.out.println(name+"" + age);
   }
}
public class Constructor3 {
    public static void main(String[] args) {
        Student3 obj = new Student3();
        obj.show();
        
    }
}
// class Student1 //extends Object
// {
//     private String name;
//     private int age;

//     public Student1()
//     {
//        // super();
//        this("Rohit", 19);
//         System.out.println("Default Constructor is called");
//         name="Rohan";
//         age=18;
//     }
//     public Student1(String name)
//     {
//         this();
//         this.name=name;
//         age=19;
//     }
//     public Student1(String name, int age)
//     {
        
//         this.name=name;
//         this.age=age;
//     }
//     public void disp()
//     {
//         System.out.println(name);
//         System.out.println(age);
//     }
// }

// public class Constructor3
// {
//     public static void main(String[] args) 
//     {
//         Student1 st1=new Student1();
//         st1.disp();

//         Student1 st2=new Student1("Rahul");
//         st2.disp();

        
//     }
// }
