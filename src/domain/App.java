package domain;

import analyse.Report;
import resources.config.ReadConfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.Instant;

public class App {
    public static void main(String[] args) {
        Report report = new Report();

        ReadConfig readConfig = new ReadConfig();

        File file = null;
        PrintStream fileOut = null;
        try {
            String path = readConfig.key("pathToExecutionReport");

            path = path.replace("{TIME}", Instant.now().toString());

            file = new File(path);
            fileOut = new PrintStream(file);
        }catch(NullPointerException ex){
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.setOut(fileOut);

        System.out.println(report.run(50));


    }
}
