package decorator;

import decorator.datasource.BufferDataSource;
import decorator.datasource.DataSource;
import decorator.datasource.EncryptedDataSourceDecorator;
import decorator.datasource.SharedDataSourceDecorator;

import static decorator.ExampleUtil.getRandomBytes;
import static decorator.ExampleUtil.printTestN;

public class Example {

    private static DataSource create(boolean doEncrypt, boolean doShare) {
        DataSource dataSource = new BufferDataSource();
        if (doEncrypt) {
            dataSource = new EncryptedDataSourceDecorator(dataSource);
        }
        if (doShare) {
            dataSource = new SharedDataSourceDecorator(dataSource);
        }
        return dataSource;
    }

    private static void test1() {
        printTestN(1);
        DataSource dataSource = create(false, false);
        dataSource.write(getRandomBytes());
        dataSource.read();
    }

    private static void test2() {
        printTestN(2);
        DataSource dataSource = create(true, true);
        dataSource.write(getRandomBytes());
        dataSource.read();
    }

    private static void test3() {
        printTestN(3);
        DataSource dataSource = create(false, true);
        dataSource.write(getRandomBytes());
        dataSource.read();
    }

    private static void test4() {
        printTestN(4);
        DataSource dataSource = create(true, false);
        dataSource.write(getRandomBytes());
        dataSource.read();
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

}
