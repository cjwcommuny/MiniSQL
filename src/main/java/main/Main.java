package main;

import file.buffer.DefaultBufferManager;
import interpreter.DefaultInterpreter;
import manager.catalog.DefaultCatalogManager;
import manager.index.DefaultIndexManager;
import manager.record.DefaultRecordManager;
import middlelayer.DatabaseFacadeImpl;

public class Main {
    public static void main(String[] args) {
        new DefaultInterpreter(
                new DatabaseFacadeImpl(
                        new DefaultCatalogManager(),
                        new DefaultIndexManager(),
                        new DefaultRecordManager(),
                        new DefaultBufferManager()
                )
        ).interpret();
    }
}
