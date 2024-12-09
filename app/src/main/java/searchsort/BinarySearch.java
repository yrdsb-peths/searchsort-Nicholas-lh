package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int left = 0; 
        int right = arr.length - 1; 

        while(left <= right)
        {
            int mid = left + (right - left) /2;
            
            if(arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1; 
            }
        }

        return -1;
    }
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) 
    {
        return recursiveFind(arr, target, 0, arr.length - 1);
    }

    private int recursiveFind(int[]arr, int target, int left, int right)
    {
        if(left > right)
        {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        if(arr[mid] == target)
        {
            return mid;
        }
        else if(arr[mid] < target)
        {
            return recursiveFind(arr, target, mid + 1, right);
        }
        else
        {
            return recursiveFind(arr, target, left, mid - 1);   
        }
    }
        

}
