package HW;

import java.util.Locale;

public class HW06 {
    public static void main (String[] args){
        /*
        Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
        */
        System.out.println("-----------------------------Task1-----------------------------");
        String s1 = "Перестановочный алгоритм быстрого действия";
        System.out.print("все буквы \"о\" из заданной строки: ");
        for (int i = 0; i < s1.length(); i++) {
            if ('о' == s1.charAt(i)) {
                System.out.print ("o");
            }
        }

        System.out.println();

/*
Задача №2
Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
        */
        System.out.println("-----------------------------Task2-----------------------------");
        String s2 = "Перевыборы выбранного президента";
        int count3 = 0;
        for (int i = 0; i < s2.length(); i++) {
            if ('е' == s2.charAt(i)) {
                count3++;
            }
        }
        System.out.println("количество букв \"е\" в строке: " + count3);
        System.out.println();

        /*
        Задача №3
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.

         */


        System.out.println("-----------------------------Task3.1-----------------------------");
        String s3 = "Посмотрите как Рите нравится ритм";
        System.out.print("Индексы начала всех подстрок - \"рит\": ");
        s3 = s3.toLowerCase();
        String substr = "рит";
        for (int i = 0; i < s3.length()-substr.length(); i++){
            if (s3.substring(i, i + substr.length()).equals(substr)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.println("-----------------------------Task3.2-----------------------------");
        System.out.print("Индексы начала всех подстрок - \"рит\": ");

        int index = s3.indexOf("рит");
        while (index != -1){
            System.out.print(index + ", ");
            index = s3.indexOf("рит", index + 1);
        }


        System.out.println();


               /*
Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

         */

        System.out.println("-----------------------------Task4.1-----------------------------");

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf('е') == -1) {
                    count++;
                }
            }
        }


        System.out.println("Kоличество строк в массиве, которые не содержат буквы \"e\": " + count);
        System.out.println();

        System.out.println("-----------------------------Task4.2-----------------------------");

        count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count++;
                }
            }
        }


        System.out.println("Kоличество строк в массиве, которые не содержат буквы \"e\": " + count);
        System.out.println();


    }
}
