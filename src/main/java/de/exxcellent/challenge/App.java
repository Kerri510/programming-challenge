package de.exxcellent.challenge;

import de.exxcellent.challenge.fileReader.CSVReader;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     *
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Read the CSV files
        CSVReader csvReaderWeather = new CSVReader("/de/exxcellent/challenge/weather.csv");
        CSVReader csvReaderFootball = new CSVReader("/de/exxcellent/challenge/football.csv");

        String dayWithSmallestTempSpread = csvReaderWeather.getSmallestDiffBetween2Values(0, 1, 2);
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = csvReaderFootball.getSmallestDiffBetween2Values(0, 5, 6);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
