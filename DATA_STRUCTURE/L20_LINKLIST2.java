import java.util.*;
//here using java collection frame work.
import java.util.LinkedList;

public class L20_LINKLIST2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.next = null;
            this.data = data;
        } 
    }

    public static Node head;
    public static Node tail;
    public static int size;
    // add in link list
    public void add(int data){
       Node newnode =new Node(data);
       size++;
       if(head == null){
        head = tail = newnode;
        return;
       }
       newnode.next = head;
       head = newnode;
    }

    public void lastadd(int data){
        Node newNode = new Node(data);
        size++;
        if( head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode = tail;
    }

    //print in link list
    public void print(){
        if( head == null){
            System.out.println( "ll is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
//--------------------------------------------------------------------------------------------------------------------

    //detect cycle in link list 
   public static boolean cycle(){
    Node fast = head;
    Node slow = head;
    while( fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if( slow == fast){
            return true;
        }
    }
    return false;
   }

//--------------------------------------------------------------------------------------------------------------------
   // remove cycle from link list
   public static void cycleremove(){
    //detect cycel
    Node fast = head;
    Node slow = head;
    Boolean cycle = false;
    while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if( fast == slow){
            cycle = true;
            break;
        }
    }
    if (cycle == false) {
        return;
    }
    // find meeting point
    slow = head;
    Node prev = null;
    while(fast != slow){
        prev = fast;
        fast = fast.next;
        slow = slow.next;
    }

    // remove cycle
    prev.next = null;

   }
//--------------------------------------------------------------------------------------------------------------------
//program for merge sort using link list

//function for mid finding
   private Node getMid(Node head){
   
    Node slow = head;
    Node fast = head.next;
    while (fast!= null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow; //mid
   }

    //making merge function
    private Node merge(Node head1, Node head2){
        Node MergedLL = new Node(-1); //temp Node
        Node temp = MergedLL;
        
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return MergedLL.next;
    }

   public Node mergeSort(Node head){
     //base case
     if(head == null || head.next == null){
        return head;
    }
    //find mid 
    Node mid = getMid(head);

    // divide into left half and right half
    Node rightHead = mid.next;
    mid.next = null;
    Node Left = mergeSort(head);
    Node Right = mergeSort(rightHead);

    // call merge function
    return merge(Left,Right);
   }

 //---------------------------------------------------------------------------------------------------------------------------------------------------
   //zig-xag linked list 
   public void Zig_Zag(){
    //finding mid 
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    Node mid = slow;

    //reversing second half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node Nextl,NextR;
    // updating zig zag
    while (left != null && right != null) {
        //zig zag process
        Nextl = left.next;
        left.next = right;
        NextR = right.next;
        right.next = Nextl;
        //updating left and right
        left = Nextl;
        right = NextR;
    }
   }

//--------------------------------------------------------------------------------------------------------------------
//    double linkedlist 















//--------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        
        L20_LINKLIST2 ll = new L20_LINKLIST2();
        // // ll.add(1);
        // // ll.add(2);
        // // ll.add(3);
        // // ll.add(4);
        // // ll.add(5);
        // // ll.print();

        // head = new Node(1);
        // Node temp  = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(cycle());
        // cycleremove();
        // System.out.println(cycle());
//--------------------------------------------------------------------------------------------------------------------------------------------------
        //here comes the concept of java collection framework
        // creating a linklist object
            //to create we can't use int, float, boolean instead of this we are going to use Integer, Float, Charactor
        // LinkedList<Integer>ll = new LinkedList<>();
        
        // //adding
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addFirst(0);
        // //0->1->2->3
        // System.out.println(ll);



        // //removing
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);

        //-----------------------------------------------------------------------------------------------------------------
        //program of merge sort using linklist
        //  L20_LINKLIST2 ll = new L20_LINKLIST2();
        // ll.add(1);
        // ll.add(2);
        // ll.add(3);
        // ll.add(4);
        // ll.add(5);
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print(); 

        //-------------------------------------------------------------------------------------------------------------------------
        //program for zig zag function 
        // ll.add(6);
        // ll.add(5);
        // ll.add(4);
        // ll.add(3);
        // ll.add(2);
        // ll.add(1);
        // //1->2->3->4->5->6
        // ll.print();
        // ll.Zig_Zag();
        // ll.print();

        
    }
}
