import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordCounter {

    public static Map<String, Integer> wordsCount(String str) {

        String[] words = str.trim().replaceAll("\\p{IsPunctuation}", "").split(" ");

        Map<String, Integer> count = new HashMap<>();
        for (String t : words) {
            if (count.containsKey(t)) {
                count.put(t, count.get(t) + 1);
            } else {
                count.put(t, 1);
            }
        }

        Map<String, Integer> sortedMap = new TreeMap<>(count);
        sortedMap.entrySet();

        Set<String> keys = sortedMap.keySet();
        char alphabetChar = ' ';
        char alphabetCharLast = ' ';
        for (String key : keys) {
            alphabetChar = key.toUpperCase().charAt(0);
            if (alphabetChar != alphabetCharLast) {
                System.out.println(alphabetChar + ": " + key + " " + sortedMap.get(key));
            } else {
                System.out.println("   " + key + " " + sortedMap.get(key));
            }
            alphabetCharLast = alphabetChar;
        }
        return sortedMap;
    }
}
