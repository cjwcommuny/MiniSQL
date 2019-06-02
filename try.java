import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import java.nio.ByteBuffer;

class Main {
    static int BUFFER_SIZE = 10;

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/cjw/Desktop/test";
        RandomAccessFile file = new RandomAccessFile(fileName, "rw");
        FileChannel fileChannel = file.getChannel();
        MappedByteBuffer buffer1 = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 1000);
        System.out.println(buffer1.capacity());
        buffer1.putChar('v');
        fileChannel.write(buffer1);
        System.out.println(file.length());
    }

    // private static void test2() {
    //     String fileName = "/Users/cjw/Desktop/test";
    //     RandomAccessFile file = new RandomAccessFile(fileName, "rw");
    //     FileChannel fileChannel = file.getChannel();
    //     if (fileChannel.size() < BUFFER_SIZE) {
    //         MappedByteBuffer buffer1 = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, fileChannel.size());
    //         // buffer1.load();
    //     } else {
    //         MappedByteBuffer buffer1 = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, BUFFER_SIZE);
    //         // buffer1.load();
    //         MappedByteBuffer buffer2 = fileChannel.map(FileChannel.MapMode.READ_WRITE, BUFFER_SIZE, 2 * BUFFER_SIZE);
    //         // buffer2.load();
    //     }
    //     // TODO
    //     MappedByteBuffer[] buffers = new MappedByteBuffer[] { buffer1, buffer2 };

    //     // scatter-read
    //     int bytesRead = fileChannel.read(buffers);

    //     // gather-write
    //     fileChannel.write(buffers);
    //     for (var buffer : buffers) {
    //         buffer.force();
    //     }
    // }
}
/**
 * RandomAccessFile -> FileChannel -> MappedByteBuffer[] (not necessarily full)
 * 
 * 
 */