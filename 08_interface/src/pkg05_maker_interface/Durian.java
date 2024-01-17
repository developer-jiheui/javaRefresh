package pkg05_maker_interface;

public class Durian implements Food {
    @Override
    public void eat(Edible edible) {
        System.out.println("Durian yamm");
    }
}
