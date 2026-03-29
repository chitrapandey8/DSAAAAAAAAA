package Scaler;

  class user{
    private String name;  //private attributes will be still their in the memoery od child class even tho they cannot access it bcoz its private.
    int age;

    void canspeak(){
        System.out.println("this person is speaking");
    }

    void setName(String name){
      this.name = name;
    }

    String getName(){
      return name;
    }

}

class  Student extends user{


}

public class Inheritance {
    static void main() {
  Student s1 = new Student();
  user u = new user();
      System.out.println(s1.age);
      System.out.println(u.age);
      //System.out.println(u.name); cannot be accessd
       u.setName("jdnend");
      System.out.println(u.getName());
  s1.canspeak();
  u.canspeak();
    }
}
