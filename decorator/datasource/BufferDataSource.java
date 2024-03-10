package decorator.datasource;

import java.util.Arrays;

public class BufferDataSource implements DataSource {

    private static final int DEFAULT_CAPACITY = 8;

    private byte[] values;
    private int size;

    public BufferDataSource() {
        this(DEFAULT_CAPACITY);
    }

    public BufferDataSource(int capacity) {
        values = new byte[capacity];
        size = 0;
    }

    public BufferDataSource(byte[] value) {
        size = value.length;
        values = Arrays.copyOf(value, size);
    }

    @Override
    public byte[] read() {
        return read(0, size);
    }

    private byte[] read(int readOffset, int readSize) {
        final int trueSize = Math.max(Math.min(size - readOffset, readSize), 0);
        if (trueSize == 0) {
            return new byte[0];
        }
        byte[] result = new byte[trueSize];
        System.arraycopy(values, readOffset, result, 0, trueSize);
        return result;
    }

    @Override
    public int write(byte[] newValues) {
        return write(newValues, 0, newValues.length);
    }

    private int write(byte[] newValues, int writeOffset, int writeSize) {
        final int trueSize = Math.max(Math.min(newValues.length - writeOffset, writeSize), 0);
        if (trueSize > 0) {
            if (size + trueSize > values.length) {
                grow(size + trueSize);
            }
            System.arraycopy(newValues, writeOffset, values, size, trueSize);
            size += trueSize;
        }
        return trueSize;
    }

    private void grow(int newCapacity) {
        newCapacity = Math.max(newCapacity, values.length * 2);
        values = Arrays.copyOf(values, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(read());
    }

}
