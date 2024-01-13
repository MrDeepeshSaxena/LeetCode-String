import java.util.HashSet;
import java.util.Set;

public class Check_if_the_Sentence_Is_Pangram_1832 {
    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();

        for (final char c : sentence.toCharArray())
            seen.add(c);

        return seen.size() == 26;
    }

}
