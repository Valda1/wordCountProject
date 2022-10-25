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




        while (!userChoice.equals(4)) {

            wordCounter.displayMenuOption();

            userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    fileManager.createFile();
                    wordCounter.wordCount();
                    break;
                case "2":
                    //sth
                    break;
                case "3":
                    System.exit(0);
            }


        }

    }
}


