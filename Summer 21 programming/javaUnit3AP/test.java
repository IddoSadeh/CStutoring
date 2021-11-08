import static java.lang.*;

public class test {

    public static void main(String[] args){
        String song ="Old MacDonald had a farm Ee i ee i o And on his farm he had some cows Ei i ee i oh With a moo-moo here And a moo-moo there";
        String word = new String("farm");
        System.out.println(word.charAt(1));
        System.out.println(word.substring(1,2));
        int indexFarm = song.indexOf("farm");
        System.out.println(indexFarm);
    }
}