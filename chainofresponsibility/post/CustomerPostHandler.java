package chainofresponsibility.post;

public class CustomerPostHandler extends PostHandler {

    public CustomerPostHandler(Handler handler) {
        super(handler);
    }

    @Override
    protected void process(Parcel parcel) {
        printComment(parcel, "Customer took");
    }

}
