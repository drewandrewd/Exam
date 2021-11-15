public class Second {

    public static void find(String sentence, String[] words) {
        String newSentence = sentence;
        for (int i = 0; i < words.length; i++) {
            if (newSentence.startsWith(words[i])) {
                newSentence = newSentence.replace(words[i], "");
                i = -1;
            }
        }
        if ("".equals(newSentence)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
