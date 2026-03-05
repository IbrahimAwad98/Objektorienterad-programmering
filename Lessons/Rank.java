package Lessons;

public enum Rank {
    ACE(1), TWO(2), THREE(3), JACK(11), QUEEN(12), KINGS(13);
    private final int value;

    private Rank(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
