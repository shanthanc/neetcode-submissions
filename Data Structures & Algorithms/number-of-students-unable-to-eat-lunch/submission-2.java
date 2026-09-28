class Solution {
    
    /**
     *  Each student prefers either 0 or 1
     *  sandwiches.length = students.length -> each student has atleast one 
     *  sandwich. 
     *  
    */

    public int countStudents(int[] students, int[] sandwiches) {
        if (students.length == 1) {
            if (students[0] == sandwiches[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        ArrayDeque<Integer> studentQ = new ArrayDeque<>();
        ArrayDeque<Integer> sandwichQ = new ArrayDeque<>();

        for (int value : students) {
            studentQ.add(value);
        }

        for (int value : sandwiches) {
            sandwichQ.add(value);
        }

    
        int rc = 0;
        while (!studentQ.isEmpty() && !sandwichQ.isEmpty()) {
            if (!studentQ.peekFirst().equals(sandwichQ.peekFirst())) {
                studentQ.offerLast(studentQ.removeFirst());
                rc++;
                if (rc == students.length) {
                    break;
                }
            } else {
                rc = 0;
                studentQ.removeFirst();
                sandwichQ.removeFirst();
            }
            
        }
        return studentQ.size();
    }
}