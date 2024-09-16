package lec2exception;

public class NotEnoughBalanceException extends Exception {

    public NotEnoughBalanceException() {}

    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
