import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceConfig {
    
    
    //Passage Selection
    //Seat Count (2-6)
    //Dificulty modifiers
        //Autocorrect on/off
        //Caffiene Mode
        //Night Shift

    private int seatCount;
    private Boolean caffieneMod;
    private Boolean autocorrectMod;
    private Boolean nightMod;

    List<String> shortPassages = new ArrayList<>(Arrays.asList(

    "A focused typist keeps steady rhythm, correcting mistakes quickly while racing forward, balancing speed and accuracy to reach the end before exhaustion sets in.",

    "A determined racer pushes through fatigue, typing each character with care, avoiding costly errors while maintaining momentum toward the finish line under growing pressure.",

    "Each keystroke matters as competitors advance, some faltering and slipping back, others staying consistent, proving that precision often beats reckless speed in tight races.",

    "With steady hands and sharp focus, the typist adapts to mistakes, recovers quickly, and continues forward, knowing endurance and control decide the final outcome."

    ));

    List<String> mediumPassages = new ArrayList<>(Arrays.asList(
    
    "A steady typist builds rhythm over time, carefully balancing speed and accuracy while avoiding unnecessary mistakes. As pressure increases, maintaining focus becomes more difficult, yet those who stay composed and consistent often gain the advantage, gradually pulling ahead of competitors who rush and lose control under stress.",

    "Speed alone is never enough to secure victory in a typing race, as precision plays an equally important role. Competitors who manage their pace, recover quickly from errors, and remain calm under pressure tend to outperform those who rely purely on fast but careless keystrokes throughout the race.",

    "Every keystroke contributes to progress, and even small mistakes can create setbacks that are difficult to recover from. Typists who maintain steady control, avoid panic, and adapt to changing conditions will steadily move forward, while others struggle to regain lost ground after repeated errors disrupt their flow.",

    "Endurance becomes a deciding factor as the race continues, with fatigue testing each competitor's consistency and discipline. Those who can maintain concentration, minimise mistakes, and manage their effort effectively will push through the final stretch, while others begin to slow down and lose their earlier advantage."

    ));

    List<String> longPassages = new ArrayList<>(Arrays.asList(

    "A skilled typist maintains a steady rhythm while carefully balancing speed and accuracy, knowing that a single mistake can disrupt momentum. As the race progresses, fatigue begins to set in, testing focus and consistency. Those who remain calm under pressure and recover quickly from errors steadily move ahead, while others struggle to regain their pace after slipping behind during critical moments of the competition.",

    "In a high-pressure typing race, competitors must rely on both precision and endurance to succeed. Fast typing alone is not enough, as careless mistakes can quickly undo progress. The most effective racers adapt their pace, correct errors efficiently, and maintain concentration throughout the entire passage, ensuring they continue advancing even as the difficulty increases and the pressure to perform intensifies.",

    "Every character typed contributes to overall progress, making consistency one of the most important factors in a typing race. As competitors push forward, some will falter under pressure, losing valuable ground due to repeated mistakes. Others will remain composed, steadily improving their position by focusing on accuracy and maintaining a controlled pace that prevents unnecessary setbacks and keeps them moving forward.",

    "As the race nears its final stretch, endurance and mental discipline become increasingly important. Typists who can maintain their composure, minimise mistakes, and sustain their typing rhythm will often outperform those who started quickly but lacked consistency. In these final moments, the ability to stay focused and avoid panic can determine who crosses the finish line first and secures victory."

    ));





    
}
