package com.learn_modelling.mars_rover.commands;

import com.learn_modelling.mars_rover.Plateau;
import com.learn_modelling.mars_rover.Rover;

public class TurnRightCommand extends Command {

    public TurnRightCommand(Plateau plateau, Rover rover) {
        super(plateau, rover);
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
