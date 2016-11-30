/**
 * Created by Samson on 25-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){

        //[1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40],

        LinkedIntList list = new LinkedIntList();

        list.addSorted(1);
        list.addSorted(1);
        list.addSorted(1);
        list.addSorted(3);
        list.addSorted(3);
        list.addSorted(6);
        list.addSorted(9);
        list.addSorted(15);
        list.addSorted(15);
        list.addSorted(23);
        list.addSorted(23);
        list.addSorted(23);
        list.addSorted(40);
        list.addSorted(40);

        System.out.println(list.toString());
        System.out.println(list.countDuplicates(list));

    }
}
