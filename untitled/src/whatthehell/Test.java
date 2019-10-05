package whatthehell;

public class Test {
    public static void main(String[] args) {

        Speaker speaker = new Speaker();
        Screen screen = new Screen();
        Radio radio = new Radio(screen);
        Dialer d = new Dialer(speaker, radio, screen);
        SendButtonDialerAdapter send = new SendButtonDialerAdapter(d);
        ButtonDialerAdapter bda1 = new ButtonDialerAdapter(1, d);
        ButtonDialerAdapter bda2 = new ButtonDialerAdapter(2, d);
        ButtonDialerAdapter bda3 = new ButtonDialerAdapter(3, d);
        ButtonDialerAdapter bda4 = new ButtonDialerAdapter(4, d);
        ButtonDialerAdapter bda5 = new ButtonDialerAdapter(5, d);
        ButtonDialerAdapter bda6 = new ButtonDialerAdapter(6, d);
        ButtonDialerAdapter bda7 = new ButtonDialerAdapter(7, d);
        ButtonDialerAdapter bda8 = new ButtonDialerAdapter(8, d);
        ButtonDialerAdapter bda9 = new ButtonDialerAdapter(9, d);
        ButtonDialerAdapter bda0 = new ButtonDialerAdapter(0, d);
        Button btn0 = new Button(bda0);
        Button btn1 = new Button(bda1);
        Button btn2 = new Button(bda2);
        Button btn3 = new Button(bda3);
        Button btn4 = new Button(bda4);
        Button btn5 = new Button(bda5);
        Button btn6 = new Button(bda6);
        Button btn7 = new Button(bda7);
        Button btn8 = new Button(bda8);
        Button btn9 = new Button(bda9);
        Button sendBtn = new Button(send);

        send.buttonPressed();


        d.digit(9);
    }
}
