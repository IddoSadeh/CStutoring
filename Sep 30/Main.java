public class Main {
    public static void main(String[] args) {
        int[] a1 = {9,3,7,2,8};
        insertionRecursive(a1,a1.length);
        
       
    }
    //precondtion: get array of integers and the size of the array
    //postcondition: return sorted array with help of recursive insertion sort
    public static void insertionRecursive(int[] arr, int n)
    {
         //Base case
         if(n<=1)
         {
             return ;
         }
         //recall the method until you rech base case
         insertionRecursive(arr,n-1);
        //start implementing code
        //arr=[3,9,7] n=3
        int last = arr[n-1];
        int counter = n-2;
        while(last<arr[counter] && counter >=0)
        {
            arr[counter+1]=arr[counter];
             
             counter -=1;
        }
        arr[counter+1]= last;
        
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
