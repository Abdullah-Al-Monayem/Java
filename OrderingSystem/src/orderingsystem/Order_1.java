package orderingsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.*;

public class Order_1 {

    static List<Order_1> Order_list = new ArrayList<Order_1>();
    int orderId, customerId, productid;
    String CustomerName;
    float Amount;
    Date OrderDate;

    public Order_1(int orderId, int customerId, int productid, String CustomerName, float Amount, Date OrderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productid = productid;
        this.CustomerName = CustomerName;
        this.Amount = Amount;
        this.OrderDate = OrderDate;
    }

    public static void main(String[] args) throws ParseException {
        Order_1 order = new Order_1();
        CreateOrder();
       // EditOrder(0);
        Display();
    }

    static void CreateOrder() throws ParseException {

        Order_1 newOrder = new Order_1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id :");
        newOrder.orderId = sc.nextInt();
        System.out.println("Enter Cusmer Id :");
        newOrder.customerId = sc.nextInt();
        System.out.println("Enter Product Id :");
        newOrder.productid = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer Name :");
        newOrder.CustomerName = sc.nextLine();
        System.out.println("Enter Amount :");
        newOrder.Amount = sc.nextFloat();
        System.out.println("Enter Date  :");

        //  String sDate1="31/12/1998";
        //  System.out.println(sDate1+"\t"+date1);
        sc.nextLine();
        String sDate1 = sc.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        newOrder.OrderDate = date1;

        Order_list.add(newOrder);
        // Order.d

    }

    static void CreateOrder1() {

        //  Order newOrder = new Order();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id :");
        int a = sc.nextInt();
        System.out.println("Enter Cusmer Id :");
        int b = sc.nextInt();
        System.out.println("Enter Product Id :");
        int c = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer Name :");
        String s = sc.nextLine();
        // String s1=s;
        System.out.println("Enter Amount :");
        float f = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Date  :");

        String d = sc.nextLine();

        // newOrder = new Order(a,b,c,s,f,d);
        Order newOrder = new Order(a, b, c, s, f, d);

        //  Order_list.add(newOrder);
    }

    public static void EditOrder(int OrderId) throws ParseException {

        Order_1 editOrder = Order_list.get(OrderId);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cusmer Id :");
        editOrder.customerId = sc.nextInt();
        System.out.println("Enter Product Id :");
        editOrder.productid = sc.nextInt();
        sc.nextLine();
        System.out.println("Customer Name :");
        editOrder.CustomerName = sc.nextLine();
        System.out.println("Enter Amount :");
        editOrder.Amount = sc.nextFloat();
        System.out.println("Enter Date  :");

        sc.nextLine();
        String sDate1 = sc.nextLine();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        editOrder.OrderDate = date1;

        Order_list.set(OrderId, editOrder);

    }

    public static void Display() {

        System.out.println("fetching every Order information......");
        for (Order_1 Or_list : Order_list) {
            System.out.println("Id             :" + Or_list.orderId);

            System.out.println("Cusmer Id      :" + Or_list.customerId);

            System.out.println("Product Id     :" + Or_list.productid);

            System.out.println("Customer Name  :" + Or_list.CustomerName);

            System.out.println("Enter Amount   :" + Or_list.Amount);

            System.out.println("Enter Date     :" + Or_list.OrderDate);
        }
        System.out.println("");

    }

    public Order_1() {
    }

    public static void setOrder_list(List<Order> Order_list) {
        Order.Order_list = Order_list;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public static List<Order_1> getOrder_list() {
        return Order_list;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getProductid() {
        return productid;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public float getAmount() {
        return Amount;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

}
