package alicegame;

import lombok.Getter;

@Getter
public class Door {

    private int height;

    public Door() {
        this.height = (int) (Math.random() * 20 + 1) + 40;
    }
}
