package Scaler;
class student{
    String name;
    int age;
    String course;

    //normal constructor
    student(String name, int age){
        this.name = name;
        this.age = age;
    }

    /// copy  constructor -- copy cosntructor ek aisa conasatructor hota hai jo ek object ki values ko dusre object mai copy krta hai , iske parameter mai objectpass hota hai, copy consstructor mai hum object kli refrence pass karte hai toh obj s1 or obj s2 will point to same refrenrce in memory
    student(student s){
        this.name = s.name;
        this.age = s.age;

    }

    void Details(){
        System.out.println("my name is" + name);
    }

}
public class oops {
   public static void main(String[] args) {
        student s1 = new student("chitarnshi", 2);

        //copy constructor call
       student s2 = new student(s1);

       s2.age  = 3; //

       System.out.println(s1.name);
       System.out.println(s1.age); //this will print 2, s2.age  = 3, krne pe s1 mai koi effect nhi pada kyuki,values copy hui hai, independent stotrage hota hai
       System.out.println(s2.age); //this will print 3


    }
}
