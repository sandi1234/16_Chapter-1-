/**
 * Created by Samson on 24-10-2016.
 */
public class RunProgram {
    public static void main(String[] args){
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.set(1,28);

        System.out.println(list.toString());
    }
}
