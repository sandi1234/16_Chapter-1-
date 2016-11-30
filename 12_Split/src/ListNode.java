/**
 * Created by Samson on 28-10-2016.
 */
public class ListNode {
    public int data; // data stored in this node
    public ListNode next; // link to next node

    // post: constructs a node data 0 and null
    public ListNode(){
        this(0,null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data){
        this(data, null);
    }

    // post: construct a node with given data and given link
    public ListNode(int data, ListNode next){

        this.data = data;
        this.next = next;
    }

    public String toString(){
        return this.data + " ";
    }
}
