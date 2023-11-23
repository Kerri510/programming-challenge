package de.exxcellent.challenge.fileReader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.util.Calculator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {
    @Test
    void getSmallestDiffBetween2ValuesWeather() {
        String testFilePath = "/de/exxcellent/challenge/weather.csv";

        CSVReader csvReader = new CSVReader(testFilePath);
        List<Weather> csvWeatherAsList = csvReader.weatherCSVAsList();
        int result = Calculator.getSmallestTempSpread(csvWeatherAsList);

        int expectedResult = 14;

        assertEquals(expectedResult, result);
    }

    @Test
    void getSmallestDiffBetween2ValuesFootball() {
        String testFilePath = "/de/exxcellent/challenge/football.csv";

        CSVReader csvReader = new CSVReader(testFilePath);
        List<Football> csvFootballAsList = csvReader.footballCSVAsList();
        String result = Calculator.getSmallestDistanceBetweenGoals(csvFootballAsList);

        String expectedResult = "Aston_Villa";

        assertEquals(expectedResult, result);
    }
}