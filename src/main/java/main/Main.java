package main;

import interpreter.DefaultInterpreter;
import middlelayer.DefaultDatabaseFacade;

public class Main {
    public static void main(String[] args) {
        new DefaultInterpreter(
                new DefaultDatabaseFacade(null, null, null)
        ).interpret();
    }
}
