
package orderingsystem;

import java.util.*;

import static orderingsystem.Product.AddProduct;
import static orderingsystem.Product.Display;
import static orderingsystem.Product.ModifyProduct;
import static orderingsystem.Product.SelectProduct;


public class Product {

   static  List<Product> productList = new ArrayList<>();
   int productId ;
   float productPrice;
   String productType;

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public Product() {
    }
    
    
   public  static void AddProduct(){
       
       Product product = new Product();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Product Id :");
       product.productId=sc.nextInt();
       System.out.println("Enter Product Price :");
       product.productPrice=sc.nextFloat();
       sc.nextLine();
       System.out.println("Enter Product Type :");
       product.productType=sc.nextLine();
       
       productList.add(product);
    
    
    }
   
   public  static void ModifyProduct(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Product Id to modify ");
       int productId=sc.nextInt();
      /// Product product = productList.get(productId);
      Product product = SelectProduct(productId);
      
      System.out.println("Enter Product Id to modify:");
      product.productId=sc.nextInt();
       
      // System.out.println("Enter Product Id :");
      // product.productId=sc.nextInt();
       System.out.println("Enter Product Price to modify :");
       product.productPrice=sc.nextFloat();
       sc.nextLine();
       System.out.println("Enter Product Type  to modify:");
       product.productType=sc.nextLine();
       
       productList.set(productId,product);
    
    
    }
   
   public static  Product  SelectProduct(int productId){
       
       
       return productList.get(productId); // problem
   
   
   }
   
   public static void Display() {

        System.out.println("fetching every Product information......");
        System.out.println("L = "+productList.size());
        for (Product p : productList) {
            System.out.println("Product Id        :" + p.productId);
            System.out.println("Product Price :       :" + p.productPrice);
            System.out.println("Product Type :       :" + p.productType);

            
        }
        System.out.println("End");

    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
        return productType;
    }
    
    
       
}


class Ptest{

    
public static void main(String[] args) {
         
        
        Product product = new Product();
        
      AddProduct();
      Display();
      ModifyProduct();
      
      Display();
      
    }

}
