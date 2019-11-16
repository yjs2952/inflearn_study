package alicegame;

public class Cake {

    private int size = 10;

    private Alice alice;

    public Cake(Alice alice) {
        this.alice = alice;
    }

    // 케잌 크기 조절
    public void setSize(){
        if (size < 10) {
            this.size = size - 1;
            int num = (int) (Math.random() * 40 + 1) + 10;
            alice.setHeight(-num);
        } else {
            System.out.println("케잌 다 쳐먹었어");
        }
    }
}
