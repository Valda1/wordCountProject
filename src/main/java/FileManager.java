import java.io.*;
import java.util.Scanner;

public class FileManager implements FileInterface{

    @Override
    public void createFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text here:");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("usersText.txt"));
            String userInput = scanner.nextLine();
            bufferedWriter.write(userInput);
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public String getFileContent() {
        String fileName = "usersText.txt";
        File file = new File(fileName);
        String fileContent = "";

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                //fileContent = fileContent + scanner.nextLine();
                fileContent += scanner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileContent;


    }


}
