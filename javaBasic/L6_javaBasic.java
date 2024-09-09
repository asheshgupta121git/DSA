package javaBasic;
// //                      FUNCTIONS AND METHODS IN JAVA

// import java.util.*;

// public class L6_javaBasic {

//     // MAKING A FUNCTION TO PRINT HELLO ASHESH
//     public static void helloAshesh() {
//         System.out.println("Hello Ashesh!");
//         System.out.println("hello world!");
//         System.out.println("hello universe");
//         System.out.println("hello upcoming billionaries");
//         return;
//     }

//     // FUNCTION WITH PARAMETER
//     // function to find sum of 2
//     public static void sum(int a, int b) {
//         int sum = a + b;
//         System.out.println("sum is : " + sum);
//         return;

//     }

//     // call by value
//     // function to swap
//     public static void swap(int a, int b) {
//         int c = a;
//         a = b;
//         b = c;
//         System.out.println("a = " + a + "   b = " + b);
//         return;
//     }

//     // function to find product of two number
//     public static int product(int a, int b) {
//         return a * b;
//     }

//     // function to find the factorial of a number
//     public static int factorial(int num) {
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }
//         return fact;
//     }

//     // function to find bionomial cofficient
//     public static int bionomial(int n, int r) {
//         int a = factorial(n);
//         int b = factorial(r);
//         int c = n - r;
//         int d = factorial(c);
//         int e = b * d;
//         int f = a / e;
//         return f;
//     }

//     // FUNCTION OVERLOADING
//     // function to calculate sum of 3
//     public static int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     // function to find float sum of 2
//     public static float sum(float a, float b) {
//         return a + b;
//     }

//     // function to check number is prime or not
//     public static void prime(int num) {
//         boolean number = true;
//         if (num == 2) {
//             System.out.println("number is prime");
//         } else {
//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     number = false;
//                     break;
//                 }

//             }
//         }

//         if (number == true) {
//             System.out.println("number id prime");
//         } else {
//             System.out.println("number is not prime");
//         }
//     }


//     //optimize method to check numbrr is prime of not
//     public static boolean isprime(int num){
//         //cornner case
//         if(num==2)
//         return true;

//         for(int i=2;i<=Math.sqrt(num);i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }


//     //print all prime number in a range
//     /*
//      *ABHI LIKHNA HAI ISMA 
//      *
//      */


    
   
//     // optimize way to print prime number in a range
//     public static void primes(int a,int b){
//         for(int i=a;i<=b;i++){
//             if(isprime(i)==true)
//             System.out.println(i);
//             else
//             continue;
//         }
//     }

//     //function to convert the binary to decimal
//     public static void binaryTodecimal (int binNum){
//         int num=binNum;
//         int decimal=0;
//         int power=0;
//         while(binNum > 0){
//             int lastDigit=binNum%10;
//             decimal=decimal+(lastDigit *(int)Math.pow(2,power));

//             power++;
//             binNum=binNum/10;
//         }
//         System.out.println("binary number : "+num+" into decimal is : "+decimal);
//     }


//     //function to convet dicemal to binary
//     public static void decimalTobinary(int decimalnumber){
//         int num=decimalnumber;
//         int power=0;
//         int binary=0;
//         while(decimalnumber>0){
//             int remender=decimalnumber%2;
//             binary=binary+(remender * (int)Math.pow(10,power));

//             power++;
//             decimalnumber=decimalnumber/2;
//         }
//         System.out.println("decimal : "+num+" to binary is : "+binary);
//     }

//     //function to find average of three number
//     public static void averageOfthree(int a,int b,int c){
//         int sum=a+b+c;
//         int average=sum/3;
//         System.out.println("the average of three number is : "+average);
//     }
    
//     //function to print number is even or not
//     public static boolean evenOrnot(int n){
//         if(n%2==0){
//             return true;
//         }
//         return false;
//     }


//     //function to reverse the number.
//     public static int reverse(int num){
//         int reverse=0;
//         while(num>0){
//             int remender=num%10;
//             reverse=reverse*10 +remender;
//             num=num/10;
//         }
//         return reverse;
//     }

//         //function to check number is palindrom or not.
//         public static void palindrom(int number){
//             int reverse=reverse(number);
//             if(reverse==number){
//                 System.out.println("number is palindrom");    
//             }
//             else{
//                 System.out.println("number is not palindrom ");
//             }
//         }

//         //function to find the sum of the digits of an number
//         public static void sumOfdigits(int number){
//             int sum=0;
//             while(number>0){
//                 sum=sum + number%10;
//                 number=number/10;
//             }
//             System.out.println("sum of the digits is : "+ sum);
//         }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // helloAshesh(); //FUNCTION CALLING

//         // sum(22, 23);
//         // int a=10,b=20;
//         // System.out.println("a = " + a + " b = " + b);
//         // swap(a, b);

//         // int a=sc.nextInt(),b=sc .nextInt();
//         // int multiply=product(a, b);
//         // System.out.println("a*b = "+ multiply);

//         // int num=sc.nextInt();
//         // int fact=factorial(num);
//         // System.out.println(fact);

//         // int n=sc.nextInt(),r=sc.nextInt();
//         // int bio=bionomial(n, r);
//         // System.out.println(bio);

//         // System.out.println(sum(2, 4, 4));

//         // System.out.println(sum(2.3f, 4.3f));

//         // prime(sc.nextInt());// prime function calling

//         // System.out.println(isprime(sc.nextInt()));

    

//         // primes(2, 10);

//         // binaryTodecimal(101);

//         // decimalTobinary(5);

//         averageOfthree(3, 4, 5);

//         // System.out.println(evenOrnot(23));

//         // System.out.println(reverse(234));

//         // plindrom(123);

//         // sumOfdigits(12345);
        



//     }

// }
