import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethode2<T extends ArrayList> extends ArrayList<T>{
    public static void arrayList2(ArrayList<Integer> arrayList2) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
        if (arrayList2.size() % 2 != 0) {
            arrayList2.remove(arrayList2.size() - 1);
        }
        //        System.out.println(arrayList);
        Iterator it = arrayList2.iterator();
        for (int i = 0; i < arrayList2.size(); i += 2) {
            System.out.print("(" + arrayList2.get(i) + ", " + arrayList2.get(i + 1) + ")");
        }
        int index = 0;
        while (it.hasNext()) {
            if (index % 2 == 0) {
                if (arrayList2.size() > index) {

                    if (arrayList2.get(index) > arrayList2.get(index + 1)) {
                        System.out.println();
                        System.out.println("this is remove " + arrayList2.get(index) + " ," + arrayList2.get(index + 1));
                        arrayList2.remove(index);
                        arrayList2.remove(index);
                        it = arrayList2.iterator();
                        index = 0;
                    }

                }

            }
            index++;
            it.next();
        }
        System.out.println();
        System.out.println(arrayList2);
    }
}

