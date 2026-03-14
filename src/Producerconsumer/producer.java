package Producerconsumer;

import java.sql.SQLOutput;

public class producer implements  Runnable{
     private Shop shop;
    public producer(Shop shop){
       this.shop = shop;
    }


    @Override
    public void run() {

            while(true){
                synchronized (shop){
                    if(shop.size < 5){
                        shop.size += 1;
                        System.out.println("PRODUCING " + shop.size);

                    }
                }


        }

    }
}
