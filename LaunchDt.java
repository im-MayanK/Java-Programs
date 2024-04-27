//import java.util.Date;
//import java.util.ArrayList;

public class LaunchDt {
public static void main(String[] args) {
    java.util.Date a=new java.util.Date();
    System.out.println(a);
    System.out.println(a.getTime());
    java.util.ArrayList al =new java.util.ArrayList();
    long timeInMiliSec =a.getTime();
    java.sql.Date sq=new java.sql.Date(timeInMiliSec);
    System.out.println(sq);
}    
}
