/**
 * Created by Samson on 25-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        // [1, 18, 2, 7, 8, 39, 18, 40],
        LinkedIntList list = new LinkedIntList();

        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(39);
        list.add(18);
        list.add(40);

        System.out.println(list.toString());
        System.out.println(list.theList());
        System.out.println(list.hasTwoConsecutive());

    }
}
