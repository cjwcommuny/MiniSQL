package common.datastructure;

import common.type.Type;

import java.nio.charset.Charset;

public interface ByteCarrier {
//    byte[] read(int offset, int length);
    int getInt(int offset);
    double getDouble(int offset);
    String getString(int offset, int length,  Charset charset);
    Object getObject(int offset, int length, Type type);
}
