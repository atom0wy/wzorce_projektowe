package wzorce_projektowe.singleton.exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class LoggerBillPugh {
    private static LoggerLazy instance;
    private static File loggingFile;

    private LoggerBillPugh() {
        loggingFile = new File("log.txt");
    }

    private static class LoggerBillPughHelper {
        private static final LoggerBillPugh INSTANCE = new LoggerBillPugh();
    }

    public static LoggerBillPugh getInstance() {
        return LoggerBillPugh.LoggerBillPughHelper.INSTANCE;
    }

    public void log(LEVEL level, String msg) {
        LocalTime logTime = LocalTime.now();
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(loggingFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logTime + ", " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();
    }
}