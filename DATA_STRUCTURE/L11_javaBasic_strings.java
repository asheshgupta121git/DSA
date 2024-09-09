// // package DATA_STRUCTURE;
// import java.security.PublicKey;
// import java.util.*;

// import javax.print.DocFlavor.STRING;

// public class L11_javaBasic_strings {
//     // function to print the letters in the srting
//     public static void letters(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }

//     // function the check string is palindrom or not
//     public static boolean palindrom(String str) {

//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                 return false;
//             }
//         }
//         return true;

//     }

//     // COORDINATES SHORTEST DIRECTION QUESTION
//     public static float distsnce(String str) {
//         int x = 0, y = 0, x1, y1;
//         x1 = x;
//         y1 = y;
//         for (int i = 0; i < str.length(); i++) {
//             // move left
//             if (str.charAt(i) == 'W') {
//                 x1 = x1 - 1;
//             }

//             // move right
//             else if (str.charAt(i) == 'E') {
//                 x1 = x1 + 1;
//             }

//             // move down
//             else if (str.charAt(i) == 'S') {
//                 y1 = y1 - 1;
//             }

//             // move up
//             else if (str.charAt(i) == 'N') {
//                 y1 = y1 + 1;
//             }

//         }
//         int xsquare = (x1 - x) * (x1 - x);
//         int ysquare = (y1 - y) * (y1 - y);

//         return (float) (Math.sqrt(xsquare + ysquare));
//     }

//     // compare for largest.
//     public static String largest(String fruits[]) {
//         String large = fruits[0];
//         for (int i = 0; i < fruits.length; i++) {
//             if (large.compareTo(fruits[i]) < 0) {
//                 large = fruits[i];
//             }
//         }
//         return large;
//     }

//     // convet each letter opf frist word in upper case.
//     public static String touppercase(String str) {
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == ' ' && i < str.length() - 1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     // QUESTION string compression
//     public static String compression(String str) {
//         StringBuilder sb = new StringBuilder("");
//         String newstr = "";
//         for (int i = 0; i < str.length(); i++) {
//             Integer count = 1;

//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             // newstr +=str.charAt(i);

//             if (count > 1) {
//                 sb.append(count);
//                 // newstr +=count.toString();
//             }

//         }
//         return sb.toString();// newstr
//     }

//     public static int lowervowel(String str) {
//         int count = 1;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//                     || str.charAt(i) == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }

    // public static boolean anagram(String str1, String str2) {
    //     str1 = str1.toLowerCase();
    //     str2 = str2.toLowerCase();

        // check length.
        // if (str1.length() == str2.length()) {
        //     char str1arr[] = str1.toCharArray();
        //     char str2arr[] = str2.toCharArray();

        //     // sorting of arrays
        //     Arrays.sort(str1arr);
        //     Arrays.sort(str2arr);

        //     boolean result = Arrays.equals(str1arr, str2arr);
        //     if (result) {
        //         // System.out.println("it is anagram");
        //         return true;
        //     }
            // else{
            // System.out.println("it is not anagram");
            // }

    //     }

    //     return false;
    // }

    // public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // deceleration of strings
//         // String str="abcde"; //method 1
//         // String str2= new String("abcde"); //method 2

//         // System.out.println(str);
//         // System.out.println(str2);

//         // input in the strings
//         // String name;
//         // name= sc.next(); //take only word as input
//         // System.out.println(name);

//         // name=sc.nextLine(); //takw whole line as input
//         // System.out.println(name);

//         // STRINGS FUNCTIONS
//         // String str="mahesh daley";
//         // System.out.println(str.length()); //to count the lenght

//         // string concatinate. we use [+]
//         // String frist="Ashesh";
//         // String last="gupta";
//         // String fullname=frist+" "+last;
//         // System.out.println(fullname);

//         // to find which letter is preent at what position we use [.charAt()]
//         // System.out.println(fullname.charAt(0));
//         // System.out.println(fullname.charAt(1));

//         // letters(fullname);

//         // QUESTION to check string is palindrom or not.
//         // String str="racecar";
//         // System.out.println( palindrom(str));

//         // QUESTION shortest distance coordinates
//         // String coordinates="WNEENESENNN";
//         // float path =distsnce(coordinates);
//         // System.out.println(path);

//         // STRING FUNCTION COMPARE
//         // String str="Ashesh";
//         // String str1= new String("Ashesh");
//         // if(str.equals(str1)){
//         // System.out.println("equal");
//         // }
//         // else{
//         // System.out.println("not equal");
//         // }

//         // STRING FUNCTION SUBSTRING
//         // String str="man of the man in the world";
//         // String subStr="";
//         // subStr = str.substring(4 , 12);
//         // System.out.println(subStr);

//         // QUESTION largest string compare.
//         // String fruits[] = { "apple", "mango", "banana" };
//         // System.out.println(largest(fruits));

//         // STRING BUILDER
//         // StringBuilder sb = new StringBuilder("");
//         // for( char ch='a';ch<='z';ch++){
//         // sb.append(ch);
//         // }
//         // System.out.println(sb );

//         // QUESTION convert each frist letter word to uppercase
//         // String sen="istla bustla murgi de sadhi twadi maa di jai ho";
//         // System.out.println(touppercase(sen));

//         // QUESTION string compression
//         // String str = "aaaabbcccdd";
//         // System.out.println(compression(str));

//         // QUESTIONS
//         // to check lower case vowel present in the string
//         // String sen="the quick brown fox jumps upon roght over al lazy dog";
//         // System.out.println(lowervowel(sen));

//         // program to check the given strings are anagram or not
//         String str1 = "care";
//         String str2 = "race";
//         System.out.println(anagram(str1, str2));

//     }

// }
