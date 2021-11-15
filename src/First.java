public class First {
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
}
