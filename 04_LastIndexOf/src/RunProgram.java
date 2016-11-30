/**
 * Created by Samson on 24-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();
        //1, 18, 2, 7, 18, 39, 18, 40],
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);


        System.out.println(list.lastIndexOf(list, 2));

    }
}
