package org.example;

import lombok.Getter;
import lombok.Setter;
import org.example.states.State;
import org.example.states.Traveller;

@Getter
@Setter
public class Player {

    private State state;
    private String username;
    private String sing;

    public Player(String username, String sing){
        this.state = new Traveller(this);
        this.username = username;
        this.sing = sing;
    }

    /**
     * Call the attack method of the actual state
     * @return The attack method of the actual state
     */
    public String attack(){
        return state.pressClick();
    }

    /**
     * Call the jump method of the actual state
     * @return The height that the actual state can jump
     */
    public String jump(){
        return state.pressSpaceBar();
    }

    /**
     * Call the elemental skill method of the actual state
     * @return The special ability of the actual state
     */
    public String useElementalSkill(){
        return state.pressE();
    }


}
