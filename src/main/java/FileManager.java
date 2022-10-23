import java.io.File;
import java.io.IOException;

public class FileManager implements FileInterface{

    @Override
    public void createFile() {
        String fileName = "usersText.txt";
        File file = new File(fileName);

        try{
            if(file.createNewFile()){
                System.out.println("File created successfully!");
            }else{
                System.out.println("File already exists!");
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
