package pkg05_maker_interface;

public class AppleMango implements Food, Edible{
    @Override
    public void eat(Edible edible) {
        System.out.println("AppleMango yamm");
    }
}
