import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("what is size your list?");
        try {
            int size = in.nextInt();
            try {
                for (int i = 0; i < size; i++) {
                    System.out.println("enter num");
                    int num = in.nextInt();
                    arrayList.add(num);
                }
            System.out.println(arrayList);
            ArrayListMethode2.arrayList2(arrayList);
            }catch (Exception e){
                System.out.println("enter correct number");
            }
        }catch (Exception e){
            System.out.println("enter correct number");
        }
    }
}
