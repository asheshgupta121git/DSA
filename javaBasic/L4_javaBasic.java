package javaBasic;

//                      ----->>LOOPS IN JAVA<<------
// import java.util.*;

// public class L4_javaBasic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        // while loops

        // int count=0;
        // while (count<10) {
        // System.out.println("hello ashesh!");
        // count++;
        // }

        // int x=1;
        // while(x<=10){
        // System.out.println(x);
        // x++;
        // }

        // int range = sc.nextInt();
        // int x = 1;
        // while (x <= range) {
        // System.out.println(x);
        // x++;
        // }

        // print sum of n naturals number
        // int n = sc.nextInt();
        // int count = 0;
        // int sum = 0;
        // while (count <= n) {
        // sum = sum + count;
        // count++;

        // }
        // System.out.println(sum);

        // FOR LOOPS IN JAVA.
        // for(int i=0;i<10;i++){
        // System.out.println(i);
        // }

        // pattern uding for loops
        // for(int i=0;i<4;i++){
        // System.out.println("****");
        // }

        // REVERSWE OF A NUMBER.
        // int a = 12345;
        // int rev = 0;
        // while(a>0){
        // int rem=a%10;
        // rev=rev*10+rem;
        // a=a/10;
        // }
        // System.out.println(rev);

        // for(a=12345;a>0;a=a/10){
        // int rem=a%10;
        // rev=rev*10+rem;
        // }
        // System.out.println(rev);

        // DO-WHILE LOOPS IN JAVA

        // int count=1;
        // do {
        // System.out.println("hello ashesh!");
        // count++;
        // } while (count<=10);

        // BREAK STATYMENTS IN JAVA.
        // for(int i=0;i<5;i++)
        // {
        // if(i==3)
        // break;

        // System.out.println(i);
        // }
        // System.out.println("i'm out of the loop");

        // WAP TO KEEN ENTERING THE NUMBER UNTIL USER ENTERS THE NUMBER WIHCH IS
        // MULTIPLE OF TEN

        // do {
        // int n=sc.nextInt();
        // if(n%10==0)
        // break;
        // else
        // System.out.println("return value is : "+n);

        // } while (true);

        // CONTINUE STATYMENT IN JAVA
        // for(int i=1;i<=5;i++){
        // if(i==3)
        // continue; //here we skip th 3

        // System.out.println(i);
        // }

        // WAP TO KEEN DISPLAYING A NUMBER FROM USER AND SKIP THE NUMBER WHICH IS
        // MULTIPLE OF TEN.
        // do {
        // int n=sc.nextInt();
        // if(n==0)
        // break;
        // if(n%10==0)
        // continue;

        // System.out.println("return value is : " +n);

        // } while (true);

        //                      check a number is prime or not
        // int number = sc.nextInt();
        // if (number == 2) {
        //     System.out.println("prime");
        // } else {
        //     boolean prime = true;
        //     for (int i = 2; i <=Math.sqrt(number)/*or we can write i < number-1 */; i++) {
        //         if (number % i == 0) {
        //             prime = false;
        //             break;

        //         }
        //     }
        //     if (prime == true)
        //         System.out.println("number is prime");
        //     else
        //         System.out.println("number is not prime");

        // }



        //QUESTIONS
        //write a program to read the sum of even and odd numbers from a set
        // int sumEven=0,sumOdd=0;
        // int n;
        // while(true){
        //     System.out.print("enter the number : ");
        //     n=sc.nextInt();
        //     if(n==0)
        //     break;
        //     else if(n%2==0){
        //         sumEven=sumEven+n;
        //     }
        //     else{
        //         sumOdd=sumOdd+n;
        //     }

        //     System.out.println("if you want to exit enter 0 ");

        // }

        // System.out.println("sum of even is : "+sumEven);
        // System.out.println("sum of odd is : "+sumOdd);



        //write a program of a number to count a factorial of a number
        // int n=sc.nextInt();
        // int fact=1;
        // for(int i=1;i<=n;i++)
        // {
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        //wap to print a table of a number
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(n*i);
        // }


//     }
// }
