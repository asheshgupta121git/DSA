import java.security.PublicKey;
import java.util.*;

public class L19_LINKLIST {
    public class node { 
        int data;
        node next;

        // constructor
        public node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static node head;
    public static node tail;
    public static int size;

    // ----------------------------------------------------------------------------------------------------------------------
    // adding element in the linkedlist
    // addFRIST TIME COMPLEXITY IS ==>> O(1)
    public void addFRIST(int data) {
        // step 1 -> create new node
        node newnode = new node(data);
        size++;
        // if linked list is empty
        if (head == null) {
            head = tail = newnode;
            return;
        }

        // step 2 -> new node next = head
        newnode.next = head;

        // step 3 -> head = new node
        head = newnode;
    }

    // ----------------------------------------------------------------------------------------------------------------------

    // addLAST TIME COMPLEXITY IS ==>> O(1)
    public void addLAST(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // ----------------------------------------------------------------------------------------------------------------------

    // adding in the middle
    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFRIST(data);
            return;
        }

        node newNode = new node(data);
        size++;
        node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1 then,
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // ----------------------------------------------------------------------------------------------------------------------

    // REMOVE FRIST ELEMENT IN LINKLIST
    public int removeFrist() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // ----------------------------------------------------------------------------------------------------------------------

    // REMOVE LAST ELEMENT IN LINKLIST
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // idx = size-2
        node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    // ----------------------------------------------------------------------------------------------------------------------

    // search in linklist (iterative method) TIME COMPLEXITY O(N)
    public int searchIterative(int key) {
        int i = 0;
        node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.print("yes, key is found at ");
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    // ----------------------------------------------------------------------------------------------------------------------

    // Search in a linked list. with recursive process and return the value -1 if
    // key is not present. Here in recursive search, the time complexity is order of
    // log N.
    // public int searchRecursive(node head,int key){
    // //base case
    // if(head== null){
    // return -1;
    // }
    // if(head.data != key){
    // return searchRecursive(head.next, key);
    // }
    // return 1;
    // }
    // printing element in linked list TIME COMPLEXITY IS ==>> O(n)

    // SOLVE WITH THE HELP OF HELPER FUNCTION
    public int helper(node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int searchRecursive(int key) {
        return helper(head, key);
    }

    // ----------------------------------------------------------------------------------------------------------------------

    // print in a linked list
    public void print() {
        // id linklist is empty
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // ----------------------------------------------------------------------------------------------------------------------

    // reversing a linked list
    public void reverse() {
        node prev = null;
        node curr = tail = head;
        node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // ----------------------------------------------------------------------------------------------------------------------
    // find and remove nth node from end
    public void deleteNthFromEnd(int n) {
        // calcuealte size
        int sz = 0;
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // check if we have to delete the head
        while (n == sz) {
            head = head.next;// here we have done remove frist;
            return;
        }

        // finding the previous (size-1)
        node prev = head;
        int IdxToFind = sz - n;
        int i = 1;
        while (i < IdxToFind) {
            prev = prev.next;
            i++;
        }

        // delete nth node
        prev.next = prev.next.next;
        return;

    }

    // ----------------------------------------------------------------------------------------------------------------------

    // check the linkedlist is palindrom
    // find mid in linked list[FAST SLOW APPROACH]
    public node midOf(node head) { // healper function
        node fast = head;
        node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean ispalindrom() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // step 1- find mid.
        node mid = midOf(head);

        // step 2- reverse second half
        node prev = null;
        node curr = mid;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        node right = prev;
        node left = head;

        // step 3- check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // ----------------------------------------------------------------------------------------------------------------------
  

    // ----------------------------------------------------------------------------------------------------------------------

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        L19_LINKLIST ll = new L19_LINKLIST();
        // ll.print();
        // ll.addFRIST(2);
        // ll.print();
        // ll.addFRIST(1);
        // ll.print();
        // ll.addLAST(3);
        // ll.print();
        // ll.addLAST(4);
        // ll.print();
        // ll.addMiddle(2, 9);
        // ll.print();
        // ll.removeFrist();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // ll.addFRIST(5);
        // ll.addFRIST(4);
        // ll.addFRIST(3);
        // ll.addFRIST(2);
        // ll.addFRIST(1);
        // // System.out.println(ll.size);
        // ll.print();
        // System.out.println(ll.searchIterative(3));
        // System.out.println(ll.searchRecursive(3));
        // ll.reverse();
        // ll.deleteNthFromEnd(3);
        // ll.addFRIST(1);
        // ll.addFRIST(2);
        // ll.addFRIST(3);
        // ll.addFRIST(2);
        // ll.addFRIST(1);

        // ll.print();
        // System.out.println(ll.ispalindrom());
          
        

    }
}
