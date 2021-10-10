package orderingsystem;

import java.util.*;
import static orderingsystem.Stock.Addstock;
import static orderingsystem.Stock.Modifystock;
import static orderingsystem.Stock.display;

public class Stock {

    static List<Stock> stockList = new ArrayList<>();
    int productId;
    int Quantity;
    int ShopNo;

    public Stock() {
    }

    public Stock(int productId, int Quantity, int ShopNo) {
        this.productId = productId;
        this.Quantity = Quantity;
        this.ShopNo = ShopNo;
    }

    public static void Addstock() {

        Stock stock = new Stock();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Product Id  : ");
        stock.productId = in.nextInt();
        System.out.println("Enter Quantity   : ");
        stock.Quantity = in.nextInt();
        System.out.println("Enter ShopNo  : ");
        stock.ShopNo = in.nextInt();

        stockList.add(stock);

    }

    public static void Modifystock() {

        // Stock stock = new Stock();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Stock index to modify ");
        int Stockindex = in.nextInt();

        Stock stock = SelectStockItem(Stockindex);

        System.out.println("Enter Product Id  : ");
        stock.productId = in.nextInt();
        System.out.println("Enter Quantity   : ");
        stock.Quantity = in.nextInt();
        System.out.println("Enter ShopNo  : ");
        stock.ShopNo = in.nextInt();

        stockList.set(Stockindex,stock);

    }

    public static void display() {

        for (Stock stock : stockList) {

            System.out.println("Product Id : " + stock.productId);
            System.out.println("Quantity : " + stock.Quantity);
            System.out.println("ShopNo : " + stock.ShopNo);

        }
        System.out.println("");

    }

    public static Stock SelectStockItem(int Productid) {

        return stockList.get(Productid);

    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getShopNo() {
        return ShopNo;
    }

}

class shoptest {

    public static void main(String[] args) {

        Stock obj = new Stock();

        Addstock();
        display();

        Modifystock();
        display();

    }

}
