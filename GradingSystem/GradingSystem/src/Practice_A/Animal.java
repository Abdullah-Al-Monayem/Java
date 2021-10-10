
package Practice_A;


public class Animal {
    
    private int eye;
    protected int legs;
    public String name;

    public Animal() {
    }

    public Animal(int eye, int legs, String name) {
        this.eye = eye;
        this.legs = legs;
        this.name = name;
    }
    
    
    public void display()
    {
        System.out.println("Eye ="+eye);
        System.out.println("legs ="+legs);
        System.out.println("name ="+name);
       
    }
    
    /*
    private void notAccess_1(){
    
        System.out.println("I am private Method");    
    }

       */
    
    protected void eat(){
    
        System.out.println("Animal can eat");
       
    
    }
}
