package chainofresponsibility;

import chainofresponsibility.post.*;

public class Example {

    private static Handler setUpService() {
        Handler receiver = new ReceiverPostHandler(null);
        Handler register = new RegisterPostHandler(receiver);
        Handler transporter = new TransporterPostHandler(register);
        return new CustomerPostHandler(transporter);
    }

    public static void main(String[] args) {
        Handler handler = setUpService();
        handler.handle(new Parcel());
    }

}
