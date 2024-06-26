package com.xuxiaocheng.wlist.api.core.files.options;

import com.xuxiaocheng.wlist.api.common.Recyclable;

import java.io.Serializable;

/**
 * Options when searching files/directories.
 * @param keyword the keyword to search.
 * @param pattern match pattern mode.
 * @param recursive true means search in recursive directories.
 */
public record SearchOptions(String keyword, Pattern pattern, boolean recursive)
        implements Serializable, Recyclable {
}
