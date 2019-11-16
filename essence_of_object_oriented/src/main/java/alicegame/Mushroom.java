package alicegame;

public class Mushroom {

    private int size = 10;

    private Alice alice;

    public Mushroom(Alice alice) {
        this.alice = alice;
    }

    // 버섯 크기 변경
    public void setSize(){
        if (size < 10) {
            this.size = size - 1;
            int num = (int) (Math.random() * 40 + 1) + 10;
            alice.setHeight(num);
        } else {
            System.out.println("버섯 다 처먹었어");
        }
    }
}
