package de.exxcellent.challenge.fileReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

public class CSVReader {
    private CSVParser csvParser;

    public CSVReader(String resourcePath) {
        try {
            InputStream inputStream = CSVReader.class.getResourceAsStream(resourcePath);
            InputStreamReader reader = new InputStreamReader(inputStream);
            csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getSmallestTemperatureSpread() {
        int day = 0;
        int tempDifference = Integer.MAX_VALUE;
        for (CSVRecord csvRecord : csvParser) {
            if ((StringUtils.isNumeric(csvRecord.get(1)) && StringUtils.isNumeric(csvRecord.get(2)))
                    && tempDifference > Integer.parseInt(csvRecord.get(1)) - Integer.parseInt(csvRecord.get(2))) {
                tempDifference = Integer.parseInt(csvRecord.get(1)) - Integer.parseInt(csvRecord.get(2));
                day = Integer.parseInt(csvRecord.get(0));
            }
        }
        return day;
    }
}
