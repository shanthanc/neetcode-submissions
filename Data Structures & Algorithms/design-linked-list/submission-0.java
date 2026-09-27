class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class MyLinkedList {
    private Node head; // head of the list
    private int n; // size of the List

    public MyLinkedList() {
        head = null;
        n = 0;
    }

    public int get(int index) {
        if (index < 0 || index > n - 1) {
            return -1;
        }
        int i = 0; 
        Node curr = head;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            } else {
                curr = curr.next;
                i++;
            }
        }
        return -1;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(n, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > n) {
            return;
        }
       
        int i = 0;
        Node newNode = new Node(val);
        Node curr = head;

        if (head == null) {
            head = newNode;
            n++;
            return;
        }

        if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            n++;
            return;
        }
        while (curr != null) {
            if (index == n && curr.next == null) {
                curr.next = newNode;
                newNode.prev = curr;
                newNode.next = null;
                n++;
                return;
            }
            if (i == index) {
                curr.prev.next = newNode;
                newNode.next = curr;
                newNode.prev = curr.prev;
                curr.prev = newNode;
                n++;
                return;
            }
            curr = curr.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > n - 1 || head == null) return;
        int i = 0;
        Node curr = head;
        if (index == 0) {
            head = head.next;
            head.prev = null;
            n--;
            return;
        }
        while (curr != null) {
            if (i == index) {
                if(curr.next == null) {
                    curr = curr.prev;
                    curr.next = null;
                    n--;
                    return;
                }
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                curr = null;
                n--;
                return;
            } 
            curr = curr.next;
            i++;
        }
    }
}