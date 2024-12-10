package searchsort;

/**
 * Main class for manually testing your code.
 */
public class Main {
    public static void main(String[] args) {
        // Test Util.exch
        int[] arr1 = { 1, 2, 3, 4, 5 };
        Util.exch(arr1, 0, 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Test Util.shuffle
        int[] arr = { 1, 2, 3, 4, 5 };
        Util.shuffle(arr, 12345L); // 12345L converts the number to a long
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Test MergeSort
        int[] mergeArr = { 1, 2, 3, 4, 5 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(mergeArr);
        System.out.println("sorted Array");
        for(int num : mergeArr)
        {
            System.out.println(num);
        }

        //test binary search
        BinarySearch binarySearch = new BinarySearch();
        int[] array1 = {2,3,4,10,40};
        int target1 = 10;


    }
}
