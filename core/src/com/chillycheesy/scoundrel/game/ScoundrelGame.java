package com.chillycheesy.scoundrel.game;

import com.chillycheesy.scoundrel.game.board.Board;
import com.chillycheesy.scoundrel.game.historic.Historic;
import com.chillycheesy.scoundrel.game.round.Round;

public class ScoundrelGame implements Game {
    private Historic<Round> rounds;
    private Board mainBoard;
    private Board opponentBoard;

    @Override
    public void create() {

    }

    @Override
    public void nextRound(Round round) {

    }

    @Override
    public void stop() {

    }
}
