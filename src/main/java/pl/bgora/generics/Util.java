package pl.bgora.generics;

        import java.util.Comparator;
        import java.util.List;
        import java.util.stream.Collectors;

public class Util {

    public static <T extends Integer> List<T> sort(List<T> list) {
        return list.stream()
                .sorted(Integer::compare)
                .collect(Collectors.toList());
    }
}
