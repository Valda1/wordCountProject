import java.io.BufferedReader;
import java.io.FileNotFoundException;
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

    }

    public void charCountWithSpaces() throws IOException {

        FileReader fileReader = new FileReader("usersText.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;
        int charCount = 0;

        while((input = bufferedReader.readLine()) != null){
            //characters = character.replaceAll("\\s", "").length();
            charCount += input.length();
        }

        fileReader.close();

        System.out.println("Number of characters in your text without white spaces = " + charCount);





    }

    public void displayMenuOption() {
        System.out.println("Welcome to Word Count Application!" +
                "\n 1. Get word count " +
                "\n 2. Get character count including whitespaces" +
                "\n 3. Get character count without whitespaces" +
                "\n 4. Exit");

    }
}
