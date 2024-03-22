package com.chillycheesy.scoundrel.game.historic;

import com.chillycheesy.scoundrel.game.GameObject;

public interface Historic<T> extends GameObject {
    void append(T item);

    T getLatest();
}
