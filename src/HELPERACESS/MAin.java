package HELPERACESS;

import Acessmodifier.student;

public class MAin extends student {
    static void main() {
//        student s1 = new student();
//        s1.name = "";
//        s1.age = 9; //cant acces bcoz it is in a differnt folder
//        s1.gender = "kd"; //cant acces bacoz this i not a child class
//        s1.batch = "eddd"; //can acces bacoz public

        MAin s1 = new MAin();
        s1.gender = "dwjd"; ///cjild class se accesable hai kyuki proteced lagaya tha
    }
}
