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

    // pre : 0 <= i size()
    // post: returns a referance to the node at the given index
    private ListNode nodeAt(int index){
        ListNode current = front;
        for(int i = 0; i < index; i++ ){
            current = current.next;
        }
        return current;
    }

    // pre :
    // post : sort elements in a list
    public void addSorted(int value){
        ListNode prev = null;
        ListNode current = front;
        while (current != null && current.data < value){
            prev = current;
            current = current.next;
        }
        if(prev == null){
            front = new ListNode(value, front);
        } else {
            prev.next = new ListNode(value, prev.next);
        }
    }

    // pre :
    // post : returns true if the list is sorted in a increased order otherwise false
    public int countDuplicates(LinkedIntList list){
        int low = 0;
        int max;
        int count = 0;
        for(int i = 0; i <= list.size() -1; i++){
            max = list.get(i);
            if(low == max){
                count++;
            }
            low = max;
        }
        return count;
    }

}
