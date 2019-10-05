package whatthehell;

public class Dialer {

    private Speaker speaker;
    private Radio radio;
    private Screen screen;

    public Dialer(Speaker speaker, Radio radio, Screen screen) {
        this.speaker = speaker;
        this.radio = radio;
        this.screen = screen;
    }

    public void digit(int n) {
        System.out.println("너가 누른 건 " + n + " 이야 빡대가리야!!!");
    }

    public void send(){
        System.out.println("따르릉");
    }
}
