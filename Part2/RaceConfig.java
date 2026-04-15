import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
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
    private List<String> customPassages = loadFile("custom.txt");

    //Constructor method
    public RaceConfig(int seatCount, boolean isCaffieneMod, boolean isAutocorrectMod, boolean isNightMod){
        this.seatCount = seatCount;
        this.isCaffieneMod = isCaffieneMod;
        this.isAutocorrectMod = isAutocorrectMod;
        this.isNightMod = isNightMod;

        shortPassages = loadFile("short.txt");
        mediumPassages = loadFile("medium.txt");
        longPassages = loadFile("long.txt");
        customPassages = loadFile("custom.txt");

    }

    private loadFile(File f) throws IOException{
        Path path = Paths.get(filename);
        return Files.readAllLines(path);
    }








}
