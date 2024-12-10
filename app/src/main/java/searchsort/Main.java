package searchsort;

/**
 * Main class for manually testing your code.
 */
public class Main {
    public static void main(String[] args) {
        // Test Util.exch
        int[] arr1 = { 1, 2, 3, 4, 5 };
        for (int num : arr1) 
        {
            System.out.print(num + "");
        }
        System.out.println();

        Util.exch(arr1, 0,1);
        for(int num : arr1)
        {
            System.out.print(num + " ");
        }
        System.out.println();


        // Test Util.shuffle
        int[] arr2 = { 1, 2, 3, 4, 5 };
        for (int num : arr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        Util.shuffle(arr2, 12345L); // 12345L converts the number to a long
        for(int num : arr2)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Generated random array: ");
        int[] randomArray = Util.generateRandomArray(5, 12345L);
        for (int num : randomArray) System.out.print(num + " ");
        System.out.println();

        // Test Util.isSorted
        System.out.println(Util.isSorted(new int[]{1, 2, 3, 4, 5}));
        System.out.println(Util.isSorted(arr2));

        //Test MergeSort
        int[] mergeArr = { 1, 2, 3, 4, 5 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(mergeArr);
        System.out.println("sorted Array");
        for(int num : mergeArr)
        {
            System.out.println(num);
        }

        //Test exch again
        int[] arr = {5, 2};
        Util.exch(arr, 0, 1);
        System.out.println(arr[0] + arr[1]);
        //Test binary search
        
        //Test insertion sort

        //Test linear search

        //Test Median

        //Test quickSort

        //Test Selection Sort


    }
}
