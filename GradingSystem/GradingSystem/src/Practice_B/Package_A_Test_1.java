
package Practice_B;

//import Practice_A.Animal;
//import Practice_A.Cat;
import Practice_A.*;



public class Package_A_Test_1 {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        
       // animal.legs=4; // another package protected member is not accessible; error
       
         animal = new Animal(2,4,"Tom"); // another package protected member and private member is  accessible by constructor
         
         animal.display();
         System.out.println("");
        // animal.eat(); /// // another package protected method is not accessible other package; error
        
        Cat cat = new Cat();
        
      //  cat.age=4; // another package default member is not accessible from other package class; error
        
        cat= new Cat(5,2,4,"Bilay");
        cat.display(); // another package inherited class is also accessible from other package class;
        
        cat.protected_Show(); //another package inherited class  protected method and  private method is accessible by using public method
    }
    
}
