package main;

import file.buffer.DefaultBufferManager;
import interpreter.DefaultInterpreter;
import manager.catalog.DefaultCatalogManager;
import manager.index.DefaultIndexManager;
import manager.record.DefaultRecordManager;
import middlelayer.DatabaseFacadeImpl;

import java.io.*;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        new DefaultInterpreter(
                new DatabaseFacadeImpl(
                        DefaultCatalogManager.getInstance(),
                        DefaultIndexManager.getInstance(),
                        DefaultRecordManager.getInstance(),
                        DefaultBufferManager.getInstance()
                )
        ).interpret();
//        testInsertions();

    }

//    private static void testInsertions() {
//        String instruction = "execfile '/Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/MiniSQL/test-samples/100_000insert.sql';";
////        InputStream inputStream = new ByteArrayInputStream(instruction.getBytes());
////        PrintStream printStream = new PrintStream(new NullOutputStream());
//        InputStream inputStream = System.in;
//        PrintStream printStream = System.out;
//
//        long startTime = System.nanoTime();
//        new DefaultInterpreter(
//                new DatabaseFacadeImpl(
//                        DefaultCatalogManager.getInstance(),
//                        DefaultIndexManager.getInstance(),
//                        DefaultRecordManager.getInstance(),
//                        DefaultBufferManager.getInstance()
//                ),
//                inputStream,
//                printStream
//        ).interpret();
//        inputStream.
//        long endTime = System.nanoTime();
//        long totalTime = endTime - startTime;
//        double seconds = (double)totalTime / 1_000_000_000.0;
//        System.out.println("time: " + seconds + "s");
//    }

    private static class NullOutputStream extends OutputStream {
        @Override
        public void write(int b) throws IOException {
            //do nothing
        }
    }
}
