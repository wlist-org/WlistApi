package com.xuxiaocheng.wlist.api.core.files.exceptions.limitations;

import java.io.Serial;

/**
 * Thrown when a file/directory name is too long.
 * This is caused by the backend storage.
 * <p>Unlike {@link com.xuxiaocheng.wlist.api.common.exceptions.TooLargeDataException}, that is an exception thrown by the core server.</p>
 */
public class NameTooLongException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 6260690462739069062L;

    /**
     * the id of the backend storage.
     */
    protected final long storage;

    /**
     * The name which is too long. (May added suffix.)
     */
    protected final String name;

    /**
     * Internal constructor.
     * @param storage the id of the backend storage.
     * @param name the too long name.
     */
    private NameTooLongException(final long storage, final String name) {
        super(name + " (storage: " + storage + ")");
        this.storage = storage;
        this.name = name;
    }

    /**
     * Get the id of the backend storage.
     * @return the id of the backend storage.
     */
    public long getStorage() {
        return this.storage;
    }

    /**
     * Get the too long name.
     * @return the too long name.
     */
    public String getName() {
        return this.name;
    }
}
