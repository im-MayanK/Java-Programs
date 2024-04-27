class Human // parent class // super class // base class
{
  int age;
  void disp()
  {
    age=18;
    System.out.println("the age of human is"+ age);
  }
}
class Stud extends Human // child class // derived class // sub class
{

}
public class Inheritance1 {
    public static void main(String[] args) {
        Stud obj = new Stud();
        obj.disp();
    }
    
    
}
