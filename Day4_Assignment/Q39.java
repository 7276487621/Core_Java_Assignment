import java.util.Scanner;

class Product {
    private int pid;
    private int price;
    private int quantity;

    Product(int pid, int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    int getPrice(){
        return price*quantity;
    }
    int getPid(){
        return pid;
    }

    static int total(Product a[]){
        int sum=0;
        for(Product z:a){
            sum=sum+(z.price*z.quantity);
        }
        return sum;
    }

}