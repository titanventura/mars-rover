package com.learn_modelling.mars_rover.commands;

import com.learn_modelling.mars_rover.Plateau;
import com.learn_modelling.mars_rover.Rover;

public class TurnLeftCommand extends Command {
    public TurnLeftCommand(Plateau plateau, Rover rover) {
        super(plateau, rover);
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}