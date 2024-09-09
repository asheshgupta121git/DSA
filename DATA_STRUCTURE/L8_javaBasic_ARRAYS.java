// package DATA_STRUCTURE;

// //                  ------>>>ARRAYS<<<------
// import java.security.PublicKey;
// import java.util.*;

// public class L8_javaBasic_ARRAYS {

//     public static void update(int marks[]) {
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     // LINEAR SEARCHING
//     public static int linearSearch(int number[], int key) {
//         for (int i = 0; i < number.length; i++) {
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     // largest of a number
//     public static int largest(int arr[]) {
//         int max = Integer.MIN_VALUE; // -infinity
//         for (int i = 0; i < arr.length; i++) {
//             if (max < arr[i])
//                 max = arr[i];
//         }
//         return max;
//     }

//     // smallest of a number
//     public static int smallest(int arr[]) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (min > arr[i])
//                 min = arr[i];
//         }
//         return min;
//     }

//     // BINARY SEARCH
//     public static int binarySearch(int arr[], int key) {
//         int start = 0;
//         int end = arr.length - 1;
//         int mid;
//         while (start <= end) {
//             mid = (start + end) / 2;
//             if (arr[mid] == key)
//                 return mid;
//             if (arr[mid] > key) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return -1;

//     }

//     // reversing an array
//     public static void reversingArray(int arr[]) {
//         for (int i = 0; i < arr.length / 2; i++) {
//             int a = arr[i];
//             int b = arr[arr.length - i - 1];
//             arr[i] = b;
//             arr[arr.length - i - 1] = a;
//         }

//     }

//     // pairs in an array
//     public static void printPairs(int arr[]) {
//         int total_no_pairs = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 System.out.print("{" + arr[i] + "," + arr[j] + "}" + " ");
//                 total_no_pairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("total no of pairs is : " + total_no_pairs);
//     }

//     // print subarrays
//     public static void subarrays(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 System.out.print("{");
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k]);
//                 }
//                 System.out.print("}" + " ");
//             }
//             System.out.println();
//         }

//     }

//     // sum of sub arrays
//     public static void sumSubarrys(int arr[]) {
//         int max_sum = Integer.MIN_VALUE;
//         int min_sum = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     // System.out.print(arr[k]);
//                     sum += arr[k];
//                 }
//                 System.out.print(sum);
//                 if (max_sum < sum)
//                     max_sum = sum;
//                 if (min_sum > sum)
//                     min_sum = sum;
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         System.out.println("the max sum is : " + max_sum);
//         System.out.println("the min sum is : " + min_sum);
//     }

//     // optimize method for max and min sum of sub arrays using prifix arrays
//     public static void prefix_max_min_subarraySum(int arr[]) {
//         int max_sum = Integer.MIN_VALUE;
//         int min_sum = Integer.MAX_VALUE;
//         int sum = 0;
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];
//         // calculate prefix
//         for (int i = 1; i < arr.length; i++) {
//             prefix[i] = prefix[i - 1] + arr[i];
//         }

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

//                 if (max_sum < sum)
//                     max_sum = sum;
//                 min_sum = Math.min(sum, min_sum);
//             }
//         }
//         System.out.println("max sum is : " + max_sum);
//         System.out.println("min sum is : " + min_sum);

//     }

//     // Kadan's algorithm for max subarray sum
//     public static void kadansSubArraySum(int arr[]) {
//         int max_sum = Integer.MIN_VALUE;
//         int min_sum = Integer.MAX_VALUE;
//         int complete_sum = 0;
//         int cs = 0;
//         for (int i = 0; i < arr.length; i++) {
//             complete_sum += arr[i];// complete_sum=complete_sum+arr[i]
//             cs += arr[i]; // for minimum number for negitive numbers.
//             if (complete_sum < 0) {
//                 complete_sum = 0;
//             }
//             max_sum = Math.max(complete_sum, max_sum);
//             min_sum = Math.min(cs, min_sum);
//         }
//         System.out.println("maximum of the sub array is : " + max_sum);
//         System.out.println("minimum of the sub array is : " + min_sum);
//     }

//     // TRAPPED RAIN WATER PROBLEAM
//     public static int TRAPPED(int hight[]) {
//         int n = hight.length;

//         // calculate left max array
//         int leftmax[] = new int[n];
//         leftmax[0] = hight[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(hight[i], leftmax[i - 1]);
//         }

//         // calculate right max array
//         int rightmax[] = new int[n];
//         rightmax[n - 1] = hight[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightmax[i] = Math.max(hight[i], rightmax[i + 1]);
//         }

//         int waterlevel[] = new int[n];
//         int trappedwarter = 0;
//         for (int i = 0; i < n; i++) {
//             // calculate water level=min(left max,right max)
//             waterlevel[i] = Math.min(leftmax[i], rightmax[i]);

//             // calculate trapped water=(water level - hight)
//             trappedwarter += waterlevel[i] - hight[i];
//         }
//         return trappedwarter;
//     }

//     // BEST TIME TO BUS OF SELL THE STOCK
//     public static int stocks(int prices[]) {
//         // prices=[7,1,5,3,6,4]
//         int buy_price = Integer.MAX_VALUE;
//         int max_profit = 0;
//         int profit;
//         for (int i = 0; i < prices.length; i++) {
//             if (buy_price < prices[i]) { // selling=prices[i].
//                 profit = prices[i] - buy_price;
//                 max_profit = Math.max(max_profit, profit);
//             } else {
//                 buy_price = Math.min(buy_price, prices[i]);
//             }

//         }
//         return max_profit;
//     }

//     // RETURN ALL THE TRIPLETS
//     public static void triplets(int nums[]) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 for (int k = j + 1; k < nums.length; k++) {
//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         if (i != j && i != k && j != k)
//                             System.out.print(nums[i] + "," + nums[j] + "," + nums[k]);
//                     }
//                 }
//                 System.out.println();
//             }

//         }
//     }

//     // reprated number
//     public static boolean repeated(int nums[], int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         // // array making
//         // int marks[] = new int[50];

//         // int number[] = { 1, 2, 3, 4, 5 };

//         // String fruits[] = {"mango","guava","orange"};

//         // // input and output in array
//         // marks[0]=sc.nextInt();//physic marks
//         // marks[1]=sc.nextInt();//chemistry marks
//         // marks[2]=sc.nextInt();//maths marks

//         // System.out.println("physic = " + marks[0]);
//         // System.out.println("chemistry = " + marks[1]);
//         // System.out.println("maths = " + marks[2]);

//         // //percentage of the marks
//         // int percentage = marks[0] + marks[1] + marks[2];
//         // System.out.println(percentage/3);

//         // //update in marks
//         // marks[2]=100;
//         // System.out.println("maths = " + marks[2]);
//         // marks[1]=marks[1]+2;
//         // System.out.println(marks[1]);

//         // //to find the lenght of array we use (.lenght)
//         // System.out.println("lenght of array = " + marks.length);

//         // PASSING ARRAY AS AN ARGUMEMTS

//         // int marks[]={44,45,46,47};
//         // update(marks);
//         // for(int i=0;i<marks.length;i++){
//         // System.out.println(marks[i]);
//         // }

//         // --->>>LINEAR SEARCHING<<<----
//         // int numbers[] = {2,4,6,8,10,12,14,16};
//         // int key=14;

//         // int index=linearSearch(numbers, key);
//         // if(index==-1)
//         // System.out.println("not found");
//         // else
//         // System.out.println("key is found at index " + index);

//         // largest of a number
//         // int arr[]={1,2,3,4,52,34,1,0};
//         // int largest=largest(arr);
//         // System.out.println(largest);

//         // smallest of a number
//         // int arr[]={10 ,2,3,4,22,42};
//         // int smallest=smallest(arr);
//         // System.out.println(smallest);

//         // ---->>>BINARY SEARCHING<<<----
//         // int arr[]={2,4,6,8,10,12,14};
//         // int key=10;
//         // int index=binarySearch(arr, key);
//         // if(index==-1){
//         // System.out.println("not found");
//         // }
//         // else{
//         // System.out.println("key is found at index : " + index);
//         // }

//         // --->>REVERSING AN ARRAY<<<----
//         // int arr[]={1,2,3,4,5};
//         // reversingArray(arr);
//         // for(int i=0;i<arr.length;i++){
//         // System.out.print(arr[i] + " ");
//         // }

//         // PAIRS OF AN ARRAY
//         // int arr[] = { 2, 4, 6, 8, 10 };
//         // printPairs(arr);

//         // sub-arrays
//         // int arr[]={2,4,6,8,10};
//         // subarrays(arr);

//         // sum of subarrays
//         // int arr[]={-2,-3,4,-1,-2,1,5,-3};
//         // sumSubarrys(arr);
//         // prefix_max_min_subarraySum(arr); //using prefix array
//         // kadansSubArraySum(arr); //kadan's algorithms

//         // TRAPPED RAIN WATER PROBLAME (DSA #22) VVI.
//         // int hight[]={4,2,0,6,3,2,5};
//         // int volume= TRAPPED(hight);
//         // System.out.println("amount of water trapped is : "+volume);

//         // buying and selling stock (DSA) VVI
//         int prices[] = { 7, 1, 5, 3, 6, 4 };
//         System.out.println(stocks(prices));

//         // assignments questions
//         // question 1.
//         // int nums[]= new int[100000];
//         // System.out.println( "enter the size of the array");
//         // int n=sc.nextInt();
//         // for(int i=0;i<n;i++){
//         // nums[i]=sc.nextInt();
//         // }
//         // System.out.println(repeated(nums, n));

//         // TRIPLETS
//         int nums[] = { -1, 0, 1, 2, -1, -4 };
//         triplets(nums);

//     }
// }
