package de.exxcellent.challenge.fileReader;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private CSVParser csvParser;

    /**
     * @param resourcePath Path from the CSV File
     */
    public CSVReader(String resourcePath) {
        try {
            InputStream inputStream = CSVReader.class.getResourceAsStream(resourcePath);
            InputStreamReader reader = new InputStreamReader(inputStream);
            csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return Returning CSV File as list
     */
    public List<Football> footballCSVAsList() {
        List<Football> result = new ArrayList<>();
        List<CSVRecord> tempList = csvParser.getRecords();
        for (int i = 1; i < tempList.size(); i++) {
            CSVRecord csvRecord = tempList.get(i);

            Football football = new Football(csvRecord.get(0),
                    Integer.parseInt(csvRecord.get(1)),
                    Integer.parseInt(csvRecord.get(2)),
                    Integer.parseInt(csvRecord.get(3)),
                    Integer.parseInt(csvRecord.get(4)),
                    Integer.parseInt(csvRecord.get(5)),
                    Integer.parseInt(csvRecord.get(6)),
                    Integer.parseInt(csvRecord.get(7)));

            result.add(football);
        }

        return result;
    }

    /**
     * @return Returning CSV File as list
     */
    public List<Weather> weatherCSVAsList() {
        List<Weather> result = new ArrayList<>();
        List<CSVRecord> tempList = csvParser.getRecords();
        for (int i = 1; i < tempList.size(); i++) {
            CSVRecord csvRecord = tempList.get(i);

            Weather weather = new Weather(Integer.parseInt(csvRecord.get(0)),
                    Integer.parseInt(csvRecord.get(1)),
                    Integer.parseInt(csvRecord.get(2)),
                    Integer.parseInt(csvRecord.get(3)),
                    Float.parseFloat(csvRecord.get(4)),
                    Integer.parseInt(csvRecord.get(5)),
                    Integer.parseInt(csvRecord.get(6)),
                    Float.parseFloat(csvRecord.get(7)),
                    Integer.parseInt(csvRecord.get(8)),
                    Integer.parseInt(csvRecord.get(9)),
                    Float.parseFloat(csvRecord.get(10)),
                    Integer.parseInt(csvRecord.get(11)),
                    Integer.parseInt(csvRecord.get(12)),
                    Float.parseFloat(csvRecord.get(13)));

            result.add(weather);
        }

        return result;
    }

}
