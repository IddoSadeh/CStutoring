public class unit3 
{
    public static void main(String[] args)
    {
        Boolean isDinner = true;
        Boolean isSaturday = true;
        
        if (isDinner && isSaturday)
        {
            System.out.println("lets order pizza");
        }
        else if (isDinner && !isSaturday)
        {
            System.out.println("we have food at home");
        }
        if (isDinner || isSaturday)
        {
            System.out.println("Drink water");
        }
        
    }
}