package org.example.states;


import org.example.Player;

public class Tepetlisaur extends State {

    public Tepetlisaur(Player player) {
        super(player);
    }

    @Override
    public String pressE() {
        return "The Tepetlisaur digs in the earth";
    }

    @Override
    public String pressClick() {
        return "The Tepetlisaur hits with a belly flop";
    }

    @Override
    public String pressSpaceBar() {
        return "The Tepetlisaur jumps a low height";
    }
}
