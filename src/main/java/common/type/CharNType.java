package common.type;

public interface CharNType extends Type {
    int getLength();
    String constructStr(byte[] bytes);
}
