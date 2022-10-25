import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    public void wordCount() throws IOException {

        FileReader fileReader = new FileReader("usersText.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] words;
        String word;
        int wordCount = 0;

        while((word = bufferedReader.readLine()) != null){
            words = word.split(" ");
            wordCount = wordCount + words.length;
        }

        fileReader.close();

        System.out.println("Number of words in your text = " + wordCount);

        //return "Number of words in your text = " + wordCount;
    }

    public String charCount(){

        return null;

    }

    public void displayMenuOption() {
        System.out.println("Welcome to Word Count Application!" +
                "\n 1. Get word count " +
                "\n 2. Get character count without whitespaces" +
                "\n 3. Exit");

    }
}
