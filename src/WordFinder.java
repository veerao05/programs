
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFinder {
    static List<String> finalList = new ArrayList<>();

    public WordFinder(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = br.readLine();
                if (line != null) {
                    finalList.add(line);
                }
            }
        } finally {
            br.close();
        }
    }


    public String longestWords(String words) {
        String result = "";
        for (String word : finalList) {
            Map<Character, Integer> map = generateMap(words);
            boolean status = false;
            for (int i = 0; i <= word.length() - 1; i++) {
                Character ch = word.charAt(i);
                if (map.containsKey(ch)) {
                    Integer value = map.get(ch);
                    if (value != 0) {
                        value = value - 1;
                        map.put(ch, value);
                        status = true;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (status && (result.length() < word.length())) {
                result = word;
            }
        }
        return result;
    }

    private Map<Character, Integer> generateMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= word.length() - 1; i++) {

            Integer c = map.get(word.charAt(i));
            if (c != null) {
                map.put(word.charAt(i), c + 1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }
        return map;
    }
}
