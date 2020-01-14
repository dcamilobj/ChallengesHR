package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

    public List<String> avengersInfinityWar = new ArrayList<>();
    public List<String> guardiansOfTheGalaxy = new ArrayList<>();

    public void initLists(){
        avengersInfinityWar = Stream.of(
                "IronMan",
                "Star-Lord",
                "Captain America",
                "Hawkeye",
                "Thor",
                "Black Widow",
                "Hulk",
                "Vision").collect(Collectors.toList());

        guardiansOfTheGalaxy = Stream.of(
                "Star-Lord",
                "Gamora",
                "Groot",
                "Drax",
                "Racoon").collect(Collectors.toList());
    }

    private void processLists(){
        List<String> strings = Stream.concat(avengersInfinityWar.stream(),guardiansOfTheGalaxy.stream()).collect(Collectors.toList());
        strings.stream().distinct().sorted().map(i-> i.toUpperCase()).forEach(System.out::println);
    }

    public static void main(String[] args) {

        // Use Interview Class to print:
        Interview interview = new Interview();
        interview.initLists();
        interview.processLists();
        // [BLACK WIDOW, CAPTAIN AMERICA, DRAX, GAMORA, GROOT, HAWKEYE, HULK, IRONMAN, RACOON, STAR-LORD, THOR, VISION]

    }
}
