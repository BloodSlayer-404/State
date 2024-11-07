package org.example.states;

import org.example.Player;

public class Traveller extends State{

    public Traveller(Player player) {
        super(player);
    }

    @Override
    public String pressE() {
        return "The traveller use its Elemental Skill";
    }

    @Override
    public String pressClick() {
        return "The traveller attacks with a sword";
    }

    @Override
    public String pressSpaceBar() {
        return "The traveler jumps a medium height";
    }
}
