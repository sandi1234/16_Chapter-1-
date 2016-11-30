import java.util.LinkedList;

/**
 * Created by Samson on 24-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){

        LinkedIntList list = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();

        LinkedList<Integer> test = new LinkedList<>();

        test.add(2);
        test.lastIndexOf(2);

        list.add(3);
        list.add(10);
        list.add(6);
        list.add(8);
        list.add(1);
;


       // System.out.println(list.toString());
       // System.out.println(list.get(2));
        System.out.println(list.max(list));
    }
}
