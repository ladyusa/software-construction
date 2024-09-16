package lec3interface.basic.messenger;

public class Manager {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.sendMessage(new Email("a@mail.com", "b@mail.com") , "HELP!!!!" );
        manager.sendMessage(new Pigeon() , "HELP!!!!" );
    }

    public void sendMessage(Messenger messenger, String data) {
        messenger.send(data);
    }
}
