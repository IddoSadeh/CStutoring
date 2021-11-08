public class MyPetRetreiver extends MyPetDog1 {
    public MyPetRetreiver(String name, String breed, int age)
    {        
        super(name, breed, age); 
    }    
    //@Override
    public void bark()
    {
        System.out.println("BWOOF");
        super.bark();
    }
}