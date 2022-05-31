import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethode {
    public static void arrayList(ArrayList<Integer> arrayList) {
        if (arrayList.size() % 2 != 0) {
            arrayList.remove(arrayList.size() - 1);
        }
//        System.out.println(arrayList);
        Iterator it = arrayList.iterator();
        for (int i = 0; i < arrayList.size(); i += 2) {
            System.out.print("(" + arrayList.get(i) + ", " + arrayList.get(i + 1) + ")");
        }
        int index = 0;
        while (it.hasNext()) {
            if (index % 2 == 0) {
                if (arrayList.size() > index) {

                    if (arrayList.get(index) > arrayList.get(index + 1)) {
                        System.out.println();
                        System.out.println("this is remove " + arrayList.get(index) + " ," + arrayList.get(index+1));
                        arrayList.remove(index);
                        arrayList.remove(index);
                        it = arrayList.iterator();
                        index = 0;
                    }

                }

            }
            index++;
            it.next();
        }
        System.out.println();
        System.out.println(arrayList);
    }
}
