package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     * 
     */
    public static void sort(int[] arr) 
    {
        //insertion sort and selection sort is the same (I believe)
        int N = arr.length;
        for(int i = 0 i < N - 1; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < N; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            exch(arr, i, minIndex);
        }
    }

    public static void exch(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
