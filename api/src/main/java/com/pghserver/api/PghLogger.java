package com.pghserver.api;

public interface PghLogger {

    /**
     * Logs a message to the console labeled as info.
     *
     * @param message Message parts
     */
    void info(Object... message);

    /**
     * Logs a message to the console labeled as a warning.
     *
     * @param message Message parts
     */
    void warn(Object... message);

    /**
     * Logs a message to the console labeled as an error.
     *
     * @param message Message parts
     */
    void error(Object... message);

    /**
     * Logs a message to the console labeled as a fatal error.
     *
     * @param message Message parts
     */
    void fatal(Object... message);
}
