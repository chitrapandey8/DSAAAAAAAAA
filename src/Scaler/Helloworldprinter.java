package Scaler;

public class Helloworldprinter implements Runnable {
    @Override
    public void  run(){
        System.out.println("hello world!" + Thread.currentThread().getName());
    }
}
