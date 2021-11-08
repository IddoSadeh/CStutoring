public class recursion{
    
    public recursion()
    {

    }
    public int factorial(int n)
    {
        if (n == 0)
        {
           return 1;     
        }    
        else 
        {
           return(n * factorial(n-1)); 
        }   
        
    }
    public int fibonacci(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
        else
        { 
            return fibonacci(n-1)+fibonacci(n-2);
           
        }
    }

    //http://max.cs.kzoo.edu/AP/Java/cs210/Labs/Recursion/recursiveSelSort.html
    public void selectionSort(int[] array, int startIndex)
    {
        if ( startIndex >= array.length - 1 )
        {
            return;
        }
            
        int minIndex = startIndex;
        for ( int index = startIndex + 1; index < array.length; index++ )
        {
            if (array[index] < array[minIndex] )
                minIndex = index;
        }
        int temp = array[startIndex];
        array[startIndex] = array[minIndex];
        array[minIndex] = temp;
        selectionSort(array, startIndex + 1);
    }
    //https://www.geeksforgeeks.org/recursive-insertion-sort/
    public void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
        {
            return;
        }
            
      
        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );
      
        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;
      
        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
    //https://www.baeldung.com/java-merge-sort
    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
    
        merge(a, l, r, mid, n - mid);
    }
    public void merge(int[] a, int[] l, int[] r, int left, int right) {
 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++];
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}

      
}