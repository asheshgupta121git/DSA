// package DATA_STRUCTURE;

// import java.util.*;

// public class L9_javaBasic_Basic_shorting_algorithms {

//     // function to print an array
//     public static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     // bubble sort
//     public static void bubblesort(int arr[]) {
//         int swaps = 0;
//         for (int turn = 0; turn < arr.length - 1; turn++) {
//             for (int j = 0; j < arr.length - turn - 1; j++) {
//                 if (arr[j] > arr[j + 1]) { // if to arrrarnde in decending order than (arr[j]<arr[j+1]).
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swaps++;
//                 }
//             }
//         }
//         print(arr);
//         System.out.println("number of swaps is : " + swaps);
//     }

//     // sellection sort
//     public static void selectionsort(int arr[]) {
//         for (int turns = 0; turns < arr.length - 1; turns++) {
//             int min = turns;
//             for (int j = turns + 1; j < arr.length; j++) {
//                 // min = Math.min(arr[min], arr[j]);
//                 if (arr[min] > arr[j]) {
//                     min = j;
//                 }
//             }
//             // swap
//             int t = arr[turns];
//             arr[turns] = arr[min];
//             arr[min] = t;

//         }
//         print(arr);
//     }

//     // insertion sort
//     public static void insertion(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             while (prev >= 0 && arr[prev] > curr) {
//                 // push backword
//                 arr[prev + 1] = arr[prev];
//                 prev--;

//             }
//             // insert number
//             arr[prev + 1] = curr;

//         }
//         print(arr);
//     }

//     // count sorting
//     public static void countSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }
//         // frequency array
//         int count[] = new int[largest + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }

//         // sorting
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//         print(arr);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // BUBBLE SORT
//         // int arr[] = { 1,2,3,4,5};
//         // bubblesort(arr);

//         // SELLECTION SORT
//         // int arr[] = {5,4,1,2,3};
//         // selectionsort(arr);

//         // //INSERTION SORT
//         // int arr[]={5,4,1,2,3};
//         // insertion(arr);

//         // INBUILT SORT IN JAVA
//         // int arr[]={5,4,1,3,2};
//         // Arrays.sort(arr);
//         // print(arr);

//         // to aort in reverae order.
//         // Integer arr2[]={5,4,1,3,2};
//         // Arrays.sort(arr2,Collections.reverseOrder());
//         // for(int i=0;i<arr2.length;i++){
//         // System.out.print(arr2[i] + " ");
//         // }

//         int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
//         countSort(arr);

//     }

// }
