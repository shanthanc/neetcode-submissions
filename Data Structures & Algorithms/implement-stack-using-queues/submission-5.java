
class MyStack {

    private Queue<Integer> qa;
    private Queue<Integer> qb;

    public MyStack() {
      qa = new ArrayDeque<>();
      qb = new ArrayDeque<>();
    }

    public void push(int x) {
       qa.offer(x);
    }

    public int pop() {
        int res = -1;
       while(qa.size() > 1) {
         res = qa.poll();
         qb.offer(res);
       }
       res = qa.poll();
       while(!qb.isEmpty()) {
        qa.offer(qb.poll());
       }
       return res;
    }

    public int top() {
        int res = -1;
       while(!qa.isEmpty()) {
         res = qa.poll();
         qb.offer(res);
       }
       //res = qa.poll();
       while(!qb.isEmpty()) {
        qa.offer(qb.poll());
       }
       return res;
    }

    public boolean empty() {
       return qa.isEmpty();
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