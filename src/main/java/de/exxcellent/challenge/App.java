package de.exxcellent.challenge;

import de.exxcellent.challenge.fileReader.CSVReader;
import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.util.Calculator;

import java.util.List;

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

        List<Weather> csvWeatherAsList = csvReaderWeather.weatherCSVAsList();
        List<Football> csvFootballAsList = csvReaderFootball.footballCSVAsList();

        int dayWithSmallestTempSpread = Calculator.getSmallestTempSpread(csvWeatherAsList);
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = Calculator.getSmallestDistanceBetweenGoals(csvFootballAsList);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
