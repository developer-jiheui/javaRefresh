package pkg05_maker_interface;

public class DurianHatePerson {

    public void eat(Edible edible){
        ((Food) edible).eat(edible);
    }
}
