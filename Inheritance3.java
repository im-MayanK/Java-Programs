// multilevel inheritance
// class Manu
// {
//    void demo()
//     {
//     System.out.println("Hello");
//     }
// }
// class Manu1 extends Manu
// {

// }
// class Manu2 extends Manu1{

// }

// heirarichal inheritance
class Manu{
    void demo()
    {
    System.out.println("Hello");
    }

}
class Manu1 extends Manu{

}
class Manu2 extends Manu{

}
//Multiple inheritance is not possible in java
/*
 *class Manu 3 extends Manu1 extends Manu2 // gives error because it is not possible in java
 {

 }
 *  
 */
public class Inheritance3 {
    public static void main(String[] args) {
        Manu1 obj=new Manu1();
        Manu2 obj1=new Manu2();
        obj.demo();
        obj1.demo();
        
    }
    
}
