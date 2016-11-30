/**
 * Created by Samson on 28-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();

        //1, 7, 3, 9, 4, 6, 5],
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        //list.stutter();
        list.compress();
    }
}
