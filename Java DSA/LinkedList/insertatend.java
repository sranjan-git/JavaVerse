package LinkedList;

public class insertatend {
    public void append(int new_data);
    Node new_node = new Node(new_data);
    if (head == null){
        head = new_Node(new_data);
        return;
    }
    new_node.next = =null;
    Node last = head;
    while(last.nextn != null)
    last = last.next;
    last.next = new_node;
    return;

}

// T.C = O(N)
// S.C  = O(1)

