package alicegame;

import lombok.Getter;

@Getter
public class Key {

    private int size;

    public Key() {
        this.size = (int) (Math.random() * 20 + 1) + 10;
    }
}
