import java.util.LinkedList;
import java.util.List;

/**
 * Created by Samson on 24-10-2016.
 *
 * Class LinkedIntList can be used to store a list of integers.
 */
public class LinkedIntList {
    private ListNode front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList(){
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size(){
        int count = 0;
        ListNode current = front;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post : returns the integer at the index in the list
    public int get(int index){
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString(){
        if(front == null){
            return "[]";
        } else{
            String result = "[" + front.data;
            ListNode current = front.next;
            while(current != null){
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }


    // post: appends the given value to end of the list
    public void add(int value){
        if(front == null){
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null){
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value){
        if(index == 0){
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index -1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= i size()
    // post: returns a referance to the node at the given index
    private ListNode nodeAt(int index){
        ListNode current = front;
        for(int i = 0; i < index; i++ ){
            current = current.next;
        }
        return current;
    }


    // pre:
    // post: returns the size of the string from value point to the value in front
    //      of the list otherwise returns -1
    public int lastIndexOf(LinkedIntList list, int value){
        int size = 0;
        for(int j = list.size() - 1; j > 0; j--){
            if(list.get(j) == value){
                size =  j;
                break;
            }
        }
        if(size == 0){
            return -1;
        }
        return size;
    }
}
