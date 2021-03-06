package com.logilog.simjava.core;

import com.logilog.simjava.action.Action;

import java.util.function.Function;

public class FilterStoreGet extends StoreGet {
    public Function<Object, Boolean> filter;

    public FilterStoreGet(Environment environment, Action<Event> callback, Function<Object, Boolean> filter) {
        super(environment, callback);
        this.filter = filter;
    }
}
