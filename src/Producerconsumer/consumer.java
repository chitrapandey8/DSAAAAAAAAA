package Producerconsumer;

public class consumer implements  Runnable{
    private Shop shop;
    public consumer(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {

            while(true){
                synchronized (shop){
                    if(shop.size > 0){
                        shop.size -= 1;
                        System.out.println("BUYING CLOTH" + shop.size + "clothwes");
                    }
                }


        }


    }
}
