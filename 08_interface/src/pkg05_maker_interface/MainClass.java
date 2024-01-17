package pkg05_maker_interface;

import java.security.Permission;

public class MainClass {
    public static void main(String[] args) {

        Person person = new Person();
        person.eat(new AppleMango());
        person.eat(new PineApple());
        person.eat(new Durian());

        DurianHatePerson dhp = new DurianHatePerson();
        dhp.eat(new AppleMango());
        dhp.eat(new PineApple());
        //dhp.eat(new Durian());
    }
}
