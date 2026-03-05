package TEN240311;

public abstract class AbstractMsg {
    private final String sender, receiver;
    protected String message;

    public AbstractMsg(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return message;
    }

    public abstract boolean setMessage(String newMessage);

    public String toString() {
        return "From: " + sender + ", To: " + receiver + ", Message: " + message;
    }
}