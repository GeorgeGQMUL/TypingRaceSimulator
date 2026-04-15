import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RaceConfig {
    
    
    //Passage Selection
    //Seat Count (2-6)
    //Dificulty modifiers
        //Autocorrect on/off
        //Caffiene Mode
        //Night Shift

    private int seatCount;
    private Boolean isCaffieneMod;
    private Boolean isAutocorrectMod;
    private Boolean isNightMod;
    
    //Passages
    private List<String> shortPassages;
    private List<String> mediumPassages;
    private List<String> longPassages;
    private List<String> customPassages;

    /** 
     * Constructor method
     * 
     * Used to initialise the modifiers for the game
     * Also used to load the different passages from the txt files
     * 
     * @param seatCount int defining the amount of players
     * @param isCaffieneMod bool determines whether the caffiene modification is active
     * @param isAutocorrectMod bool determines whether the Autocorrect modification is active
     * @param isNightMod bool determines whether the Night modification is active
     * 
    */ 
    public RaceConfig(int seatCount, boolean isCaffieneMod, boolean isAutocorrectMod, boolean isNightMod){
        this.seatCount = seatCount;
        this.isCaffieneMod = isCaffieneMod;
        this.isAutocorrectMod = isAutocorrectMod;
        this.isNightMod = isNightMod;

        try {
            shortPassages = loadFile("short.txt");
            mediumPassages = loadFile("medium.txt");
            longPassages = loadFile("long.txt");
            customPassages = loadFile("custom.txt");

        }catch (IOException e) {
            System.out.println("Encountered error when trying to initialise a passage" + e.getMessage());
        }


    }

    /**
     * Sets the amount of people playing the game
     * Must be between 2 - 6
     * 
     * @param seatCount integer amount of people playing the game
     */
    private void setSeatCount(int seatCount){
        if (seatCount < 2 || seatCount > 6) {
            throw new IllegalArgumentException("Seat count must be 2–6");
        }
        this.seatCount = seatCount;
    }

    /**
     * Set method for all of the modifiications
     * 
     * @param isCaffieneMod
     * @param isAutocorrectMod
     * @param isNightMod
    */
    private void setModifiers(boolean isCaffieneMod, boolean isAutocorrectMod, boolean isNightMod){
        this.isCaffieneMod = isCaffieneMod;
        this.isAutocorrectMod = isAutocorrectMod;
        this.isNightMod = isNightMod;
    }



    //Accessors 
    //
    private boolean getCaffiene(){
        return this.isCaffieneMod;
    }

    private boolean getAutocorrect(){
        return this.isAutocorrectMod;
    }

    private boolean getNight(){
        return this.isNightMod;
    }

    /**
     * loadFile
     * 
     * This reads a given file and returns each line as an item in a list
     * 
     * @param file must be the name for a file as a string
     * @return List<String> returns each line as a single string in a List
     * @throws IOException
    */
    private List<String> loadFile(String file) throws IOException{
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

    /**
     * This method gets a random passage based on the 4 types of passages
     * 
     * @param size determines which of the 4 possible lengths a passage is to be selected from
     * 0-2 (small to large) 3 (custom passage)
     * @return a random passage from one of the text files or "not a passage size" if it fails
    */
    private String getRandomPassage(int size){
        
        Random random = new Random();

        switch (size) {
            case 0:
                return this.shortPassages.get(random.nextInt(this.shortPassages.size()));
            case 1:
                return this.mediumPassages.get(random.nextInt(this.mediumPassages.size()));
            case 2:
                return this.longPassages.get(random.nextInt(this.longPassages.size()));
            case 3:
                return this.customPassages.get(random.nextInt(this.customPassages.size()));
            default:
                System.out.println("Problem getting the random passage, size is probably wrong");
                return "Not a passage size";
        }
    }

}
