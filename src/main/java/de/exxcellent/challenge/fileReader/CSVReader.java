package de.exxcellent.challenge.fileReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

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
     * @param returnColumn The column you want to have back as a result
     * @param column1      The column with the first value
     * @param column2      The column with the second value
     * @return Content of the specified returnColumn
     */
    public String getSmallestDiffBetween2Values(int returnColumn, int column1, int column2) {
        String result = "";
        int tempDifference = Integer.MAX_VALUE;
        for (CSVRecord csvRecord : csvParser) {
            if ((StringUtils.isNumeric(csvRecord.get(column1)) && StringUtils.isNumeric(csvRecord.get(column2)))
                    && tempDifference > Math.abs(Integer.parseInt(csvRecord.get(column1)) - Integer.parseInt(csvRecord.get(column2)))) {
                tempDifference = Math.abs(Integer.parseInt(csvRecord.get(column1)) - Integer.parseInt(csvRecord.get(column2)));
                result = csvRecord.get(returnColumn);
            }
        }
        return result;
    }
}
