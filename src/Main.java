import java.util.*; // Использование библиотеки

// Публичный класс Main
public class Main { // Тело класса
    // Основной метод программы
    public static void main(String[] args) { // Тело метода
        YearMonth[] yearMonthsMass = YearMonth.values(); // Массив с месяцами
        System.out.println("Массив: " + Arrays.toString(yearMonthsMass)); // Вывод массива в консоль
        overload(yearMonthsMass); // Метод для массива
        ArrayList<YearMonth> yearMonthsArrayList = new ArrayList<>(List.of(YearMonth.values())); // ArrayList список месяцов
        System.out.println("ArrayList: " + yearMonthsArrayList); // Вывлод списка в консоль
        overload(yearMonthsArrayList); // Метод для ArrayList
        LinkedList<YearMonth> yearMonthsLinkedList = new LinkedList<>(List.of(YearMonth.values())); // LinkedList список месяцов
        System.out.println("LinkedList: " + yearMonthsLinkedList); // Вывод списка в консоль
        overload(yearMonthsLinkedList);// Метод для LinkedList
    } // Закрытие тело основного метода

    // Приватный перегруженный метод overload, который принимает массив
    private static void overload(YearMonth[] yearMonthsMass) { // Тело метода
        System.out.println("Массив после сортировки:"); // Сообщение, которое выведется в консоль
        int length = yearMonthsMass.length; // Переменные для обмена
        String obmen; // Переменные для обмена

        // Кусок кода кода который меняет все Энамки местами
        for (int i = 0; i < length / 2; i++) { // Тело цикла
            obmen = String.valueOf(yearMonthsMass[length - i - 1]);
            yearMonthsMass[length - i - 1] = yearMonthsMass[i];
            yearMonthsMass[i] = YearMonth.valueOf(obmen);
        } // Закрывает тело цикла
        // Цикл для вывода массива после сортировки
        for (int i = 0; i < yearMonthsMass.length; i++) { // Тело цикла
            System.out.println(yearMonthsMass[i]);
        } // Закрывает тело цикла
    } // Закрывает тело метода для массива

    // Приватный перегруженный метод overload, который принимает ArrayList
    private static void overload(ArrayList<YearMonth> yearMonthArrayList) { // Тело метода
        yearMonthArrayList.sort(Collections.reverseOrder()); // В данной строке мы сортируем все Энамки задом на перёд
        /* Sorted List*/
        System.out.println("ArrayList После сортровки: "); // Сообщение в консоль
        // Цикл для выведения уже отсортированного списка
        for (YearMonth yearMonth : yearMonthArrayList) { // Тело Цикла
            System.out.println(yearMonth); // Сообщение в консоль
        } // Закрывает тело цикла
    } // Закрывает тело метода для ArrayList

    // Приватный перегруженный метод overload, который принимает LinkedList
    private static void overload(LinkedList<YearMonth> yearMonthLinkedList) { // Тело метода
        yearMonthLinkedList.sort(Collections.reverseOrder()); // В данной строке мы сортируем все Энамки задом на перёд
        /* Sorted List*/
        System.out.println("LinkedList После сортровки: "); // Сообщение в консоль
        // Цикл для выведения уже отсортированного списка
        for (YearMonth yearMonth : yearMonthLinkedList) { // Тело Цикла
            System.out.println(yearMonth); // Сообщение в консоль
        } // Закрывает тело цикла
    } // Закрывает тело метода для LinkedList
} // Закрывает тело класса
