package com.chillycheesy.scoundrel.game;

/**
 * GameObject is an interface for objects that can be created and stopped.
 * This interface is used by entities that are part of the game logic.
 */
public interface GameObject {
    /**
     * This method should be called when the object was created inside the scene.
     */
    void create();

    /**
     * This method should be called when the object is being removed from the scene.
     */
    void stop();
}
