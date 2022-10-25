import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileManager fileManager = new FileManager();
        WordCounter wordCounter = new WordCounter();
        String userChoice = "";



        //System.out.println("Welcome to Word Count App!");
        //System.out.println();
        //System.out.println("Please enter your text here:");




        while (!userChoice.equals(5)) {

            wordCounter.displayMenuOption();

            userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    fileManager.createFile();
                    wordCounter.wordCount();
                    break;
                case "2":
                    fileManager.createFile();
                    wordCounter.charCountWithSpaces();
                    break;
                case "3":
                    //sth
                case "4":
                    System.exit(0);
            }


        }

    }
}


