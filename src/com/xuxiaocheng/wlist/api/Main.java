package com.xuxiaocheng.wlist.api;

import java.util.concurrent.CompletableFuture;

/**
 * The common global API.
 */
public enum Main {;
    /**
     * Initialize the core server.
     * Note that you **must** call this method before calling all the others.
     * You should ensure these directories exist and have permissions to read/write them.
     * The path should be absolute.
     * @param cache the directory of cache.
     * @param data the directory of data.
     */
    public static void initialize(final String cache, final String data) { throw Main.stub(); }

    /**
     * Shut down all internal threads.
     * <p>
     * This method can be called when exit the jvm.
     * If you don't call this method, these threads will block the jvm exit process.
     * If you called any other method after calling this, the behavior of these methods is undefined.
     */
    public static void shutdownThreads() { throw Main.stub(); }


    /**
     * Stub exception.
     * @return the stub exception.
     */
    public static RuntimeException stub() {
        return new RuntimeException("Stub!");
    }

    /**
     * Stub future.
     * @param <T> the generic type.
     * @return the stub future.
     */
    public static <T> CompletableFuture<T> future() {
        final CompletableFuture<T> future = new CompletableFuture<>();
        future.completeExceptionally(Main.stub());
        return future;
    }
}
