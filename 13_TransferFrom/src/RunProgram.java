/**
 * Created by Samson on 28-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();

        // 8, 7, -4, 19, 0, 43, -8, -7, 2
        list.add(8);
        list.add(7);
        list.add(-4);
        list.add(19);
        list.add(0);
        list.add(43);
        list.add(-8);
        list.add(-7);
        list.add(2);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


        System.out.println(list);
        //list.stutter();
        list.split();
        System.out.println(list2.transferFrom(list));
        System.out.println(list);
    }
}
