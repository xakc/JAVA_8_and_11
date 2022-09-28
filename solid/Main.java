package com.n3.solid;

public class Main {
    public static void main(String[] args) {
        Layout simpleLeyout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLeyout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/22/22 2:00:11 PM", "Error is Error");
        logger.logError("3/22/24 2:00:11 PM", "Feature Error is goingto happen");


    }
}
