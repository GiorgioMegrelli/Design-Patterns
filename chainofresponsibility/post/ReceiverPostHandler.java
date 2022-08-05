package chainofresponsibility.post;

public class ReceiverPostHandler extends PostHandler {

    public ReceiverPostHandler(Handler handler) {
        super(handler);
    }

    @Override
    protected void process(Parcel parcel) {
        printComment(parcel, "Post Office Received");
    }

}
