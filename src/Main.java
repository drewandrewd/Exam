import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        //String[] sentence = reader.readLine().split(" ");
        String[] words = reader.readLine().split(" ");
        //First.findWords(sentence, words);
        Second.find(sentence, words);
    }
}
