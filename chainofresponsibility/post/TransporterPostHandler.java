package chainofresponsibility.post;

public class TransporterPostHandler extends PostHandler {

    public TransporterPostHandler(Handler handler) {
        super(handler);
    }

    @Override
    protected void process(Parcel parcel) {
        printComment(parcel, "Post Office Transported");
    }

}
