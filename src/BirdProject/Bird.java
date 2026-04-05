package BirdProject;

/////////////////////VERSION 0??????????????????????????????????????????
// class Bird {
//    String colorr;
//    String type;
//    String sound;
//    String countryoforigin;
//
//    Bird(String colorr, String type, String sound, String countryoforigin){
//      this.colorr =  colorr;
//      this.type = type;
//      this.sound = sound;
//      this.countryoforigin = countryoforigin;
//    }
//
//    void makeSound(){
//        System.out.println("make sound" + this.sound);
//    }
//
//      void fly(String type){
//        if(type == "crow"){


//////////////////////////////////////////////VERSION 1????????????????????????????????????
abstract class Bird{
    String colorr;
    String type;
    String sound;
    String countryoforigin;

    Bird(String colorr, String type, String sound, String countryoforigin){
      this.colorr =  colorr;
      this.type = type;
      this.sound = sound;
      this.countryoforigin = countryoforigin;
    }

    abstract void fly();

    void makeSound(){
        System.out.println("make sound" + this.sound);
    }
}

class Crow extends  Bird{

    Crow(String colorr, String type, String sound, String countryoforigin){
        super(colorr,type,sound,countryoforigin);

    }
    @Override
    void fly(){
        System.out.println("crow is crowing");
    }

}

class Sparrow extends Bird{
    Sparrow(String colorr, String type, String sound, String countryoforigin){
        super(colorr, type, sound, countryoforigin);
    }

    @Override
    void fly() {
        System.out.println("Sparrow is sparrwing");
    }
}

class Penguin extends Bird{
    Penguin(String colorr, String type, String sound, String countryoforigin){
        super(colorr, type, sound, countryoforigin);
    }

    @Override
    void fly() {
        System.out.println("cant fly");
    }
}