package common.datastructure.implementation;

import common.datastructure.ByteCarrier;
import common.type.CharNType;
import common.type.FloatType;
import common.type.IntType;
import common.type.Type;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteCarrierImpl implements ByteCarrier {
    private ByteBuffer buffer;

    public ByteCarrierImpl(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public int getInt(int offset) {
        return buffer.getInt(offset);
    }

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

    @Override
    public Object getObject(int offset, int length, Type type) {
        if (type instanceof IntType) {
            return getInt(offset);
        } else if (type instanceof FloatType) {
            return getDouble(offset);
        } else {
            //CharNType
            CharNType charNType = (CharNType) type;
            return getString(offset, length, charNType.getCharset())
                    .replace("\u0000", "");
        }
    }
}
