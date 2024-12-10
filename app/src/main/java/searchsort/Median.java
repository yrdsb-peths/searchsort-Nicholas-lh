package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if(arr.length == 0) //base case?
        {
            return 0.0;
        }
        QuickSort quickSort = new QuickSort(); //create the instance
        quickSort.sort(arr);
        return calculatedMedian(arr);
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if(arr.length == 0) //empty array case
        {
            return 0.0;
        }
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        for(int num : arr)
        {
            System.out.print(num);
        }
        System.out.println();
        return calculatedMedian(arr);
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        if(arr.length == 0) //empty array case
        {
            return 0.0;
        }
        InsertionSort.sort(arr);
        return calculatedMedian(arr);
    }

    private double calculatedMedian(int[] arr)
    {
        if(arr.length == 0) //empty array case
        {
            return 0.0;
        }
        if(arr.length % 2 == 0)
        {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
        else
        {
            return arr[arr.length / 2];
        }
    } 
}
