package org.example.eiscuno.cardAbility.AbilityTypes;

import org.example.eiscuno.cardAbility.CardAbility;
import org.example.eiscuno.cardAbility.ICardAbility;
import org.example.eiscuno.controller.GameUnoController;
import org.example.eiscuno.model.game.GameUno;
import org.example.eiscuno.model.player.Player;

public class DrawTwoAbility extends CardAbility {

    public DrawTwoAbility(GameUnoController gameUnoController, GameUno gameUno) {
        super(gameUnoController, gameUno);
    }

    @Override
    public void execute() {
        gameUno.eatCard(gameUno.getVictimPlayer(), 2);
        gameUnoController.printCardsMachinePlayer();
        gameUnoController.printCardsMachinePlayer();
        gameUno.changeTurn();
    }

}
