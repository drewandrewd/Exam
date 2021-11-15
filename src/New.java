import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class New {

    public static void findWords(String[] sentence, String[] words) {
        int count = 0;
        for (int i = 0; i < sentence.length; i++) {
            int currCount = count;
            for (int j = 0; j < words.length; j++) {
                if(sentence[i].equals(words[j])) {
                    count++;
                    break;
                }
            }
            if (count == currCount) {
                System.out.println("Нет");
                break;
            }
        }
        if (count == sentence.length) {
            System.out.println("да");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sentence = reader.readLine().split(" ");
        String[] words = reader.readLine().split(" ");
        findWords(sentence, words);
    }
}
