package decorator.datasource;

public class SharedDataSourceDecorator extends DataSourceDecorator {

    public SharedDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    private void share(byte[] bytesToShare) {
        // Sharing to remote source
        System.out.printf("%d bytes were shared to remote\n", bytesToShare.length);
    }

    @Override
    public int write(byte[] newValues) {
        share(newValues);
        return super.write(newValues);
    }

}
