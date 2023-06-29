import java.util.*;

public class Main{

    public static void main(String [] args)
    {
        Animal dog = new Animal("Dog", "bark", 3);  
        Animal cat = new Animal("cat", "meow", 8);      
        Animal cat2 = new Animal("cat", "meow", 6);
        String noise = dog.makeSound();
        String describe = dog.describe();
        System.out.println("Hello");
        System.out.println(noise);
        System.out.println(describe);
        dog.doBirthday();
        String describeNew = dog.describe();
        System.out.println(describeNew);

        if(cat.canMateWith(dog) == true)
        {
            System.out.println("Can mate!");
        }
        else
            System.out.println("Can't mate!");

        Cage c1 = new Cage();
        c1.loadAnimal(cat);
        if(c1.empty() == true)
            System.out.println("Cage empty");
        else
            System.out.println("Cage full");
        c1.contents();

    }









}