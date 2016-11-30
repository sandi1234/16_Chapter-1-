/**
 * Created by Samson on 28-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();

        // 8, 13, 17,  4, 9, 12, 98, 41, 7, 23, 0, 92
        list.add(8);
        list.add(13);
        list.add(17);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(98);
        list.add(41);
        list.add(7);
        list.add(23);
        list.add(0);
        list.add(92);

        System.out.println(list);
        //list.stutter();
        list.removeRange(3, 8);
        System.out.println(list);
    }
}
