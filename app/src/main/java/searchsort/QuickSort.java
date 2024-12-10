package searchsort;

public class QuickSort extends Sort {
    /**
     * Sort the array arr using quick sort algorithm.
     */
    @Override
    public void sort(int[] arr) 
    {
        quickSort(arr, 0, arr.length - 1);
    }

    /*
     * Sort the subarray arr[low..high] using quick sort algorithm.
     */
    private void quickSort(int[] arr, int low, int high) 
    {
        if(low < high)
        {
                int pivotIndex = partition(arr, low, high);

                quickSort(arr, low, pivotIndex - 1);

                quickSort(arr, pivotIndex + 1, high);
        }
    }

    /*
     * Partition the subarray arr[low..high] using the last element as pivot.
     * Return the index of the pivot element after partition.
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++; 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    /* just a faster way to implement the exch method */
    //private void swap(int[] arr, int i, int j)
    //{
        //int temp = arr[i];
        //arr[i] = arr[j];
        //arr[j] = temp;
    //}

}
