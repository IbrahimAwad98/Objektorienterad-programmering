package TEN240311;

public class MmsMsg extends AbstractMsg {
    private final String url;

    public MmsMsg(String sender, String receiver, String url) {
        super(sender, receiver);
        if (!url.startsWith("https://")) {
            throw new IllegalArgumentException("Wrong: " + url);
        }
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public boolean setMessage(String newMessage) {
        if (newMessage.length() > 80) {
            this.message = newMessage.substring(0, 80);
            return false;
        }
        this.message = newMessage;
        return true;
    }

    public String toString() {
        return super.toString() + " | Url: " + url;
    }
}