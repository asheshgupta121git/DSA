import java.util.*;

public class L16_time_And_space_complexities {
    // print array.
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ----------------------------------------------------------------------------------------------------------------

    // modified bubble sort time complexity analysis.
    public static void bubblesort(int arr[]) {
        /*
         * int this modified bubble sort int he case of the best case the time
         * complexity is O(n) and
         * in the average case the time complexity is less than the oridinary bubble
         * case.
         * 
         */

        for (int i = 0; i < arr.length - 1; i++) {
            Boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }

        }
    }

    // ------------------------------------------------------------------------------------------------------------------------------------

    // binary search time complexity analysis.
    public static int binary(int arr[], int target) {
        /*
         * the binary search has O(logn) time complexity in all best, average, wrost
         * cases which is very good time complexity
         */

        int start = 0;
        int end = arr.length - 1;

        // bset case
        while (start <= end) {
            int mid = (start + end) / 2;

            // bestt case
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start++;
            } else {
                end--;
            }
        }
        return -1;

    }

    // ---------------------------------------------------------------------------------------------------------------------------------------

    // analysis of a time complexity of a factorial of a number using recurssion
    public static int factorial(int num) {
        /*
         * the the recursion factorial the time complexity is O(n) and the space
         * cpmplexity if O(n)
         */
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------

    // analysis of the space and time commplexity of sum of n numbers
    public static int sum(int n) {
        /* the time and space complexit is O(n) in all cases */
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    // ---------------------------------------------------------------------------------------------------------------------------------------

    // analysis of the space and time commplexity of fibbonachi of a numbers.
    public static int fib(int num) {
        /* the time complexity is O(2^n) and the space complexity is O(n) */
        if (num == 0 || num == 1) {
            return num;
        }

        return fib(num - 1) + fib(num - 2);
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------

    // mregesort space and time complexity analysis.
    /*  the time complexity is O(nlogn) and the space complexity is O(n) */
    public static void mergesort(int arr[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }

        // kaam
        int mid = start + (end - start) / 2;

        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, end, mid);

    }

    // merge function
    public static void merge(int arr[], int start, int end, int mid) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

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

        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    // ------------------------------------------------------------------------------------------------------------------------------------------------
    //power function space and time complexity.
    public static int power(int num, int pow){
        /*sapce complexity is O(n) and time complexity is O(n) */
        if(pow==0){
            return 1;
        }
        return num * power(num, pow-1);
    }

    //OPTIMIZE POWER FUNCTION
    public static int power2(int num , int pow){
        /*the time complexity is O(n) and space complexity is O(n) */
        // base case
        if(pow == 0){
            return 1;
        }
        int halfpow = power2(num, pow/2) * power2(num,pow/2);

        if(pow%2 != 0){
            return num*halfpow;
        }

        return halfpow;
    }

    //mostr optimize solution to calculate the power
    public static int power3(int num, int pow){
        /*the time complexity is O(logn) and space complexity is O(logn) */
        //base case
        if(pow==0){
            return 1;
        }
        int halfpower= power3(num, pow/2);
        int halfpowerSq = halfpower*halfpower;

        if(pow%2 != 0){
            return num* halfpowerSq;
        }

        return halfpowerSq;
    }


    //---------------------------------------------------------------------------------------------------------------------------------------------




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // modified bubble sort.
        // int arr[]= {3,4,2,1,5};
        // bubblesort(arr);
        // printArray(arr);

        // ------------------------------------------------------------------------------------------------------------------------

        // //binary search
        // int arr[]={3,4,5,3,5,6};
        // int target = 6;
        // int i=binary(arr,target);
        // System.out.println(i);

        // --------------------------------------------------------------------------------------------------------------------------------

        // factorial of a number using recurison
        // int num = 5;
        // int i = factorial(num);
        // System.out.println(i);

        // ------------------------------------------------------------------------------------------------------------------------------

        // sum of n using recursion
        // int i=5;
        // int j= sum(i);
        // System.out.println(j);

        // -----------------------------------------------------------------------------------------------------------------------------

        // fibbonachi of a number.
        // int i=5;
        // int j= fib(i);
        // System.out.println(j);

        // -----------------------------------------------------------------------------------------------------------------------------

        // mergesort
        // int arr[]={2,3,4,1,5};
        // mergesort(arr, 0, arr.length-1);
        // printArray(arr);

        // ---------------------------------------------------------------------------------------------------------------------------------

        //power function
        int num = 3;
        int pow = 3;
        System.out.println(power(num,pow));
        System.out.println(power2(num, pow));
        System.out.println(power3(num, pow));




    }
}