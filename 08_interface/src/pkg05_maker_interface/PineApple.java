package pkg05_maker_interface;

public class PineApple implements Food, Edible{
    @Override
    public void eat(Edible edible) {
        System.out.println("PineApple yam");
    }
}
