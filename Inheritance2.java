class Human1 // parent class // super class // base class
{
  int age;
  private String name;
  Human1()
  {
     System.out.println("Human1() constructor is called ");
  }
  void disp()
  {

    age=18;
    System.out.println("the age of human is"+ age );
  }
}
class Stud1 extends Human1 // child class // derived class // sub class
{
  super.human1();
  // default constructor called by compiler
  //Stud1()
  //{
   // super()// super method call parent class construtor and this super method is always include in first
   // line of constructor
  //}
  void sleep()
  {
    System.out.println(age);// not gives error
    //System.out.println(name);//gives error
  }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Stud1 obj = new Stud1();
        obj.disp();
        obj.sleep();
        System.out.println(obj.age);
        //System.out.println(obj.name); because name is private and it cannot inherit in child class
        // it preserves the property encapsulation
    }
    
    
}

