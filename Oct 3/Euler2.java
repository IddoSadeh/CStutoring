import java.sql.Array;
import java.util.*;
public class Euler2{
    public static void main(String[] args)
    {
        List<Integer> test = new ArrayList<Integer>();
        for(int i = 0;i<10;i++)
        {
            test.add(i);
        }
        for(Integer a: test)
        {
            a=a*2;
            System.out.println(a);
        }
    }

}