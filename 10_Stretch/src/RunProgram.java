/**
 * Created by Samson on 25-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();

        //1, 8, 19, 4, 17],
        list.add(1);
        list.add(8);
        list.add(19);
        list.add(4);
        list.add(17);

        System.out.println(list);
        //list.stutter();
        list.stretch(2);
    }
}
