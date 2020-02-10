
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        String quiz1 = input;
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String quiz2 = baseValue.concat(valueToBeAdded);
        return quiz2;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder quiz3 = new StringBuilder();
        quiz3.append(valueToBeReversed);
        quiz3 = quiz3.reverse();
        return quiz3.toString();
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String quiz4 = word;
        char[] chArray = new char[quiz4.length()];
        for (int i = 0; i < quiz4.length(); i++) {
            chArray[i] = quiz4.charAt(i);
        }
        int middle = quiz4.length() / 2;
        return chArray[middle];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        //char letter = (Character) charToRemove;
        //String quiz5 = value.replace(letter, "");
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String quiz4 = sentence;
        return quiz4.substring(quiz4.lastIndexOf(" ") + 1);
    }
}
