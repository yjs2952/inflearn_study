package whatthehell;

public class ButtonDialerAdapter implements ButtonListener {

    private int digit;
    private Dialer dialer;

    public ButtonDialerAdapter(int digit, Dialer dialer) {
        this.digit = digit;
        this.dialer = dialer;
    }

    @Override
    public void buttonPressed() {
        System.out.println("꾹....");
    }
}
