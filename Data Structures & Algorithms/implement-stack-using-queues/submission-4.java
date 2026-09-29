class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class MyStack {

    private Node head;
    private int n;

    public MyStack() {
        head = null;
        n = 0;
    }
    
    public void push(int x) {
        Node newNode = new Node(x);
        if (empty()) {
            head = newNode;
            n++;
        } else {
            Node oldHead = head;
            newNode.next = oldHead;
            head = newNode;
            n++;
        }
        

    }
    
    public int pop() {
        if (empty()) {
            return -1;
        } else {
            int val = head.val;
            head = head.next;
            n--;
            return val;
        }
    }
    
    public int top() {
        return head.val;
    }
    
    public boolean empty() {
        return n == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */