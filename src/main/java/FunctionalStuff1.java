import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStuff1 {

    public List<String> removeWordWithOddLength(List<String> words) {
        return words.stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());
    }

}
