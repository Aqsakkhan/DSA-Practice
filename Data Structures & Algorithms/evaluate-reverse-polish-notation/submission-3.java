class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String op : tokens) {
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                int firstNum = stack.pop();
                int secondNum = stack.pop();

                if (op.equals("+")) {
                    stack.push(secondNum + firstNum);
                } else if (op.equals("-")) {
                    stack.push(secondNum - firstNum);
                } else if (op.equals("*")) {
                    stack.push(secondNum * firstNum);
                } else if (op.equals("/")) {
                    stack.push(secondNum / firstNum);
                }
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        return stack.pop();
    }
}
