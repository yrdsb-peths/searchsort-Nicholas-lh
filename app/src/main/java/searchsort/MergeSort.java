package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] mergeArr) {
        if(mergeArr.length < 2)
        {
            return;
        }

        int mid = mergeArr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[mergeArr.length - mid];

        for (int i = 0; i < mid; i++)
        {
            left[i] = mergeArr[i];
        }

        for (int i = mid; i < mergeArr.length; i++) 
        {
            right[i - mid] = mergeArr[i];
        }

        sort(left);
        sort(right);

        merge(mergeArr, left, right);

    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] mergeArr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int nL = left.length; 
        int nR = right.length;

        while(i < nL && j < nR)
        {
            if(left[i] <= right[j])
            {
                mergeArr[k++] = left[i++];
            }
            else
            {
                mergeArr[k++] = right[j++];
            }
        }

        while(i < nL)
        {
            mergeArr[k++] = left[i++];
        }
        while(i < nR)
        {
            mergeArr[k++] = right[i++];
        }
    }
}
