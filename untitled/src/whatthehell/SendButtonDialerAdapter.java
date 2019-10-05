package whatthehell;

public class SendButtonDialerAdapter implements ButtonListener {

    private Dialer d;

    public SendButtonDialerAdapter(Dialer d) {
        this.d = d;
    }

    @Override
    public void buttonPressed() {
        System.out.println("전송 완료!");
    }
}
