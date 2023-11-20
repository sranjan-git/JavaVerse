package LinkedList;

public class insertinbetween {
    public void insertAfter (Node prev_node, int new_data){
        if(prev_node == null){
            System.out.println("the given node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
}

// T.C  = 0(1)
// S.C  = O(1)
