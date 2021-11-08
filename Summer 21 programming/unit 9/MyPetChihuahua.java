public class MyPetChihuahua extends MyPetDog1 {
    public MyPetChihuahua(String name, String breed, int age)
    {        
        super(name, breed, age); 
    }    
    @Override
    public void bark()
    {
        System.out.println("yip");
        super.bark();
    }
}
