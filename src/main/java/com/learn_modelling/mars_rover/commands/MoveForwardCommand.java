package com.learn_modelling.mars_rover.commands;

import com.learn_modelling.mars_rover.Plateau;
import com.learn_modelling.mars_rover.Rover;
import com.learn_modelling.mars_rover.RoverOutOfPlateauBoundsException;

public class MoveForwardCommand extends Command {
    public MoveForwardCommand(Plateau plateau, Rover rover) {
        super(plateau, rover);
    }

    @Override
    public void execute() throws RoverOutOfPlateauBoundsException {
        if (!plateau.hasWithinBounds(rover.forwardCoordinate())) throw new RoverOutOfPlateauBoundsException();
        rover.moveForward();
    }
}
