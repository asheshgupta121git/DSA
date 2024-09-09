// package DATA_STRUCTURE;
// import java.util.*;

// public class L10_javaBasic_2d_arrays {

//     // searching in 2d arrays
//     public static boolean search(int matric[][], int key) {
//         for (int i = 0; i < matric.length; i++) {
//             for (int j = 0; j < matric[0].length; j++) {
//                 if (matric[i][j] == key) {
//                     System.out.println("found at cell : " + i + "," + j);
//                     return true;
//                 }
//             }
//         }
//         System.out.println("not found ");
//         return false;
//     }

//     // finding minimum and maximum in 2d arrays
//     public static void Max_Min(int martix[][]) {
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < martix.length; i++) {
//             for (int j = 0; j < martix[0].length; j++) {
//                 max = Math.max(max, martix[i][j]);
//                 min = Math.min(min, martix[i][j]);
//             }
//         }
//         System.out.println("max of the matrix is : " + max);
//         System.out.println("min of the matrix is : " + min);
//     }

//     // spriral matrix calssic probleam
//     public static void spiral(int arr[][]) {
//         int startrow = 0;
//         int endrow = arr.length - 1;
//         int startcolumn = 0;
//         int endcolumn = arr[0].length - 1;

//         while (startrow <= endrow && startcolumn <= endcolumn) {

//             // top
//             for (int i = startcolumn; i <= endcolumn; i++) {
//                 System.out.print(arr[startrow][i] + " ");
//             }
//             // right
//             for (int i = startrow + 1; i <= endrow; i++) {
//                 System.out.print(arr[i][endcolumn] + " ");
//             }
//             // bottom
//             for (int i = endcolumn - 1; i >= startcolumn; i--) {
//                 if(startcolumn==endcolumn){     //for odd matrix 
//                     break;
//                 }
//                 System.out.print(arr[endrow][i] + " ");
//             }
//             // left
//             for (int i = endrow - 1; i > startrow; i--) {
//                 if(startrow==endrow){       //for odd matrix
//                     break;
//                 }
//                 System.out.print(arr[i][startcolumn] + " ");
//             }
//             startcolumn++;
//             startrow++;
//             endcolumn--;
//             endrow--;
//         }
//     }

//     //sum of digonal matrix
//     public static void diagonal( int arr[][]){
//         int sum=0;
//         // for( int i=0; i<arr.length; i++){
//         //     for( int j=0; j<arr[0].length; j++){
//         //         if(i==j || i+j==arr.length-1){
//         //             sum+=arr[i][j];
//         //         }
//         //     }
//         // }
        


//         // OPTIMIZ METHOD TO CALCULATE IT
//         for(int i=0;i<arr.length;i++){
//             //primary diagonal
//             sum+=arr[i][i];

//             //secondary diagonal
//             if( i!= arr.length-i-1)     //for odd matrix 
//                 sum+=arr[i][arr.length-i-1];
//         }
//         System.out.println(sum);
//     }

//     //search in sorted 2d array [STAIR CASE SEARCH]
//     public static boolean staircase(int arr[][],int key){
//         int row=arr.length-1;
//         int column=0;
//         while(row>=0 && column<arr.length){
//             if(arr[row][column]==key){
//                 System.out.println("found key at : "+row +","+column );
//                 return true;
//             }
//             //when key is greater move right
//             if(key>arr[row][column]){
//                 column++;
//             }

//             //when key is less move up
//             else{
//                 row--;
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }

//     //reprated number
//     public static void repeated(int arr[][], int num){
//        int n=arr.length;
//        int m=arr[0].length;
//        int c=0;
//        for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(arr[i][j]==num){
//                 c++;
//             }
//         }
//        }
//        System.out.println(c);
//     }
   
//     //sum of number in second row
//      public static void sumsecond(int arr[][]){
//        int c=0;
//         for(int j=0;j<arr[0].length;j++){
           
//             c=c+arr[1][j];   
//         }
//        System.out.println(c);
//     }
   

//     //transpose of amatrix
//     public static void transpose( int arr[][]){
//         int n=arr.length;
//         int m=arr[0].length;
//         int transpose[][]= new int[m][n];
//         for( int i=0;i<n;i++){
//             for( int j=0;j<m;j++){
//                 transpose[j][i]=arr[i][j];
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }


//         System.out.println();
//         System.out.println();

//         //transpose matrix
//         for( int i=0;i<transpose.length;i++){
//             for( int j=0;j<transpose[0].length;j++){
//                 System.out.print(transpose[i][j]+" ");
//             }
//             System.out.println();
//         }

        
//     }



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // creation of 2d arrays.
//         // int matric[][] = new int[3][3]; // rows=3,columsns=3;
//         // int n = 3;
//         // int m = 3;
//         // // input in 2d arrays
//         // for (int i = 0; i < n; i++) {
//         // for (int j = 0; j < m; j++) {
//         // matric[i][j] = sc.nextInt();
//         // }
//         // }

//         // // printing 2d arrays
//         // for (int i = 0; i < n; i++) {
//         // for (int j = 0; j < m; j++) {
//         // System.out.print(matric[i][j] + " ");
//         // }
//         // System.out.println();
//         // }

//         // searching in 2d martix.
//         // System.out.print("enter key to search : ");
//         // int key = sc.nextInt();

//         // search(matric, key);


//         // Max_Min(matric);

//         // int arr[][] = { { 1, 2, 3, 4 },
//         //                 { 5, 6, 7, 8 },
//         //                 { 9, 10, 11, 12 },
//         //                 { 13, 14, 15, 16 } };

//         // spiral(arr);


//         // diagonal(arr);

//         // //search in the sorted 2d matrix using staircase algorithm.
//         int arr[][]={{10,20,30,40},
//                      {15,25,35,45},
//                      {27,29,37,48},
//                      {32,33,39,50}};

//         int key=33;
//         staircase(arr, key);

//         // QUESTION
//         //count the number repeated
//         // int arr[][]={{4,7,8},{8,8,7}};
//         // int num=7;
//         // repeated(arr, num);

//         //sum in second row
//         // int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
//         // sumsecond(nums);

//         // //transpose of a matrix
//         // int arr[][]={{11,12,13},{21,22,23}};
//         // transpose(arr);


//     }

// }
