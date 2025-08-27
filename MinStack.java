import java.util.Stack;

// To push, pop, peek , get minimum element in O(1) time complexity

public class MinStack {


    Stack<Integer> stack = new Stack();
    Stack<Integer>min = new Stack();

    public void push(int val) {

        stack.push(val);
        if(min.isEmpty()|| min.peek()>=val)
            min.push(val);
    }


    public void pop() {
        if(stack.peek().equals(min.peek())) min.pop();
        stack.pop();

    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.peek();

    }

    public int getMin() {
        if(min.isEmpty())
            return -1;
        return min.peek();

    }
}

