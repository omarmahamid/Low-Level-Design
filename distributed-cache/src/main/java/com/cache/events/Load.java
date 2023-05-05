package com.cache.events;

import com.cache.models.Record;

public class Load<K, V> extends Event<K, V> {

    public Load(Record<K, V> element, long timestamp) {
        super(element, timestamp);
    }
}
