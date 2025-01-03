package org.example.eiscuno.model.card.cardTypes;

import org.example.eiscuno.model.cardAbility.ICardAbility;
import org.example.eiscuno.model.card.ACard;
import org.example.eiscuno.model.card.ICard;

/**
 * Represents a Special Card in the game
 * @author Nicolás Córdoba
 * @author Miguel Castillo
 * @author Camilo Pinzon
 * @version 1.0
 */
public class SpecialCard extends ACard {

    /**
     * Constructs a NumberCard with the specified parameters
     * @param url     the URL of the card image
     * @param value   the numeric value of the card
     * @param color   the color of the card
     * @param ability the ability associated
     */
    public SpecialCard(String url, String value, String color, ICardAbility ability) {
        super(url, value, color, ability);
    }

    /**
     * Determines if the current NumberCard is playable based on the specified card
     * @param card the card to compare
     * @return true if the card is playable; false otherwise
     */
    @Override
    public boolean isPlayable(ICard card) {
        return true;
    }

    /**
     * Sets the color of the NumberCard.
     * @param color the new color to assign to the card
     */
    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
