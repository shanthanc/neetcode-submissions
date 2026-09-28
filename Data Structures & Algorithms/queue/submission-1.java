class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}

class Deque {

    private Node head;
    private Node tail;
    private int n;

    public Deque() {
        this.head = null;
        this.tail = null;
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
        head = newNode;
        tail = head;
        n = 1;
       } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        n++;
       }
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
            n = 1;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            n++;
        }
        
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        if (tail.prev != null) {
            int val = tail.val;
            tail.prev.next = null;
            tail = tail.prev;
            n--;
            return val;
        } else {
            int val = tail.val;
            tail = null;
            head = null;
            n--;
            return val;
        }
    }

    public int popleft() {
        if (isEmpty()) {
            return -1;
        }
        if (head.next != null) {
            int val = head.val;
            head.next.prev = null;
            head = head.next;
            n--;
            return val;
        } else {
            int val = head.val;
            head = null;
            tail = null;
            n--;
            return val;
            
        }
    }
}
