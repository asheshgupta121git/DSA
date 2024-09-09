import java.security.PublicKey;
import java.util.*;

public class L15_javaBasic_divide_and_conques {

  
      public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // MREGESORT CODE.
    public static void mergesort(int arr[], int start, int end) {
        // base case.
        if (start >= end) {
            return;
        }
        // working in the merge.
        int mid = start + (end - start) / 2;
        mergesort(arr, start, mid);// for the left part.
        mergesort(arr, mid + 1, end);// for the right part.
        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end) {

        // temperoary array.
        int temp[] = new int[end - start + 1];
        int i = start;// left itterator
        int j = mid + 1;// right itterator
        int k = 0;// traking variable

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // remaining parts of left array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining parts of right array
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy into original array.
        for (i = start, k = 0; k < temp.length; i++, k++) {

            arr[i] = temp[k];
        }

    }

    // QUICKSORT USING RECURSSION.
    public static void quicksort(int arr[], int start, int end) {
        // base case.
        if (start >= end) {
            return;
        }
        // kaam
        int pivotIndex = partion(arr, start, end);
        quicksort(arr, start, pivotIndex - 1);// left
        quicksort(arr, pivotIndex + 1, end);// right
    }

    public static int partion(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;// to make sapce for elements smaller than pivot.

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }

        i++;
        int temp = pivot;
        arr[end] = arr[i]; // do not write --(pivot = arr[i])-- here it is wrong.
        arr[i] = temp;

        return i;
    }

    // SEARCH IN ROTATED AND SORTED ARRAY.
    public static int rotatedarray(int arr[], int start, int target, int end) {
        // base case.
        if (start > end) {
            return -1;
        }

        // kaam
        int mid = start + (end - start) / 2; // finding mid

        // best case.
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1.
        if (arr[start] <= arr[mid]) {
            // case a.
            if (arr[start] <= target && target <= arr[mid]) {
                return rotatedarray(arr, start, target, mid - 1);
            }
            // case b.
            else {
                return rotatedarray(arr, mid + 1, target, end);
            }

        }
        // mid in L2.
        else {
            // case a.
            if (arr[mid] <= target && target <= arr[end]) {
                return rotatedarray(arr, mid + 1, target, end);
            }
            // case b.
            else {
                return rotatedarray(arr, start, target, mid - 1);
            }

        }

    }


    //RETURN THE MAJORITY ELEMENT IN THE ARRAY.
    public static int MAJORITY(int arr[]){
        int half = arr.length/2;
       
        for(int i=0;i<arr.length-1;i++){
             int count=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>half){
                return arr[i];
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MERGESORT USING RECURSSION.
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergesort(arr, 0, arr.length-1);
        printArray(arr);

        // QUICKSORT USING RECURSSION.
        // int arr[] = { 6, 3, 9, 5, 2, 8 };
        // quicksort(arr, 0, arr.length - 1);
        // printArray(arr);

        // search in the rotated and sorted array.
        // int arr[]={4,5,6,7,0,1,2};
        // System.out.print(" enter the target vlaue "+ " ");
        // int target = sc.nextInt();
        // int target_index= rotatedarray(arr, 0, target, arr.length-1);
        // System.out.println(target_index);

        // APPLLY MERGE SORT ON THE STRING.

        /* need to be solve but with help of the sirt. */

        // RETURN THE MAJORITY ELEMENTS IN THE ARRAY.
        // int nums[] = { 3, 3, 1, 1, 1, 2, 2 };
        // int i=MAJORITY(nums);
        // System.out.println(i);

    }
}
