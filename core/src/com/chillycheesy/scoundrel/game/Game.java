package com.chillycheesy.scoundrel.game;

import com.chillycheesy.scoundrel.game.round.Round;

/**
 * The game interface.
 */
public interface Game extends GameObject {
    /**
     * This method is called when a new round is started.
     * @param round The round that is started.
     */
    void nextRound(Round round);
}
