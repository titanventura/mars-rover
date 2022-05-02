package com.learn_modelling.mars_rover.commands;

import com.learn_modelling.mars_rover.Plateau;
import com.learn_modelling.mars_rover.Rover;
import com.learn_modelling.mars_rover.RoverOutOfPlateauBoundsException;

public abstract class Command {

    protected final Plateau plateau;
    protected final Rover rover;

    public Command(Plateau plateau, Rover rover) {
        this.plateau = plateau;
        this.rover = rover;
    }

    public abstract void execute() throws RoverOutOfPlateauBoundsException;
}
