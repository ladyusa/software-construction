package lec3interface.basic.messenger;

public interface Messenger {
    int MAX_MESSAGE = 500;

    void send(String message);
    String receive();
}
