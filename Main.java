
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Its thread safe
        Vector<Integer> arrList= new Vector<>();

        arrList.add(78);
        arrList.add(10);
        arrList.add(1771);
        arrList.add(62626);
        System.out.println(arrList);

        // Removing the Elements
        arrList.remove(1);

        // Size of ArrList
        System.out.println(arrList.size());

        // Get the Element
        System.out.println(arrList.get(2));

        // Checks the element is present or not
        System.out.println(arrList.contains(1771));

        System.out.println(arrList);
    }
}
