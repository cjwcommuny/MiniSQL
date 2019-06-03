package common.type;

import java.nio.charset.Charset;

public interface CharNType extends Type {
    Charset getCharset();
    int getLength();
    String constructStr(byte[] bytes);
}
