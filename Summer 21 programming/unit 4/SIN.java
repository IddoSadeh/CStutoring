import java.util.*;

public class SIN {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your SIN: ");
        String sin= new String();
        sin = input.nextLine();
        input.close();
        int i=0;
        if (sin.length() != 9)
        {
            System.out.println("the number you entered is not the right length");
        }
        for (;i<9;i++)
        {
            if(!Character.isDigit(sin.charAt(i)))
            {
                System.out.println("one of characters you entered is not a number");
                break;
            }
        }
        if (i==9)
        {
            System.out.println("your sin is valid");
        }
    }
}