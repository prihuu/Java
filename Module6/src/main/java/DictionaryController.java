public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController() {

        dictionary = new Dictionary();

        //random words to the dictionary
        dictionary.addWord("apple", "A round fruit that grows on trees.");
        dictionary.addWord("computer", "An electronic device used to process data.");
        dictionary.addWord("programming", "The process of writing computer instructions.");
        dictionary.addWord("java", "A popular object-oriented programming language.");
        dictionary.addWord("book", "A written work consisting of pages.");
        dictionary.addWord("ocean", "A very large pool of water.");
        dictionary.addWord("music", "Lovely sounds to hear.");
        dictionary.addWord("technology", "The use of scientific knowledge for everyday usage.");
    }

    //search for a word
    public String searchWord(String word) {

        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        try {
            return dictionary.searchWord(word.trim());
        } catch (IllegalArgumentException e) {
            return "Sorry, the word '" + word + "' was not found.";
        }
    }
}
