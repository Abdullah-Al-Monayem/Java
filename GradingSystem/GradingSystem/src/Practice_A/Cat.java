package Practice_A;

public class Cat extends Animal {

    int age;
    
    public int weight;

    public Cat() {
    }

    @Override
    protected void eat() {  /// Protect mathod can use in child class
        super.eat();
        System.out.println("Cat eat");
        System.out.println("");
    }

    private void notAccess_1() {

        System.out.println("I am private Method Child");
    }

    public void protected_Show() {
        notAccess_1();
        eat();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Age : " + age);
        System.out.println("See Legs : " + legs);  //protected member is  accessible
        //  System.out.println("Eye : "+eye);  private member is not accessible

        System.out.println("");

    }

    public Cat(int age, int eye, int legs, String name) {
        super(eye, legs, name);
        this.age = age;
    }

}
