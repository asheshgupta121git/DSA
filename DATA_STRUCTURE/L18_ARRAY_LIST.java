import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

//----->> ArrayList is a part of the java collection framework.
// java collection framework is the collection of of inbuilt data type which is used by user.

public class L18_ARRAY_LIST {

    // Printing max from the arraylist
    public static void maxValue(ArrayList<Integer> listb) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < listb.size(); i++) {
            if (max < listb.get(i)) {
                max = listb.get(i);
            }
        }
        System.out.println("max value is = " + max);
    }
    // -------------------------------------------------------------------------------------------------

    // swaping of two number in the araaylist
    public static void swap(ArrayList<Integer> listB, int idx1, int idx2) {
        int temp = listB.get(idx1);
        listB.set(idx1, listB.get(idx2));
        listB.set(idx2, temp);
    }

    // ---------------------------------------------------------------------------

    // container with most water

    // brutforce approach time complexity O(n^2)
    public static int storewater(ArrayList<Integer> height) {

        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int weight = j - i;
                int waterstore = ht * weight;
                maxwater = Math.max(maxwater, waterstore);
            }
        }
        return maxwater;
    }

    // 2 pointers aproach time complexity O(n)
    public static int optimize_waterstore(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0; // Leftpointer
        int rp = height.size() - 1;// rightpointer
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int weight = rp - lp;
            int waterstore = ht * weight;
            maxwater = Math.max(maxwater, waterstore);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    // ---------------------------------------------------------------------------------------------------
    // PAIR SUM PROBLEM
    // WE GOING TO USE 2POINTERS APPRAOCH GIVES TIME COMPLEXITY O(n)
    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        int lp = 0;// left pointer
        int rp = list.size() - 1;// right pointer
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    // ---------------------------------------------------------------------------------------------------
    // PAIR SUM PROBLEM 2 (IN SORTED AND ROTATED ARRAY)
    // time complexity O(n)
    // int this we use 2 pointers approach and MODULAS ARTHEMATIC APPROACH.
    public static boolean pairsum2(ArrayList<Integer> list2, int target) {
        // finding breaking point or pivot point
        int bp = -1;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > list2.get(i + 1)) {// breaking point
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        int n = list2.size();
        while (lp != rp) {
            if (list2.get(lp) + list2.get(rp) == target) {
                return true;
            } else if (list2.get(lp) + list2.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // syntax of ArrayList.
        // ArrayList <Integer> list= new ArrayList<>(); // basic syntax. in this Integer
        // is the data type
        // some more data type are
        // ArrayList <Boolean> list2 = new ArrayList<>();
        // ArrayList <String> list3 = new ArrayList<>();

        // operatons in ArrayList
        /*
         * operations // time complexity
         * => Add Element O(1)
         * => Get Element O(1)
         * => Remove Element O(n)
         * => Set Element at Index O(n)
         * => Contains Element O(n)
         */

        // add element (to insert element in the list)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);

        // // to add element at the index
        // list.add(1,33);
        // System.out.println(list);

        // get element (to get element in the list at an index)
        // System.out.println(list.get(3));

        // remove element (to delete the element in the list)
        // list.remove(3);
        // System.out.println(list);

        // set element at index (to update element at the index in the list)
        // System.out.println(list);
        // list.set(2, 33);
        // System.out.println(list);

        // contains element (to check the element is present in the list or not)
        // System.out.println(list.contains(4)); // it returns boolean value
        // System.out.println(list.contains(44));

        // size of an array list to check the size of an arraylist
        // System.out.println(list.size());

        // we can use size method to iterate on the arraylist
        // for(int i=0;i<list.size();i++){
        // System.out.print(list.get(i)+ " ");
        // }
        // ---------------------------------------------------------------------------------------------------
        // print the reverse of an arraylist
        // for(int i=list.size()-1;i>=0;i--){
        // System.out.print(list.get(i)+ " ");
        // }
        // ---------------------------------------------------------------------------------------------------
        // ArrayList<Integer> listB = new ArrayList<>();
        // listB.add(2);
        // listB.add(5);
        // listB.add(7);
        // listB.add(8);
        // listB.add(1);

        // System.out.println(listB);
        // Printing the max from the arrayList.
        // alternative method
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<listB.size();i++){
        // max = Math.max(max, listB.get(i));
        // }
        // System.out.println("max value is = " +max);
        // maxValue(listB);

        // ---------------------------------------------------------------------------------------------------
        // swap of two number in the Arraylist
        // int idx1 =1, idx2 = 3;
        // System.out.println(listB);
        // swap(listB, idx1, idx2);
        // System.out.println(listB);

        // ---------------------------------------------------------------------------------------------------

        // // shorting in the list
        // System.out.println(listB);
        // Collections.sort(listB);// it will sort in the acending order
        // System.out.println(listB);
        // Collections.sort(listB, Collections.reverseOrder());// it will sort in
        // decending order
        // // in decending oredr we use comperator.
        // // compreator are the function in java which is used to define how the
        // logigic
        // // of sorting,i.e how the sorting will held and in which order.
        // System.out.println(listB);

        // ---------------------------------------------------------------------------------------------------

        // 2d arrayList in an java
        // ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2); list.add(3);
        // mainList.add(list);
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(4); list2.add(5); list2.add(6);
        // mainList.add(list2);
        // // System.out.println(mainList);

        // //we can also print using neasted loops
        // for(int i=0;i<mainList.size();i++){
        // ArrayList<Integer> curr = mainList.get(i);
        // for(int j=0;j<curr.size();j++){
        // System.out.print(curr.get(j)+ " ");
        // }
        // System.out.println();
        // }

        // QS) CREATE a 2d list with elem list1 = 1,2,3,4,5 ;list2 = 2,4,6,8,10 lisr3 =
        // 3,6,9,12,15

        // ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        // ArrayList <Integer> list1 = new ArrayList<>();
        // ArrayList <Integer> list2 = new ArrayList<>();
        // ArrayList <Integer> list3 = new ArrayList<>();

        // for(int i=1;i<=5;i++){
        // list1.add(i*1);
        // list2.add(i*2);
        // list3.add(i*3);
        // }
        // bigList.add(list1);
        // bigList.add(list2);
        // bigList.add(list3);

        // System.out.println(bigList);

        // //------>> printing using for loops
        // for(int i=0;i<bigList.size();i++){
        // ArrayList<Integer> print = bigList.get(i);
        // for(int j=0;j<print.size();j++){
        // System.out.print(print.get(j)+ " ");
        // }
        // System.out.println();
        // }

        // ---------------------------------------------------------------------------------------------------

        // // Q) container with most water.
        // //1,8,6,2,5,4,8,3,7
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // // System.out.println(storewater(height));
        // System.out.println(optimize_waterstore(height));

        // ---------------------------------------------------------------------------------------------------
        // //PAIR SUM PROBLEM
        // //list = 1,2,3,4,5,6 target= 5
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;
        // System.out.println(pairsum1(list, target));

        // ---------------------------------------------------------------------------------------------------
        // //PAIR SUM PROBLEM 2 (IN SORTED AND ROTATED ARRAY)
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(11);
        // list2.add(15);
        // list2.add(6);
        // list2.add(8);
        // list2.add(9);
        // list2.add(10);

        // int target = 16;
        // System.out.println(pairsum2(list2, target));

    }
}
