import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileManager fileManager = new FileManager();
        String userChoice = "";

        System.out.println("Welcome to Word Count App!");
        System.out.println();
        //System.out.println("Please enter your text here:");


        while (!userChoice.equals(3)) {
            userChoice = scanner.next();
            switch (userChoice) {
                case "1":
                    fileManager.createFile();
                    break;
                case "2":
                    System.exit(0);
            }


        }

    }
}


