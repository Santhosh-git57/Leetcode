// Last updated: 7/17/2026, 3:03:43 PM

class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int top = -1;

        for (String op : operations) {
            if (op.equals("+")) {
                scores[top + 1] = scores[top] + scores[top - 1];
                top++;
            } else if (op.equals("D")) {
                scores[top + 1] = scores[top] * 2;
                top++;
            } else if (op.equals("C")) {
                top--;
            } else {
                top++;
                scores[top] = Integer.parseInt(op);
            }
        }

        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += scores[i];
        }

        return sum;
    }
}