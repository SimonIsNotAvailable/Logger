import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.get();
        logger.log("Запускаем программу");
        Scanner in = new Scanner(System.in);
        System.out.println("Введи два числа поочереди: размер списка N и верхнюю границу значений элементов в списке M.");
        logger.log("Просим пользователя ввести исходные значения");
        int n = in.nextInt();
        logger.log("Пользователь ввел размер списка: " + n);
        int m = in.nextInt();
        logger.log("Пользователь ввел верхнюю границу значений: " + m);
        System.out.println("Введите число f для фильтрации списка");
        logger.log("Создаём и генерируем список ");
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(0, m));
        }
        logger.log("Сгенерирован список чисел " + list);
        int f = in.nextInt();
        logger.log("Пользователь ввел порог фильтрации списка: " + f);
        in.close();
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        logger.log("Результат фильтрации: " + filteredList);
        logger.log("Завершаем программу и выводим на экран лог");
        System.out.println(logger);

    }
}
