package decorator;

import decorator.datasource.BufferDataSource;
import decorator.datasource.DataSource;
import decorator.datasource.EncryptedDataSourceDecorator;
import decorator.datasource.SharedDataSourceDecorator;

import java.util.Random;

public class Example {

    private static final Random random = new Random();

    private static byte[] randomBytes() {
        byte[] result = new byte[5 + random.nextInt(4)];
        random.nextBytes(result);
        return result;
    }

    private static void testN(int n) {
        System.out.printf("Test #%d:\n", n);
    }

    private static DataSource create(boolean doEncrypt, boolean doShare) {
        DataSource dataSource = new BufferDataSource();
        // Order is IMPORTANT!
        if (doShare) {
            dataSource = new SharedDataSourceDecorator(dataSource);
        }
        if (doEncrypt) {
            dataSource = new EncryptedDataSourceDecorator(dataSource);
        }
        return dataSource;
    }

    private static void test1() {
        testN(1);
        DataSource dataSource = create(false, false);
        dataSource.write(randomBytes());
        dataSource.read();
    }

    private static void test2() {
        testN(2);
        DataSource dataSource = create(true, true);
        dataSource.write(randomBytes());
        dataSource.read();
    }

    private static void test3() {
        testN(3);
        DataSource dataSource = create(false, true);
        dataSource.write(randomBytes());
        dataSource.read();
    }

    private static void test4() {
        testN(4);
        DataSource dataSource = create(true, false);
        dataSource.write(randomBytes());
        dataSource.read();
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

}
