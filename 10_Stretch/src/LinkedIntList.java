import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Samson on 25-10-2016.
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

    // post : returns the postion of the first occurence of the
    //      given value (-1 if not fount)
    public int indexOf(int value){
        int index = 0;
        ListNode current = front;
        while (current != null){
            if(current.data == value){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
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

    // pre: 0 <= index <= size()
    // post: removes value at given index
    public void remove(int index){
        if(index == 0){
            front = front.next;
        } else {
            ListNode current = nodeAt(index -1);
            current.next = current.next.next;
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


    public void stretch(int n){
        if(n <= 0){
            throw new NoSuchElementException();
        } else {

            System.out.print("[");
            for (int i = 0; i < size() - 1; i++) {
                System.out.print(get(i) + ", ");

                for (int j = 1; j <= n; j++) {
                    System.out.print(get(i));
                    if(j < n){
                        System.out.print(", ");
                    } else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println("]");
        }
    }

}
