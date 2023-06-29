import java.util.*;

public class Animal
{
    private String name;
    private String sound;
    private int age;
    /**
     * 
     * 
     * 
     * 
     * 
     * 
     * @return
     */
    public String makeSound()
    {
        
        String s = sound + ", " + sound + "! " + "Says " + name;    
        return s;

    }
    public Animal(String name, String sound, int age)
    {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }
    public String getName()
    {
        String animalName = this.name;
        return animalName;
    }
     public int getAge()
    {
        int animalAge = this.age;
        return animalAge;
    }
    /**
     * 
     * 
     * 
     * @return
     */
    public String describe()
    {
        String s = "This " + name + " is " + age + " years old."; 
        return s;

    }
    public void doBirthday()
    {
        int animalAge = age;
        age = animalAge + 1;
    }
    public boolean canMateWith(Animal animalName)
    {
        if(this.name.equals(animalName.getName()))
        {
            return true;
        }
        else
            return false;
    }
    /**
     * 
     * 
     * 
     * 
     * @param args
     */
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
        if(cat.canMateWith(cat2) == true)
        {
            System.out.println("Can mate!");
        }
        else
        System.out.println("Can't mate!");

    }




}