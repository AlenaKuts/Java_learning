import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("map");
        Map<String, Integer> m = new HashMap<>();
        m.put("Alena", 1);
        m.put("Olga", 2);
        m.put("Tatiana", 3);
        m.put("Alena", 4);
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry);
        }
        for (String key : m.keySet()) {
            System.out.println(key);
        }
        for (Integer value : m.values()) {
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("set");
        Set<String> s = new HashSet<>();
        s.add("Alena");
        s.add("Olga");
        s.add("Alena");
        for (String item: s) {
            System.out.println(item);
        }
        System.out.println("");

        System.out.println("list");
        List<String> l = new ArrayList<>();
        l.add("Alena");
        l.add("Olga");
        l.add("Alena");
        for (String item: l) {
            System.out.println(item);
        }
        System.out.println("");




    }

}
