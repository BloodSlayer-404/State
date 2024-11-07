package org.example.states;

import org.example.Player;

public class Koholasaur extends State{

    public Koholasaur(Player player) {
        super(player);
    }

    @Override
    public String pressE() {
        return "The Koholasaur does nothing";
    }

    @Override
    public String pressClick() {
        return "The Koholasaur lunges forward like a drill";
    }

    @Override
    public String pressSpaceBar() {
        return "The Koholasaur jumps a low height";
    }
}
