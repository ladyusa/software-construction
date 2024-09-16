package lec2exception;

import java.io.IOException;

// checked exception
public class CSVFileException extends IOException {
    public CSVFileException() {
    }

    public CSVFileException(String message) {
        super(message);
    }
}
