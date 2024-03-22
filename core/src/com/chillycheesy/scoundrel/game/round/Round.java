package com.chillycheesy.scoundrel.game.round;

import com.chillycheesy.scoundrel.game.GameObject;
import com.chillycheesy.scoundrel.game.maneuver.Maneuver;

/**
 * The round interface.
 */
public interface Round extends GameObject {
    /**
     * This method is called when a new maneuver is started.
     * @param maneuver The maneuver that is started.
     */
   void nextManeuver(Maneuver maneuver);
}
