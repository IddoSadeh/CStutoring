public class MyPetLabrodor extends MyPetDog1 {
    public MyPetLabrodor(String name, String breed, int age)
    {        
        super(name, breed, age); 
    }    
    //@Override
    public void bark()
    {
        System.out.println("bark");
        super.bark();
    }
}