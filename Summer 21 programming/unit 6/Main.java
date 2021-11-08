import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
       /* int[] randomnumbers = new int[10];
        for (int i=0;i<10;i++)
        {
            randomnumbers[i]=(int)(Math.random()*10);
            System.out.println(randomnumbers[i]);
        }
        int sum = 0;
        for (int j=0;j<10;j++)
        {
            sum = randomnumbers[j]+sum;
        }
        double avg = sum/10;
        System.out.println(avg);*/
        ArrayList<Integer> randomnumbers = new ArrayList<Integer>(); // creaed and declared new arraylist
        for(int i=0;i<10;i++)
        {
            randomnumbers.add((int)(Math.random()*10+1)); //for every titeration we add a random number to the list between 1 and 10
        }
        
        System.out.println(randomnumbers);//print list
        int sum=0;
        for(int j=0;j<10;j++)
        {
            sum = randomnumbers.get(j)+sum;
        }
        System.out.println(sum);
        while (sum<100)
        {
            Integer temp = (int)(Math.random()*10+1);
            randomnumbers.add(temp);
            sum = temp+sum;

        }
        System.out.println(randomnumbers);
        System.out.println(sum);

        System.out.println(randomnumbers.size());
        int min=10;
        int temp2=0;
        for(int k=0;k<10;k++)
        {
            if(randomnumbers.get(k)<min){
                min=randomnumbers.get(k);
                temp2=k;
            }
        }
        randomnumbers.set(temp2,randomnumbers.get(temp2)*2);
        System.out.println(randomnumbers);

        for (int z=1;z<randomnumbers.size();z++)//insertion sort
        {
            int current =randomnumbers.get(z);
            int x =z-1;
            while((x>-1)&&randomnumbers.get(x)>current){
                randomnumbers.set(x+1,randomnumbers.get(x));
                x--;
            }
            randomnumbers.set(x+1,current);
        }
        System.out.println(randomnumbers);
    }
}