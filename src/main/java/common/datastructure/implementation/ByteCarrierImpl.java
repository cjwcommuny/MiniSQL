package common.datastructure.implementation;

import common.datastructure.ByteCarrier;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteCarrierImpl implements ByteCarrier {
    private ByteBuffer buffer;

    public ByteCarrierImpl(ByteBuffer buffer) {
        this.buffer = buffer;
    }

//    @Override
//    public byte[] read(int offset, int length) {
//        byte[] result = new byte[length];
//        buffer.get(result, offset, length);
//        return result;
//    }

    @Override
    public int getInt(int offset) {
        return buffer.getInt(offset);
    }

//    @Override
//    public char getChar(int offset) {
//        throw new UnsupportedOperationException();
//    }

    @Override
    public double getDouble(int offset) {
        return buffer.getDouble(offset);
    }

    @Override
    public String getString(int offset, int length, Charset charset) {
        byte[] bytes = new byte[length];
        buffer.position(offset);
        buffer.get(bytes);
        return new String(bytes, charset);
    }
}
