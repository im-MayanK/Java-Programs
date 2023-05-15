public class String7 {
    public static void main(String[] args) {
        // mutable string
    //  StringBuilder sb= new StringBuilder("Mayank");
    //  sb.append("Agrawal");
    //  System.out.println(sb);

    //  StringBuffer sb1= new StringBuffer("Virat");
    //  sb1.append("Kholi");
    //  System.out.println(sb1);

    //  String str1 ="Mayank"; // immutable string concept
    //  str1= str1 + "Agrawal";
    //  System.out.println(str1);

    // learn about final keyword
    //  final String str1 = "Mayank";
    // str1= str1 + "Agrwal"; gives error because of final keyword
    // System.out.println(str1);

    // final StringBuffer str1 = new StringBuffer("Mayank");
    // str1.append("Agrawal");
    //  str1=new StringBuffer("Kumar"); //gives error because of final keyword
    // System.out.println(str1);

    // some methods in mutable string

    // StringBuilder str1 = new StringBuilder();
    // System.out.println(str1.capacity());
    // str1.append("abcdefghijklmnop");
    // System.out.println(str1.capacity());
    // str1.append("s");
    // System.out.println(str1.capacity());
    // StringBuilder str2 = new StringBuilder("sachin");
    // System.out.println(str2.capacity());
    // str2.append("abcdefghijklmnop");
    // System.out.println(str2.capacity());
    // str2.append("s");
    // System.out.println(str2.capacity());
    // System.out.println(str2.charAt(1));
    // str2.setCharAt(1, 'A');// this method has no return type so we can store it in a variable
    // System.out.println(str2);
    

    // StringBuilder str2 = new StringBuilder(150);
    // System.out.println(str2.capacity());
    // str2.append("java");
    // System.out.println(str2);
    // str2.trimToSize();
    // System.out.println(str2.capacity());
    StringBuilder str2 = new StringBuilder("Mayank");
    str2.reverse();
    System.out.println(str2);
    
   




    }
    
}
