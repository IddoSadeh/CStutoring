import java.lang.Math;

public class BlackJack {
    public static void main(String args[]) {
        for(int i=0;i<10;i++){
            BlackJack1();
        }
    }
    public static void BlackJack1(){
        int originalDraw = (int)(Math.random()*19 +2);
        int newDraw = (int)(Math.random()*11 + 1);
        System.out.println(originalDraw);
        System.out.println(newDraw);
        if(originalDraw + newDraw >21){
            if(newDraw == 11){
                System.out.println(originalDraw+1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            System.out.println(originalDraw+newDraw);
        }
    }
}