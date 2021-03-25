package wzorce_projektowe.strategy;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFiles(List<File> files) {
        System.out.println("A file has just been compressed using RAR method");
    }
}