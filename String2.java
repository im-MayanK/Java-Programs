public class String2 {
    public static void main(String[] args) {
        // + vs concat in built method of string class
        String name= "Mayank";
        System.out.println(name);
        String name1= "Agrawal";
        System.out.println(name1);
       name= name.concat((name1));
        System.out.println(name);
        name=name.concat("Baniya");
        System.out.println(name);
        System.out.println(name+name1);
        String name3= "world";
        name3=name3.concat("99");
        name3=name3+78+50+"jack";
        System.out.println(name3);

        String name4= new String("JACK Sparraow");
        name4=name4.concat("Captain");
        System.out.println(name4);
        name4= name4+"he is no."+ 1 +"star"+ 0;
        System.out.println(name4);
    }
    
}
