package pkg02_has_a;

public class MainClass {

  public static void main(String[] args) {
    
    Soldier soldier = new Soldier();

//    soldier.reload(20);

    for(int n = 0; n < 20; n++) {
      soldier.shoot();
    }
    
    soldier.reload(20);

  }

}
