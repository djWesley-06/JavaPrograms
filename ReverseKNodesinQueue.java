import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKNodesinQueue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack();
        for(int i = 0;i<k;i++){
            st.push(q.poll());
        }
        while(!st.isEmpty())
            que.offer(st.pop());
        while(!q.isEmpty())
            que.add(q.poll());
        return que;
    }
}
