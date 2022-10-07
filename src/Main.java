import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.get();
        Scanner in = new Scanner(System.in);
        System.out.println("Введи два числа через пробел: размер списка N и верхнюю границу значений элементов в списке M.");
        String input = in.nextLine();
        String[] split = input.split(" ");
        int n = parseInt(split[0]);
        int m = parseInt(split[1]);
//        log.append(split[0] + split[1]);
        System.out.println("Введите число f для фильтрации списка");
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(0, m));
        }
        int f = in.nextInt();
        in.close();
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);
        System.out.println(Arrays.toString(filteredList.toArray()));
        System.out.println(log);

    }
}
