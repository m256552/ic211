import java.util.*;

public class Cage 
{
    private Animal animalInCage = null;

    public void loadAnimal(Animal a)
    {      
        animalInCage = a;
    }
    public boolean empty()
    {
        if(animalInCage == null)
            return true;
        else   
            return false;
    }
    public void contents()
    {
        //this.animalInCage
        //this.animalInCage.age,.sound,.name
        String s = "This " + this.animalInCage.getName()
                           + " is " 
                           + this.animalInCage.getAge() 
                           + " years old";

        System.out.println(s);
    }
    public static void main(String [] args)
    {
        Cage c1 = new Cage();
        System.out.println("test");
        //c1.loadAnimal(Animal.name);
        //c1.empty();


    }
}
