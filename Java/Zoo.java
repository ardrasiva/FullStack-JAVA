interface Animal {
    public void makeSound();
    public void move();
}

class Bird implements Animal{
    public void makeSound(){
        System.out.println("Chirp");
    }
    public void move(){
        System.out.println("Fly\n");
    }

}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
    public void move(){
        System.out.println("Run\n");
    }
}
public class Zoo {
    public static void main(String args[])
    {
        Bird b = new Bird();
        Dog d = new Dog();
        System.out.println("---Properties of Bird Class---");
        b.makeSound();
        b.move();
        System.out.println("---Properties of Dog Class---");
        d.makeSound();
        d.move();
    }
}