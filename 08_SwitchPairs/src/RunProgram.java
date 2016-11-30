/**
 * Created by Samson on 25-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){

        LinkedIntList list = new LinkedIntList();

        //10, 25, 31, 47, 52, 68, 77],
        list.add(10);
        list.add(25);
        list.add(31);
        list.add(47);
        list.add(52);
        list.add(68);
        list.add(77);

        System.out.println(list);
        list.switchPairs();

    }
}
