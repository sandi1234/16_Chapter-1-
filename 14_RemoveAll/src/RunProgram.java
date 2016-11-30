/**
 * Created by Samson on 28-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();

        // [3, 9, 4, 2, 3, 8, 17, 4, 3, 18]
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(17);
        list.add(4);
        list.add(3);
        list.add(18);

        System.out.println(list);
        //list.stutter();
        list.split();
        list.removeAll(3);
        System.out.println(list);
    }
}
