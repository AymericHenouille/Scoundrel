package com.chillycheesy.scoundrel.game.board;

import com.chillycheesy.scoundrel.game.GameObject;
import com.chillycheesy.scoundrel.game.player.Player;

public interface Board extends GameObject {
    Player getPlayer();
}
