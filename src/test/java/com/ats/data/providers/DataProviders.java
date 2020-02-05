package com.ats.data.providers;
import org.testng.annotations.DataProvider;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class DataProviders {

    @DataProvider(name = "data-provider-create-new-project")
    public static Object[][] dataProviderMethod() throws IOException {

        String path = System.getProperty("user.dir");
        String SAMPLE_CSV_FILE_PATH = path+"/src/test-data/testdata.csv";

        Object[][] data = new Object[1][8];
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ){
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by the names assigned to each column
                data[0][0] = csvRecord.get("UserName");
                data[0][1] = csvRecord.get("Password");
                data[0][2] = csvRecord.get("ProjectName");
                data[0][3] = csvRecord.get("Country");
                data[0][4] = csvRecord.get("State");
                data[0][5] = csvRecord.get("City");
                data[0][6] = csvRecord.get("BidDate");
                data[0][7] = csvRecord.get("Area");
            }
        }
        return data;
    }

}
