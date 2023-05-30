class Student2
{
  private int age;
  private String name;
  Student2(String name, int age)
  {
    this.name=name;
    this.age=age;
  }
public int getAge() {
    return age;
}
// public void setAge(int age) {
//     this.age = age;
// }
// public void setName(String name) {
//     this.name = name;
// }
public String getName() {
    return name;
}
}
public class Constructor1 {
    public static void main(String[] args) {
        // Student obj = new Student("mayank", 19);
        Student2 obj = new Student2("Mayank", 19);
        // obj.setAge(19);
        // obj.setName("Mayank");
        int stud1Age = obj.getAge();
        String stud1Name= obj.getName();
        System.out.println(stud1Name + " " + stud1Age);
    }
    
}
