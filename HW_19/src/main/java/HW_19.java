import java.util.ArrayList;
import java.util.List;

public class HW_19 {

    private static final int FIRST_NUMBER = 100;
    private static final int SECOND_NUMBER = 1000;

    public static void main (String[] args) {

        System.out.println("-----------------------------Task1-----------------------------");
        /*
        Создать лист и добавить в него следующие слова:
            White
            Tan
            Yellow
            Orange
            Red
            Pink
            Purple
            Blue
            Затем удалить из этого списка все цвета в которых встречается буква “L”
         */

        List<String> colourList = new ArrayList<>();
        colourList.add("White");
        colourList.add("Tan");
        colourList.add("Yellow");
        colourList.add("Orange");
        colourList.add("Red");
        colourList.add("Pink");
        colourList.add("Purple");
        colourList.add("Blue");

        System.out.print("Origin array: ");
        for (String item: colourList) {
            System.out.print(item + " ");
        }
        System.out.println();

        List<Integer> colourRemove = new ArrayList<>();

        int count = 0;
        for (String item: colourList) {
            for (int i = 0; i < item.length(); i++) {
                if (item.charAt(i) == 'l') {
                    colourRemove.add(colourList.indexOf(item) - count);
                    count++;
                    break;
                }
            }
        }

        for(Integer item: colourRemove) {
            colourList.remove(item.intValue());
        }

        System.out.print("Array after removing: ");
        for (String item: colourList) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("-----------------------------Task2-----------------------------");
        // Создать лист со значениями от 100 до 1000.
        List<Integer> list = new ArrayList<>();
        for (int i = FIRST_NUMBER; i <= SECOND_NUMBER; i++) {
            list.add(i);
        }

        for (int item: list) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("-----------------------------Task3-----------------------------");
        // Удалить из листа, созданного в предыдущей задаче, все четные элементы.
        for (int i = SECOND_NUMBER; i >= FIRST_NUMBER; i--) {
            if (i % 2 == 0) {
                list.remove(list.indexOf(i));
            }
        }

        for (int item: list) {
            System.out.print(item + " ");
        }

        System.out.println();

        System.out.println("-----------------------------Task4-----------------------------");
        // Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer)
        // и добиться такого же результата как и с типом int.

        for (Integer i = SECOND_NUMBER; i >= FIRST_NUMBER; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }

        for (int item: list) {
            System.out.print(item + " ");
        }
    }
}
