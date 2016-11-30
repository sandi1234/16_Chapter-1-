/**
 * Created by Samson on 25-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){

        LinkedIntList list = new LinkedIntList();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list.add(21);

        System.out.println(list.toString());
        list.deleteBack(list);
        System.out.println(list.deleteBack(list));

    }
}
