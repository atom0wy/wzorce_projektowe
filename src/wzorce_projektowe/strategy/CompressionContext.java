package wzorce_projektowe.strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void createArchive(List<File> files) {
        compressionStrategy.compressFiles(files);
    }
}