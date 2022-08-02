package decorator.datasource;

public class EncryptedDataSourceDecorator extends DataSourceDecorator {

    public EncryptedDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    private byte[] encrypt(byte[] value) {
        // Aes-2^1,000,000
        System.out.printf("%d bytes were encrypted\n", value.length);
        return value;
    }

    private byte[] decrypt(byte[] value) {
        // Aes-2^1,000,000
        System.out.printf("%d bytes were decrypted\n", value.length);
        return value;
    }

    @Override
    public byte[] read() {
        return decrypt(super.read());
    }

    @Override
    public int write(byte[] newValues) {
        return super.write(encrypt(newValues));
    }

}
