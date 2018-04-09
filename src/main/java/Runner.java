public class Runner {

    public static void main(String[] args){

        Waterbottle redBottle = new Waterbottle(100);

        System.out.println(redBottle.getVolume());
        redBottle.drink();
        redBottle.drink();
        System.out.println(redBottle.getVolume());

    }
}
