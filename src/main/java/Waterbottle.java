public class Waterbottle {
    private int volume;

    public Waterbottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public int emptyBottle(){
        return this.volume = 0;
    }

    public int fillBottle(){
        return this.volume = 100;
    }

}
