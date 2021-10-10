
package orderingsystem;

import java.util.ArrayList;
import java.util.List;


public class Customer {

    int customerId, phone;
    String customerName, address;
    static List<Customer> customer_list = new ArrayList<Customer>();

    public static void main(String[] args) {
        Customer c1 = new Customer(1, 1000, "Shudipto", "Mirpur");
        Customer.addCustomer(c1);
        Customer c2 = new Customer(2, 2000, "Anamul", "Dhaka");
        Customer.addCustomer(c2);
        Customer c3 = new Customer(3, 5000, "Bijoy", "Chittagong");
        Customer.addCustomer(c3);
        Customer c4 = new Customer(4, 44498, "Haque", "Tangail");
        Customer.addCustomer(c4);

//        checking customer_list
        all_customers();

        editCustomer(0, 1, 1000, "Shudipto", "Mirpur-11");

        deleteCustomer(2);

    }

    public Customer(int customerId, int phone, String customerName, String address) {
        this.customerId = customerId;
        this.phone = phone;
        this.customerName = customerName;
        this.address = address;
    }

    static void addCustomer(Customer e) {
        customer_list.add(e);
    }

    static void editCustomer(int index, int customerId, int phone, String customerName, String address) {

        Customer editableCustomer = customer_list.get(index);//problrm
        editableCustomer.customerName = customerName;
        editableCustomer.customerId = customerId;
        editableCustomer.phone = phone;
        editableCustomer.address = address;
        customer_list.set(index, editableCustomer);
        System.out.println("Updating Customer Information.....");
        System.out.println(customer_list.get(index).customerId);
        System.out.println(customer_list.get(index).customerName);
        System.out.println(customer_list.get(index).phone);
        System.out.println(customer_list.get(index).address);

    }

    static void deleteCustomer(int index) {
        customer_list.remove(index);
        System.out.println("deleting customer from system.....");
        for (Customer clist : customer_list) {
            System.out.println("ID: " + clist.customerId + " Name: " + clist.customerName + " Phone: " + clist.phone + " Adress: " + clist.address);
            System.out.println("-----------------------------------------");
        }
    }

    static void all_customers() {
        System.out.println("fetching every customer information......");
        for (Customer clist : customer_list) {
            System.out.println("ID: " + clist.customerId + " Name: " + clist.customerName + " Phone: " + clist.phone + " Adress: " + clist.address);
            System.out.println("-----------------------------------------");
        }
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getPhone() {
        return phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public static List<Customer> getCustomer_list() {
        return customer_list;
    }

}
