import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> words;

    public Dictionary() {
        words = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        words.put(word.toLowerCase(), meaning);
    }

    public String searchWord(String word) {

        String meaning = words.get(word.toLowerCase());

        if (meaning == null) {
            throw new IllegalArgumentException("Word not found in dictionary.");
        }

        return meaning;
    }
}
