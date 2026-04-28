import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class PassageIO {
    /**
     * loadFile
     * 
     * This reads a given file and returns each line as an item in a list
     * 
     * @param file must be the name for a file as a string
     * @return List<String> returns each line as a single string in a List
     * @throws IOException
    */
    public List<String> loadFile(String file) throws IOException{
        Path path = Paths.get(file);
        return Files.readAllLines(path);
    }


    /**
     * Writes to the custom passage text file with user entered passages
     * Validation must be done beforehand
     * 
     * @param passage string passage typed from the user
     * @throws IOException
    */
    private void writeCustomPassage(String passage) throws IOException{
        
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("custom.txt", true))){
            bufferedWriter.write(passage);
            bufferedWriter.newLine();
        }catch (IOException e){
            System.out.println("Error occurred when writing file" + e.getMessage());
        }
    }

}
