package homework8.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Price[] prices = new Price[2];

        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < prices.length; i++) {
            System.out.println("NameOfProduct = ");
            String name = in.next();
            System.out.println("ShopName = ");
            String shopName = in.next();
            System.out.println("Price = ");
            double price = Double.parseDouble(in.next());

            prices[i] = new Price(name, shopName, price);
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }

        System.out.println("Input shopName:");
        String shopName = in.next();

        for (int i = 0; i < prices.length; i++) {
            String name = prices[i].shopName;
            if (name.equals(shopName)) {
                System.out.println(prices[i].toString());
            } else {
                throw new Exception();
            }
        }
    }
}

public class Price {
    String name;
    String shopName;
    double price;

    public Price(String name, String shopName, double price) {
        this.name = name;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "NameOfProduct = " + this.name + "; Shop_name = " + this.shopName + "; Price = " + this.price;
    }
}
