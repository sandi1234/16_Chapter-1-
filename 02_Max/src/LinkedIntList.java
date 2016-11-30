import java.util.NoSuchElementException;

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

    // pre :
    // post : 0 > returns the maximum number of the list
    public int max(LinkedIntList list){
        if(front == null){
            throw new NoSuchElementException();
        } else {
            int max = 0;
            for(int i = 0; i <= list.size() -1; i++){
                System.out.println((i + 1) + ": " + list.get(i));
                if(max < list.get(i)){
                    max = list.get(i);
                }
            }
            return max;
        }
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


}
