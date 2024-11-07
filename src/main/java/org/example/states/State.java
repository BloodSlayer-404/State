package org.example.states;

import lombok.AllArgsConstructor;
import org.example.Player;

@AllArgsConstructor
public abstract class State {

    Player player;

    /**
     * Indicates to the state to use its special ability
     * @return A text indicating that the state use its special ability
     */
    public abstract String pressE();

    /**
     * Indicates to the state to use its attacks
     * @return A text indicating that the state use its attack
     */
    public abstract String pressClick();

    /**
     * Indicates to the state to jump
     * @return A text indicating that the state jumps
     */
    public abstract String pressSpaceBar();
}
