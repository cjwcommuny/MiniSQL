package common.type;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public interface CharNType extends Type {
    public static Charset charset = StandardCharsets.UTF_16;
    int getLength();
    String constructStr(byte[] bytes);
}
