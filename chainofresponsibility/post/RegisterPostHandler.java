package chainofresponsibility.post;

public class RegisterPostHandler extends PostHandler {

    public RegisterPostHandler(Handler handler) {
        super(handler);
    }

    @Override
    protected void process(Parcel parcel) {
        printComment(parcel, "Post Office Registered");
    }

}
