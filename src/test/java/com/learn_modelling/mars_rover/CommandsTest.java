package com.learn_modelling.mars_rover;

import com.learn_modelling.mars_rover.commands.Command;
import com.learn_modelling.mars_rover.commands.MoveForwardCommand;
import com.learn_modelling.mars_rover.commands.TurnLeftCommand;
import com.learn_modelling.mars_rover.commands.TurnRightCommand;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.learn_modelling.mars_rover.Plateau.createPlateau;
import static com.learn_modelling.mars_rover.Rover.createRover;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CommandsTest {
    @Nested
    class TurnLeftCommandTest {
        @Test
        void shouldTurnRoverLeftWhenMoveLeftInstructionIsGiven() throws RoverOutOfPlateauBoundsException {
            Rover rover = createRover(1, 2, Direction.NORTH);
            Plateau plateau = createPlateau(5, 5);
            Command command = new TurnLeftCommand(plateau, rover);

            command.execute();

            assertEquals(Direction.WEST, rover.direction());
        }
    }

    @Nested
    class TurnRightCommandTest {
        @Test
        void shouldTurnRoverRightWhenMoveRightInstructionIsGiven() throws RoverOutOfPlateauBoundsException {
            Rover rover = createRover(1, 2, Direction.NORTH);
            Plateau plateau = createPlateau(5, 5);

            Command command = new TurnRightCommand(plateau, rover);

            command.execute();

            assertEquals(Direction.EAST, rover.direction());
        }
    }

    @Nested
    class MoveForwardCommandTest {
        @Test
        void shouldMoveForwardWhenMoveForwardInstructionIsGiven() throws RoverOutOfPlateauBoundsException {
            Rover rover = createRover(1, 2, Direction.NORTH);
            Plateau plateau = createPlateau(5, 5);
            Command command = new MoveForwardCommand(plateau, rover);
            Coordinate expected = new Coordinate(1, 3);

            command.execute();

            assertEquals(expected, rover.coordinate());
        }

        @Test
        void shouldNotMoveOutOfBoundsWhenMoveForwardInstructionIsGiven() {
            Rover rover = createRover(1, 3, Direction.NORTH);
            Plateau plateau = createPlateau(3, 3);
            Command command = new MoveForwardCommand(plateau, rover);

            assertThrows(RoverOutOfPlateauBoundsException.class, command::execute);
        }
    }
}
