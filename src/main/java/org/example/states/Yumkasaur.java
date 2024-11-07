package org.example.states;

import org.example.Player;

public class Yumkasaur extends State{

    public Yumkasaur(Player player) {
        super(player);
    }

    @Override
    public String pressE() {
        return "The Yumkasaur swings in the air";
    }

    @Override
    public String pressClick() {
        return "The Yumkasaur attacks with its claws";
    }

    @Override
    public String pressSpaceBar() {
        return "The Yumkasaur jumps a high height";
    }
}
