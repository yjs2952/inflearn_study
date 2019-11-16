package alicegame;

public class Main {

    public static void main(String[] args) {
        Alice alice = new Alice();
        Key key = new Key();
        Door door = new Door();

        while (true) {
            if (alice.getHeight() > key.getSize() && alice.getHeight() < door.getHeight()) {
                break;
            }
            alice.eatCake();
            if (alice.getHeight() > key.getSize() && alice.getHeight() < door.getHeight()) {
                break;
            }
            alice.eatMushroom();
        }

        System.out.println(alice.getHeight());
    }
}
