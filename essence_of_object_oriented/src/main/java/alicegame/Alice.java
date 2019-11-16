package alicegame;

import lombok.Getter;

@Getter
public class Alice {

    private int height;

    private Mushroom mushroom;

    private Cake cake;

    public Alice() {
        this.height = (int) ((Math.random() * 100 + 1) + 100);
        mushroom = new Mushroom(this);
        cake = new Cake(this);
    }

    // 먹어
    public void eatMushroom(){
        System.out.println("버섯을 먹습니다.");
        mushroom.setSize();
    }

    public void eatCake() {
        System.out.println("케잌을 먹습니다.");
        cake.setSize();
    }

    public void setHeight(int number) {
        int temp = getHeight() + number;

        if (temp >= 1) {
            this.height = temp;
        }
    }
}
