import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //сортировка по значению
        Map<String, Integer> map = new LinkedHashMap<>();
        map.putIfAbsent("Hello", 16);
        map.putIfAbsent("Zello", 11);
        map.putIfAbsent("Aello", 45);
        map.putIfAbsent("ASello", 29);

       /* Map<Integer,String> treeMap = new TreeMap<>();

        for (Map.Entry<String,Integer> m : map.entrySet()) {
            treeMap.putIfAbsent(m.getValue(),m.getKey());
        }
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();

        for (Map.Entry<Integer,String> m : treeMap.entrySet()) {
            linkedHashMap.putIfAbsent(m.getValue(),m.getKey());
        }

        System.out.println(linkedHashMap);*/


        //через Stream API

        LinkedHashMap<String, Integer> collect = map.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue() - o2.getValue())
                .collect(Collectors.toMap((z) -> z.getKey(), (x) -> x.getValue(), (a, b) -> a, LinkedHashMap::new));

        System.out.println(collect);




    }
}
