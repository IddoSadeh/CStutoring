import java.util.*;

public class MyPetDog1
{    
    public String name;    
    public String breed;    
    public int age;    
    public MyPetDog1(String name, String breed, int age)
    {        
        this.name = name;        
        this.breed = breed;        
        this.age = age;    
    }    
    public MyPetDog1()
    {        
            this("" ,"" , 1);    
    }    
    public void bark()
    {        
            System.out.println("woof");    
    }    
    public static void main(String[] args)
    {    
            ArrayList<MyPetDog1> doglist = new ArrayList<MyPetDog1>();
         doglist.add(new MyPetChihuahua("bobby", "chihuahua", 5));
         doglist.add(new MyPetLabrodor("rudolph", "lab", 2));

         for(MyPetDog1 dog : doglist)
         {
                 dog.bark();
         }

    } 
}