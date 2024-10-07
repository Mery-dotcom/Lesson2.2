import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        // Шаг c: Отображаем список A
        System.out.println("Список A:");
        for (String str : listA) {
            System.out.println(str);
        }

        // Шаг d: Считываем 5 строк и сохраняем их в Список B
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        // Отображаем список B
        System.out.println("Список B:");
        for (String str : listB) {
            System.out.println(str);
        }

        // Шаг e: Объединяем списки A и B в новый список C
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i)); // A1, A2, A3, A4, A5
            listC.add(listB.get(4 - i)); // B5, B4, B3, B2, B1
        }

        // Шаг f: Отображаем список C
        System.out.println("Список C (объединенный):");
        for (String str : listC) {
            System.out.println(str);
        }

        // Шаг g: Сортируем список C по длине строки
        Collections.sort(listC, Comparator.comparingInt(String::length));

        // Отображаем отсортированный список C
        System.out.println("Отсортированный список C по длине строки:");
        for (String str : listC) {
            System.out.println(str);
        }

        scanner.close();
    }
}
/*a) Используйте цикл
b)  Написать программу которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
и распечатать отсортированный список С */