
import java.lang.Math;

public class DiceRoll {
    public static void main(String args[]) {
        int dice1 =  (int)(Math.random()*6 +1);
        int dice2 =  (int)(Math.random()*6 +1);
        System.out.println(dice1);
        System.out.println(dice2);
        if(dice1 == dice2){
            System.out.println(dice1);
            System.out.println(dice1);
        }
    }
}
