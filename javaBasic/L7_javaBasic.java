package javaBasic;
// //                  ---->>pattern 2<<-----

// import java.util.*;

// public class L7_javaBasic {
//     // hollo rectangle
//     public static void helloRect(int row, int colomn) {
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= colomn; j++) {
//                 if (i == 1 || i == row || j == 1 || j == colomn) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     // inverted and rotated half-pyramid
//     public static void rotatedHalfPyramid(int row, int colomn) {
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= row - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     // INVERTED Hlf permid with number
//     public static void invHalfPrymid(int row, int column) {
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= column - i + 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }

//     // floyd's triangle
//     public static void floydsTriangle(int row, int column) {
//         int j = 1;
//         for (int i = 1; i <= row; i++) {

//             for (int k = 1; k <= i; k++) {
//                 System.out.print(j);
//                 j++;
//             }
//             System.out.println();

//         }
//     }


//     // 0-1 triangle
//     public static void ZeroOnetriangle(int row,int column){
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2!=0){
//                     System.out.print("0");
//                 }
//                 else{
//                     System.out.print("1");
//                 }
//             }
//             System.out.println();
//         }
//     }


//     //butterfly pattren
//     public static void butterflyPattern(int row){
//         for(int i=0;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(2*(row-i)); k++){
//                 System.out.print(" ");
//             }
//             for(int l=1;l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int i = row; i >=1; i--) {
//                for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(2*(row-i)); k++){
//                 System.out.print(" ");
//             }
//             for(int l=1;l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();         
//         }
//     }

//     //special pattern
//     public static void specialPattern(int row){
//         for(int i=row;i>=1;i--){
//                    for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(2*(row-i)); k++){
//                 System.out.print(" ");
//             }
//             for(int l=1;l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=1;i<=row;i++){
//              for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(2*(row-i)); k++){
//                 System.out.print(" ");
//             }
//             for(int l=1;l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }


//     //solid rombus
//     public static void solidRombus(int row){
//         for(int i=1;i<=row;i++){
//             for(int space=1;space<=row-i;space++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=row;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     //hollow rombus
//     public static void hollowRombus(int row){

//            for(int i=1;i<=row;i++){
//             for(int space=1;space<=row-i;space++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=row;j++){
//                 if(i==1 || i==row || j==1 || j==row)
//                 System.out.print("*");

//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//     }

//     //diamond pattern
//     public static void diamondPattern(int row){
//     for(int i=1;i<=row;i++){
//         for(int space=1;space<=row-i;space++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i*2-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for(int i=row;i>=1;i--){
//          for(int space=1;space<=row-i;space++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i*2-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     }


  



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // helloRect(4, 7);

//         // rotatedHalfPyramid(4, 4);

//         // invHalfPrymid(5, 5);

//         // floydsTriangle(5, 5);

//         // ZeroOnetriangle(5,5);

//         // butterflyPattern(5);

//         // specialPattern(4);

//         // solidRombus(8);

//         // hollowRombus(5);

//         // diamondPattern(4);
       

//     }

// }
