public class L20_LINKLIST2DOUBLE_LINKLIST {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail; 
    public static int size;
//----------------------------------------------------------------------    
    //add frist
    public void addFrist(int data) {
        //creating newNode 
        Node newNode = new Node(data);
        size++;
        //base case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    } 

    //add last
    public void addLast(int data){
        //creating new node 
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode; 
    }
//-------------------------------------------------------------------------
    //remove - remove Frist
    public int removeFrist() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if (size ==1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // remove - remove last
    public int removeLast() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;   
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size --;
        return val;
    }

//-------------------------------------------------------------------------
    // reverse a double linklist
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

//-------------------------------------------------------------------------
    // print 
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
//--------------------------------------------------------------------------------

    public static void main(String[] args) {
        L20_LINKLIST2DOUBLE_LINKLIST dll = new L20_LINKLIST2DOUBLE_LINKLIST();
        // dll.addFrist(3);
        // dll.print();
        // dll.addFrist(2);
        // dll.print();
        // dll.addFrist(1);

        // dll.print();

        // dll.addLast(4);
        // dll.print();
        // dll.addLast(5);
        // dll.print();
        // dll.addLast(6);
        
        // dll.print();

        // dll.removeFrist();
        
        // dll.print();

        
        dll.addFrist(4);
        dll.addFrist(3);
        dll.addFrist(2);
        dll.addFrist(1);

        dll.print();
        
        dll.reverse();

        dll.print();
        
    }
}
