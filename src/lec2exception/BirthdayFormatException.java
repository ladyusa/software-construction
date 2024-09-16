package lec2exception;

// unchecked exception
public class BirthdayFormatException extends RuntimeException {
    public BirthdayFormatException() {
    }

    public BirthdayFormatException(String message) {
        super(message);
    }
}
