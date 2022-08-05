package chainofresponsibility.post;

abstract class PostHandler implements Handler {

    private final Handler handler;

    public PostHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Parcel parcel) {
        if (handler != null) {
            handler.handle(parcel);
        }
        process(parcel);
    }

    protected abstract void process(Parcel parcel);

    protected static void printComment(Parcel parcel, String comment) {
        System.out.printf("%s: Parcel#%d\n", comment, parcel.getId());
    }

}
