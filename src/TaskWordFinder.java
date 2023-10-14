
import java.io.IOException;

public class TaskWordFinder {

    public static void main(String[] args) throws IOException {
        WordFinder obj = new WordFinder("/Users/rahulsharma/Downloads/leetcode/src/file.txt");
        String s = obj.longestWords("ajsxuytchre");
        System.out.println(s);
    }
}
