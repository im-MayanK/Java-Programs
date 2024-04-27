class Student
{
    private int age;
    private String name;
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
    
    // learn about setters and getters

    // void show()
    // {
    //     System.out.println(name + " "+ age);
    // }

}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(19);
        // obj1.setData1(26);
        int studentAge1= obj.getAge();
        obj.setName("Mayank");
        String studentName1= obj.getName();
        System.out.println(studentAge1 + " " + studentName1);
        // obj1.setData2("Aman");
        // obj.show();
        // obj1.show();
    }
  
    
}
