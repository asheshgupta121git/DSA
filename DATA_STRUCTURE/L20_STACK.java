import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

public class L20_STACK {

    //------------------------------->>>> implementing stack using Arraylist <<<<-------------------------------------------------------------

    // static class Stack {
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }
    //     //push
    //     public static void push(int data) {
    //         list.add(data);
    //     }
    //     //pop
    //     public static int pop() {
    //         //if stack is empty
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     //peek
    //     public static int peek() {
    //         //if stack is empty
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }        
    // }


    //------------------------------->>>> implementing stack using linkedlist <<<<--------------------------------------------------------
    

    // static class Node{
    //     int data;
    //     Node next;
    //     Node (int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class StackB{
    //     static Node head = null;

    //     public static boolean isMt() {
    //         return head == null;
    //     }
    //     //push
    //     public static void push(int data){
    //         Node newNode = new Node(data);

    //         if (isMt()) {
    //             head = newNode;
    //             return;
    //         }

    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     // pop
    //     public static int pop(){
    //         if (isMt()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     //peek
    //     public static int peek() {
    //         if (isMt()) {
    //             return -1;
    //         }
    //         return head.data; 
    //     }
    // }
//----------------------------------------------------------------------------------------------------------------
    //print a stack 
    public static void printStack(Stack<Integer> s){
        while (!s.empty()) {
            System.out.println(s.pop());
        }
        System.out.println();
    }

//----------------------------------------------------------------------------------------------------------------------------------------
    // push at the bottom of the stack
    public static void pushBottom(Stack <Integer> s, int n){
        //base case
        if(s.empty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushBottom(s, n);
        s.push(top);
    }

//----------------------------------------------------------------------------------------------------------------------------------------
        //reverse a string  using a stack 
        public static String strReverse(String str){
            Stack <Character> s = new Stack<>();
            int idx = 0;
            while (idx < str.length()) {
                s.push(str.charAt(idx));
                idx++;
            }
            StringBuilder res = new StringBuilder("");
            while (!s.empty()) {
                char curr = s.pop();
                res.append(curr);
            }
            str = res.toString();
            return str;

        } 

// ----------------------------------------------------------------------------------------------------------------------------------------
        //reverse a stack.
        public static void reverseStack(Stack <Integer>s){
            //base case 
            if (s.isEmpty()) {
                return;
            }
            int top = s.pop();
            reverseStack(s);
            pushBottom(s, top);
        }

// ----------------------------------------------------------------------------------------------------------------------------------------
        //stock span problem 
        public static void stockSpan( int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] =1;
        s.push(0);

        for(int i=1;i<span.length;i++){
            int curr = stock[i];
            while (!s.empty() && curr> stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i]= i+1;
            }
            else{
                int prev = s.peek();
                span[i] = i- prev;
            }
            s.push(i); 
        }
        }

// ----------------------------------------------------------------------------------------------------------------------------------------
        // next gerater element ***VVI*** 

       public static int[]  nextG(int arr[]){
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i = arr.length-1; i>=0; i--){ // for next greater/ smaller left reverse this loop form i=0 to i<arr.length.
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { // for next smallest change the condition --->>'arr[s.peek()] >= arr[i]'<<----- . 
                s.pop();
            }

            if(s.isEmpty()) nextGreater[i] = -1;
            
            else nextGreater[i] = arr[s.peek()];

            s.push(i);
        }
        return nextGreater;
       }
       
// ----------------------------------------------------------------------------------------------------------------------------------------
       //valid parentheses.
       public static boolean validPara(String str){
                Stack <Character> s = new Stack<>();
                for(int i =0; i<str.length(); i++){
                    char ch = str.charAt(i);
                     // opening
                    if(ch == '(' || ch == '{' || ch == '['){
                        s.push(ch);
                    }
                    //closing
                    else{
                        if(s.isEmpty()){
                            return false;
                        }
                        if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                            s.pop();
                        }
                        else{
                            return false;
                        }
                    }
                }
                if(s.isEmpty()){
                    return true;
                }else{
                    return false;
                }
       }



// ----------------------------------------------------------------------------------------------------------------------------------------
       //max area in histogram.
       public static void  maxArea (int height[]){
        int maxarea =0;
        Stack <Integer> s = new Stack<>();
        int [] leftSmaller = new int[height.length];
        int [] rightSmaller = new int[height.length];
        int n = height.length-1;
      
        // next smaller left
        for(int i =0;i<=n;i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }

            if(s.isEmpty()) leftSmaller[i] = -1;
            else leftSmaller[i] = s.peek();

            s.push(i);
        }

        // next smaller right
        s= new Stack<>();
        for(int i = n;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }

            if(s.isEmpty()) rightSmaller[i] = n + 1;
            else rightSmaller[i] = s.peek();

            s.push(i);
        }


        //current area  : width = j-i-1 = rightsmaller[i] - leftSmaller[i] -1;
        for(int i=0;i<=n;i++){
            int he = height[i];
            int width = rightSmaller[i] - leftSmaller[i] -1;
            int currArea = he * width;
            maxarea = Math.max(maxarea, currArea);
        }

        System.out.println(maxarea);

      
       }







// ----------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        //--------->>stack using ArrayList <<-----------
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // //print stack 
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        
        //--------->>stack using linkedlist <<----------
        // StackB sl = new StackB();
        // sl.push(1);
        // sl.push(2);
        // sl.push(3);

        // while (!sl.isMt()) {
        //     System.out.println(sl.peek());
        //     sl.pop();
        // }

        //--------->>stack using JCF <<-----------
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        //----------------->>push at bottom of the stack <<--------------

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushBottom(s,4);

        // while (!s.empty()) {
        //     System.out.println(s.pop());
        // }

        //--------------------------->>reverse a string <<-----------------
        // String str = "gun";
        // System.out.println(strReverse(str));

        //------------------------->>reverse a stack <<--------------
        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // reverseStack(s);
        // printStack(s); // 1,2,3

        // int stocks[] = {100,80,60,70,60,85,100};
        // int span[] = new int[stocks.length];
        // stockSpan(stocks, span);

        // for(int i=0;i<span.length;i++){
        //     System.out.print(span[i] + " ");
        // }

        
        //-----------------------------------------------------------------------------------
        
        //                 --->> very very importnt question <<---           
        // next gerater element.
        // int arr[] = {4,2,0,3,2,4,3,4};

        // for(int i : nextG(arr)){
        //     System.out.print(i + " ");
        // }System.out.println();

        //-----------------------------------------------------------------------------------

        // valid parentheses.
        // String str = "({})[]()";
        // System.out.println(validPara(str));

        //----------------------------------------------------------------------
 
            // -->> hard problem <--
            // MAX AREA IN HISTOGRAM

            // int heigth[] ={4,2,0,3,2,4,3,4};
            // maxArea(heigth);
    }  
}
