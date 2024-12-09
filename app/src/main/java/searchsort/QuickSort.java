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
        return 0;

    }

}
