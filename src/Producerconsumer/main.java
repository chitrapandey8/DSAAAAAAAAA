package Producerconsumer;

public class main {
    static void main() {
        Shop shop = new Shop();

        Thread t1 = new Thread(new producer(shop));
        Thread t2 = new Thread(new producer(shop));
        Thread t3 = new Thread(new consumer(shop));
        Thread t4 = new Thread(new consumer(shop));
        Thread t5 = new Thread(new consumer(shop));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
