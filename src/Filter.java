
import java.util.List;

public class Filter {
    private static int f;

    public Filter (int f){
        this.f = f;
    }

    public static List<Integer> filterOut(List<Integer> list){
        Logger logger = Logger.get();
        logger.log("Запускаем фильтрацию");
        list.removeIf(s -> s < f);
        return list;
    }
}
