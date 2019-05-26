package main;

import file.buffer.DefaultBufferManager;
import interpreter.DefaultInterpreter;
import manager.catalog.DefaultCatalogManager;
import manager.record.DefaultRecordManager;
import middlelayer.DefaultDatabaseFacade;

public class Main {
    public static void main(String[] args) {
        new DefaultInterpreter(
                new DefaultDatabaseFacade(
                        new DefaultCatalogManager(),
                        null,
                        new DefaultRecordManager(),
                        new DefaultBufferManager()
                )
        ).interpret();
    }
}
