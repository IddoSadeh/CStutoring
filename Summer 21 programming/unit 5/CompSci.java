public class CompSci
{
    private String forStringQ;
    private int col;
    private int row;
    private char character;
    private char letter;
    private int i;

    public CompSci(int thei) //constructor that saves int dasta in object
    {
        this.i=thei;
    }
    public CompSci(String theForStringQ, int theCol, int theRow, char theCharacter ) //constuctor for pyrimad object
    {
        this.forStringQ=theForStringQ;
        this.row =theRow;
        this.col=theCol;
        this.character=theCharacter;
    }
    public CompSci(String theForStringQ) //constructor for string objects
    {
        this.forStringQ = theForStringQ;
    
    }
    public CompSci(String theForStringQ, char theCharacter, char theLetter) //constructor for find and replace
    {
        this.forStringQ = theForStringQ;
        this.character = theCharacter;
        this.letter = theLetter;
    }
    public boolean isPalindrome() // mtheod to check if a string is a palindrome
    {
        int i1 = 0;
        int i2 = forStringQ.length() - 1;
        String a =forStringQ.toLowerCase();
        while (i2 > i1) 
        {
            if (a.charAt(i1) != a.charAt(i2))
            {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
    public void printTriangle() //method for printing triangle
    {
        if (forStringQ=="right")
        {
            for (int i=0; i<row+1; i++)
            {
            for (int j=0; j<i; j++)
            {
            System.out.print(character);
            }
            System.out.println("");
            }
            }
        
        else if (forStringQ=="i")
        {
            for (int i=1; i<(row*2); i += 2)
            {
                for (int k=0; k < ((row-1) - i / 2); k++)
                    {
                    System.out.print(" ");
                    }
                for (int j=0; j<i; j++)
                    {
                    System.out.print(character);
                    }
                System.out.println("");
            } 
        }
    }
    public void findAndReplace()
    {
        int index;
        while (forStringQ.indexOf(character) >= 0)
        {
           // Find the next index for 1
          
           index = forStringQ.indexOf(character);
           System.out.println("Found a "+ character +" at index: " + index);
           // Replace the charcater with a letter at index by concatenating substring up to index and then the rest of the string.
           String firstpart = forStringQ.substring(0,index);
           String lastpart = forStringQ.substring(index+1);
           forStringQ = firstpart + letter + lastpart;
           System.out.println("Replaced " + character +" with "+ letter + " at index " + index);
           System.out.println("The message is currently " + forStringQ + " but we aren't done looping yet!");
        }
        System.out.println("Cleaned text: " + forStringQ);
    }
    public void reverse()
    {
        String sReversed = "";
        String ithLetter;
   
        for(int i=0; i < forStringQ.length(); i++) {
            ithLetter = forStringQ.substring(i,i+1);
            // add the letter at index i to what's already reversed.
            sReversed = ithLetter + sReversed;
        }
        System.out.println(forStringQ + " reversed is " + sReversed);
    }

    public void coinFlip()
    {
        if (i>0)
        {
            for(int j=0;j<i;j++)
            {
                long a = Math.round(Math.random());
                System.out.println(a);
                if(a==1)
                    System.out.println("heads");
                else
                    System.out.println("tails");
            }
        }
        else
        {
            System.out.println("the number of iterations you chose is ilegal");
        }
        

    }

}
