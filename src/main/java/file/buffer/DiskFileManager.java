package file.buffer;

import java.io.File;

public interface DiskFileManager {
    File createTableFile(String tableName);
}
