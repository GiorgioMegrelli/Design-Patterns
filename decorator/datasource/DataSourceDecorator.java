package decorator.datasource;

public class DataSourceDecorator implements DataSource {

    private final DataSource decorated;

    public DataSourceDecorator(DataSource dataSource) {
        decorated = dataSource;
    }

    @Override
    public byte[] read() {
        return decorated.read();
    }

    @Override
    public int write(byte[] newValues) {
        return decorated.write(newValues);
    }

}