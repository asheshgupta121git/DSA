// package DATA_STRUCTURE;

// import java.util.*;

// public class L12_DSA_Bit_manupulation {

//     // function for odd and even
//     public static void oddEven(int number) {
//         int bitmask = 1;
//         if ((number & bitmask) == 0) {
//             // for even
//             System.out.println("number is even");
//         } else {
//             System.out.println("number is odd");
//         }
//     }

//     // function for get Ith bit
//     public static void GetIthbit(int num, int i) {
//         int bitmask = 1 << i;
//         // for Ith bit
//         if ((num & bitmask) == 0) {
//             System.out.println("Ith bit is 0");

//         } else {
//             System.out.println("Ith bit is 1");

//         }
//     }

//     // function for set Ith bit
//     public static int setIthbit(int num, int i) {
//         int bitmask = 1 << i;
//         // for set Ith bit
//         num = (num | bitmask);
//         return num;

//     }

//     // function for cleare Ith bit.
//     public static int CleareIthbit(int num, int i) {
//         int bitmask = ~(1 << i);
//         num = num & bitmask;
//         return num;

//     }

//     // function for the update the bits
//     public static int updateBits( int num, int i, int newbit){
//         // if(newbit==0){
//         //     return CleareIthbit(num,i);
//         // }
//         // else{
//         //    return setIthbit(num, i);
//         // }

//         num = CleareIthbit(num, i);
//         int bitMask = newbit<<i;
//         return num|bitMask;
//     }

//     //functio for cleare last of Ith bit.
//     public static int cleareLastofI(int num, int i){
//        int bitmask= ~0<<i;      // it gives us the value like 11111110000000   as much as zero we want at end after left shift.
//        return bitmask & num;            // it will give our desired cleared of the last of the ith bits.

//     }

//     //function to cleare the range of the bits.
//     public static int cleareRangeOfBits(int num, int i, int j){
//         int a=((~0)<<(j+1));   // it gives us 11111000000
//         int b=(1<<i)-1;         //it gives us 000000011 as last of 1's as we want.
//         int bitmask= a|b;        //it gives us 111110000000011
//         return num & bitmask;           // it gives our desired answers.

//     }
//     //function to check the number is two power or not.
//     public static boolean powerOfTwo(int num){
//         return (num & (num-1))==0;          //if it is power of two then it will return true else it will return false.
//     }

//     //function to count he set bits.
//     public static int countSetBits(int num){
//         int count=0;
//         while(num>0){
//             if((num & 1) != 0){     //getting the LSB (list significant bits)
//             count++;

//             num = num >> 1;         //right shift to declyined last LSB
//             }
//          }
       
//         return count;
//     }

//     //function for fast exponentiation.
//     public static int FastExpo(int a, int n){
//         int ans=1;
//         while(n>0){
//             if((n&1)!=0){       //checking LSB
//                 ans= ans*a;
//             }
//             a= a*a;
//             n=n>>1;
//         }
//         return ans;
//     }

//     //function for the swaping the two number without using the third number.
//     public static void swap(int a, int b){
//         a=a^b;
//         b=a^b;
//         a=a^b;

//         System.out.println("number after the swaping is : "+ a +" " +b);
//     }


//     //function for adding one in the number is.
//     public static int add1(int n){
//         //as we know tha -ve of a number is 2's compliment of the number 
//         //so let number be [x];
//         //then [-x= ~x+1].
//         //then we write the [x+1=-~x].
//         return -~n;
        
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // //BINARY AND '&'
//         // System.out.println(5&6);

//         // //BINARY OR '|'
//         // System.out.println(5|6);

//         // //BINARY XOR '^'
//         // System.out.println(5^6);

//         // //BINARY ONE'S COMPLIMENT
//         // System.out.println(~5);

//         // //BINARY LEFT-SHIFT '<<'
//         // System.out.println(5<<2);

//         // //BINARY RIGHT-SHIFT '>>'
//         // System.out.println(6>>1);

//         // //program o=for odd and even.
//         // oddEven(3);
//         // oddEven(4);
//         // oddEven(5);
//         // oddEven(6);

//         // program for get Ith bit.
//         // GetIthbit(15,4);

//         // program for setIth bit.
//         // System.out.println(setIthbit(10, 2));

//         // program for cleare Ith bit.
//         // System.out.println(CleareIthbit(10, 3));

//         //update in the bits
//         // System.out.println(updateBits(10, 2, 1));

//         //program to cleare the last of the Ith bit.
//         // System.out.println(cleareLastofI(10, 2));

//         //program to cleare the range of the bit.
//         // System.out.println(cleareRangeOfBits(10,2,4));

//         //progran to check the number is two power or not.
//         // System.out.println(powerOfTwo(5));

//         //program to count the set bits in the number.
//         // System.out.println(countSetBits(15));

//         //program for the fast exponentiation.
//         // System.out.println(FastExpo(4,3));

//         //program for swaping of two number without suing the thirs number.
//         // swap(10,5);

//         //program to add 1 in a number using bit manupulation.
//         System.out.println("number after adding 1 is : "+ add1(4));

//         //program to change the charactoe in the lower case.
//         for(char i= 'A';i<='Z';i++){
//             System.out.print((char)(i | ' '));
//         }




//     }
// }
