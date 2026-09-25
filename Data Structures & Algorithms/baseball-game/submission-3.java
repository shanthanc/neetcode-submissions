class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> record = new ArrayDeque<>();
        int res = 0;
        for (String op: operations) {
            if (op.equals("+")) {
                int top = record.pop();
                int newTop = top + record.peek();
                record.push(top);
                record.push(newTop);
                res += newTop;
            } else if (op.equals("D")) {
                record.push(2 * record.peek());
                res += record.peek();
            } else if(op.equals("C")) {
                res -= record.pop();
            } else {
                record.push(Integer.parseInt(op));
                res += record.peek();
            }
        }
        return res;
    }
       
}