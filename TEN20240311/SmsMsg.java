package TEN240311;

public class SmsMsg extends AbstractMsg {

    public SmsMsg(String sender, String receiver) {
        super(sender, receiver);
    }

    public boolean setMessage(String newMessage) {
        if (newMessage.length() > 160) {
            this.message = newMessage.substring(0, 160);
            return false;
        }
        this.message = newMessage;
        return true;
    }

    public String toString() {
        return super.toString();
    }
}