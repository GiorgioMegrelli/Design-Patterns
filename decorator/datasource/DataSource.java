package decorator.datasource;

public interface DataSource {

    byte[] read();

    int write(byte[] newValues);

}
