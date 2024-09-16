package lec3interface.basic.messenger;

public class Email implements Messenger {

    private String senderEmail;
    private String receiverEmail;

    public Email(String senderEmail, String receiverEmail) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
    }

    @Override
    public void send(String message) {
        System.out.println("-------- Email ---------");
        System.out.println("From: " + senderEmail);
        System.out.println("To: " + receiverEmail);
        System.out.println("Message: " + message);
    }

    @Override
    public String receive() {
        return "";
    }
}
