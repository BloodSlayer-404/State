package org.example;

import org.example.states.Koholasaur;
import org.example.states.State;
import org.example.states.Tepetlisaur;
import org.example.states.Yumkasaur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player = new Player("Aether", "Nothing to see here");
    State state = player.getState();

    /**
     * Check that the methods of the Traveller state work without problems
     */
    @Test
    void travellerTest(){

        assertEquals(state, player.getState());

        assertEquals("The traveller use its Elemental Skill",
                player.useElementalSkill());

        assertEquals("The traveller attacks with a sword",
                player.attack());

        assertEquals("The traveler jumps a medium height",
                player.jump());
    }

    /**
     * Check that the methods of the Tepetlisaur state work without problems
     */
    @Test
    void tepetlisaurTest(){

        State tepetlisaur = new Tepetlisaur(player);
        player.setState(tepetlisaur);

        assertEquals(tepetlisaur, player.getState());

        assertEquals("The Tepetlisaur digs in the earth",
                player.useElementalSkill());

        assertEquals("The Tepetlisaur hits with a belly flop",
                player.attack());

        assertEquals("The Tepetlisaur jumps a low height",
                player.jump());
    }

    /**
     * Check that the methods of the Koholasaur state work without problems
     */
    @Test
    void koholasaurTest(){

        State koholasaur = new Koholasaur(player);
        player.setState(koholasaur);

        assertEquals(koholasaur, player.getState());

        assertEquals("The Koholasaur does nothing",
                player.useElementalSkill());

        assertEquals("The Koholasaur lunges forward like a drill",
                player.attack());

        assertEquals("The Koholasaur jumps a low height",
                player.jump());
    }

    /**
     * Check that the methods of the Yumkasaur state work without problems
     */
    @Test
    void yumkasaurTest(){

        State yumkasaur = new Yumkasaur(player);
        player.setState(yumkasaur);

        assertEquals(yumkasaur, player.getState());

        assertEquals("The Yumkasaur swings in the air",
                player.useElementalSkill());

        assertEquals("The Yumkasaur attacks with its claws",
                player.attack());

        assertEquals("The Yumkasaur jumps a high height",
                player.jump());
    }

}