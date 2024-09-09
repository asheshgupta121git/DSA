import java.security.PublicKey;
import java.util.*;


import javax.print.attribute.standard.RequestingUserName;

public class L14_javaBasic_RECURSION {
    // print number n to 1.
    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);

    }

    // print number form 1 to n.
    public static void fun2(int n) {

        if (n == 0) {
            return;
        }
        fun2(n - 1);
        System.out.print(n + " ");
    }

    // print factorial of a number.
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int j = n * fact(n - 1);
        return j;
    }

    // sum of n naturals numbers.
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int j = n + sum(n - 1);
        return j;
    }

    // fibonacci of a the nth number.
    public static int fib(int n) {
        // base case
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;

        return fibn;
    }

    // to check the array is sorted or not.
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // to check the frist occurence of the element of an array.
    public static int occurence(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }

        return occurence(arr, key, index + 1);
    }

    // to check the last occurence of the element of an array.
    public static int lastoccurence(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        int isFound = lastoccurence(arr, key, index + 1);
        if (isFound == -1 && arr[index] == key) {
            return index;
        }
        return isFound;
    }

    // to print the power of any number.
    public static int power(int n, int i) {
        if (i == 0) {
            return 1;
        }
        int x = n * power(n, i - 1);
        return x;
    }

    // to print power of any number optimize method. //-->>time complexity is
    // O(logn)
    public static int optpower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optpower(a, n / 2);
        int halfpowersq = halfpower * halfpower;

        // for odd.
        if (n % 2 != 0) {
            halfpowersq = a * halfpower * halfpower;
        }
        return halfpowersq;
    }

    // tilling probleam. amazone imp.
    public static int tile(int n) { // the floor size is 2*n or tile size is 2*1.
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // //main appoach.
        // //vertical approach.
        // int fnm1 = tile(n-1);

        // //horzointal approach.
        // int fnm2 = tile(n-2);

        // int total_ways = fnm1+fnm2;

        // return total_ways;

        // ------->>OPTIMIZE WAY<<--------
        return tile(n - 1) + tile(n - 2);
    }

    // remove duplicate in the string.
    public static void dup(String str, int idx, StringBuilder newstr, boolean map[]) {
        // base case.
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        // work/kamm
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            dup(str, idx + 1, newstr, map);
        } else {
            map[currChar - 'a'] = true;
            dup(str, idx + 1, newstr.append(currChar), map);
        }
    }

    // FRIENDS PAIRING PROBLEAM.
    public static int pairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // //choices
        // //single
        // int fnm1=pairing(n-1);

        // //paired
        // int fnm2=pairing(n-2);
        // int total_paring_ways= (n-1)*fnm2;

        // int totalWays= fnm1+ total_paring_ways;

        // return totalWays;

        // ----->>OPTIMIZE WAY<<----------
        return pairing(n - 1) + (n - 1) * pairing(n - 2);

    }

    // BINARY STRING PROBLEAM.
    public static void BinaryString(int n, int LastPalce, String str) {
        // base case.
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // work
        BinaryString(n - 1, 0, str += "0");

        if (LastPalce == 0) {
            BinaryString(n - 1, 1, str += "1");
        }
    }

    //occurence of an given element.
    public static void elemOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i + " ");
         
        }
           elemOccurence(arr, key, i+1);
    }

       //PRINT DIGITS IN THE NUMBERS.
       public static void DigitToNumbers(int n){
        //base case
        if(n==0){
            return;
        }
        String num[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int i = n%10;
        DigitToNumbers(n/10);
        System.out.print(num[i] + " ");
       }

       //TO FINDING THE LENGHT OF A STRING.
       public static int LengthString(String str){
        if(str.length()==0){
            return 0;
        }

        return LengthString(str.substring(1))+1;
       }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=10;
        // fun(n);
        // System.out.println();
        // fun2(n);

        // //factorial of a number.
        // int n=5;
        // System.out.println( fact(n));

        // //sum of n naturals numbers.
        // int m=10;
        // System.out.println(sum(m));

        // //fibonacci of the nth number.
        // int o=5;
        // System.out.println(fib(o));

        // to check the given array is sorted or not.
        // int arr[]={1,2,3,4,5};
        // System.out.println(isSorted(arr,0));

        // to check the frist occurence of the element of an array.
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(occurence(arr, 90, 0));

        // to check the last occurence of the element of an array.
        // int arr[]={1,2,3,5,3,4,5,3,4};
        // System.out.println(lastoccurence(arr, 4, 0));

        // to print the power of any number.
        // System.out.println(power(2,10));

        // to print the power of any number optimize method.
        // System.out.println(optpower(32,2));

        // tilling probleam.
        // int floor_n_size = sc.nextInt();
        // System.out.println(tile(floor_n_size));

        // remove duplicate in the string.
        // String str = "appnnacollege";
        // dup(str,0,new StringBuilder(""),new boolean[26]);

        // FRIENDS PAIRING PROBLEAM.
        // System.out.println(pairing(3));

        // BINARY STRING PROBLEAM.
        // BinaryString(3, 0, "");

        //occreance of aN GIVEN ELEMENT.

        // int arr[]= {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // elemOccurence(arr, key, 0);

        //PRINT DIGITS IN THE NUMBERS.
        // int numbers = 1947;
        // DigitToNumbers(numbers);

        //TO FINDING THE LENGTH OF A STRING.
        String str = "abcd";
        System.out.println(LengthString(str));
    }

}



