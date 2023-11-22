package de.exxcellent.challenge.fileReader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {
    @Test
    void getSmallestDiffBetween2ValuesWeather() {
        String testFilePath = "/de/exxcellent/challenge/weather.csv";

        CSVReader csvReader = new CSVReader(testFilePath);
        String result = csvReader.getSmallestDiffBetween2Values(0, 1, 2);

        String expectedResult = "14";

        assertEquals(expectedResult, result);
    }

    @Test
    void getSmallestDiffBetween2ValuesFootball() {
        String testFilePath = "/de/exxcellent/challenge/football.csv";

        CSVReader csvReader = new CSVReader(testFilePath);
        String result = csvReader.getSmallestDiffBetween2Values(0, 5, 6);

        String expectedResult = "Aston_Villa";

        assertEquals(expectedResult, result);
    }
}