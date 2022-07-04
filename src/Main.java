import java.util.*;

public class Main {
    public static void main(String[] args) {
        YearMonth[] yearMonthsMass = YearMonth.values();
        System.out.println("Массив: " + Arrays.toString(yearMonthsMass));
        //  overload(yearMonthsMass);
        ArrayList<YearMonth> yearMonthsArrayList = new ArrayList<>(List.of(YearMonth.values()));
        System.out.println("ArrayList: " + yearMonthsArrayList);
        overload(yearMonthsArrayList);
        LinkedList<YearMonth> yearMonthsLinkedList = new LinkedList<>(List.of(YearMonth.values()));
        System.out.println("LinkedList: " + yearMonthsLinkedList);
        overload(yearMonthsLinkedList);
    }

    private static void overload(YearMonth[] yearMonthsMass) {
        for (int i = 0; i < yearMonthsMass.length; i++) {
            System.out.println(yearMonthsMass[i]);
        }
        System.out.println();

      //  int length =
    }

    private static void overload(ArrayList<YearMonth> yearMonthArrayList) {
        yearMonthArrayList.sort(Collections.reverseOrder());
        /* Sorted List*/
        System.out.println("ArrayList После сортровки: ");
        for (YearMonth yearMonth : yearMonthArrayList) {
            System.out.println(yearMonth);
        }
    }

    private static void overload(LinkedList<YearMonth> yearMonthLinkedList) {
        yearMonthLinkedList.sort(Collections.reverseOrder());
        /* Sorted List*/
        System.out.println("LinkedList После сортровки: ");
        for (YearMonth yearMonth : yearMonthLinkedList) {
            System.out.println(yearMonth);
        }
    }
}
