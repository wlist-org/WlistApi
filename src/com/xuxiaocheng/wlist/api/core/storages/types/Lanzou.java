package com.xuxiaocheng.wlist.api.core.storages.types;

import com.xuxiaocheng.wlist.api.Main;
import com.xuxiaocheng.wlist.api.core.CoreClient;
import com.xuxiaocheng.wlist.api.core.storages.configs.LanzouConfig;

import java.util.concurrent.CompletableFuture;

/**
 * The core lanzou storage API.
 */
public enum Lanzou implements StorageType {/** The instance. */ Instance;
    /**
     * Add a lanzou storage.
     * @param client the core client.
     * @param token the core token.
     * @param storage the name of the storage to add.
     * @param config the Lanzou configuration.
     * @return a future, with the id of the new storage.
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.StorageExistsException
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.IncorrectStorageAccountException
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.InvalidStorageConfigException
     * @see com.xuxiaocheng.wlist.api.common.exceptions.TooLargeDataException
     */
    public static CompletableFuture<Long> add(final CoreClient client, final String token, final String storage, final LanzouConfig config) { return Main.future(); }

    /**
     * Reset the config of the storage.
     * @param client the core client.
     * @param token the core token.
     * @param storage the id of the storage.
     * @param config the new configuration.
     * @return a future.
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.IncorrectStorageAccountException
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.InvalidStorageConfigException
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.MismatchStorageTypeException
     * @see com.xuxiaocheng.wlist.api.core.storages.exceptions.StorageInLockException
     */
    public static CompletableFuture<Void> update(final CoreClient client, final String token, final long storage, final LanzouConfig config) { return Main.future(); }


    @Override
    public boolean isPrivate() {
        return true;
    }

    @Override
    public boolean isShared() {
        return false;
    }
}
