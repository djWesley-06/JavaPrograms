import java.util.ArrayList;
import java.util.List;

public class SingleLinkedList {
    private class Node{
        private int val;
        private Node next;

        public Node() {
            ;
        }

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }
    private Node head;
    private Node tail;
    private int size;

    public Node getHead(){
        return head;
    }
    public SingleLinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null)
            tail=head;
        size+=1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int deleteIndex(int index){
        if(index==0)
            return deleteFirst();
        if(index ==size-1)
            return deleteLast();
        Node temp = get(index -1);
        int val = temp.next.val;
        temp.next = temp.next.next;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void display(Node node){
        Node temp = node;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int getDecimalValue(Node head) {

        List<Integer> list = new ArrayList<>();
        Node node = head;
        while(node!=null){
            list.add(node.val);
            node = node.next;
        }
        int ans = 0;
        int base = 1;
        for(int i = list.size()-1;i>=0;i--){
            ans+=list.get(i)*base;
            base*=2;
        }
        return ans;

    }

    public void reverseLLrec(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverseLLrec(node.next);
        tail.next = node;
        tail= node;
        tail.next = null;

    }
    public void reverseLLitr(Node node){
        if(node == null || size<2)
            return;
        Node before = null;
        Node now = node;
        Node after = now.next;
        while(now!=null){
            now.next = before;
            before = now;
            now = after;
            if(after!=null)
                after = after.next;
        }
        head = before;

    }

    public Node middleNode(Node head) {

        Node temp = head;
        int count = 1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        for(int i=1;i<(count/2);i++){

            temp=temp.next;

        }
        return temp.next;

    }

    public static SingleLinkedList mergeTwoLists(Node list1, Node list2) {

        SingleLinkedList ll = new SingleLinkedList();
        while(list1 != null && list2!=null){
            if(list1.val < list2.val){
                ll.insertLast(list1.val);
                list1 = list1.next;
            }
            else {
                ll.insertLast(list2.val);
                list2 = list2.next;
            }
        }
        while(list1!=null){
            ll.insertLast(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            ll.insertLast(list2.val);
            list2 = list2.next;
        }

        return ll;

    }

    //Method using just the nodes and not complete lists-- leetcode style
    public Node mergeTwoLists2(Node list1, Node list2) {
        Node ans = new Node();
        Node temp = ans;
        while(list1 !=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                list1=list1.next;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1!=null){
            temp.next = list1;
        }
        else
            temp.next = list2;
        return ans.next;
    }

    public Node getIntersectionNode(Node headA, Node headB){
        if(headA == null || headB ==null)
            return null;

        Node temp1 = headA, temp2 = headB;
        while(temp1!=temp2){
            temp1 = (temp1==null)?headB:temp1.next;
            temp2 = (temp2==null)?headA:temp2.next;
        }
        return temp1;
    }


}
