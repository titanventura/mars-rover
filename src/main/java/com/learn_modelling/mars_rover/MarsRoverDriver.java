package com.learn_modelling.mars_rover;

import com.learn_modelling.mars_rover.commands.Command;
import com.learn_modelling.mars_rover.commands.MoveForwardCommand;
import com.learn_modelling.mars_rover.commands.TurnLeftCommand;
import com.learn_modelling.mars_rover.commands.TurnRightCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MarsRoverDriver {

    public static final HashMap<Character, Direction> charDirectionMap = new HashMap<>();

    static {
        charDirectionMap.put('N', Direction.NORTH);
        charDirectionMap.put('E', Direction.EAST);
        charDirectionMap.put('W', Direction.WEST);
        charDirectionMap.put('S', Direction.SOUTH);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("No. of test cases");
        int cases = Integer.parseInt(sc.nextLine());

        ArrayList<String> answers = new ArrayList<>();

        System.out.println("Plateau Upper Right Bound X Y in separate lines: ");
        int plateauUpperRightX = Integer.parseInt(sc.nextLine());
        int plateauUpperRightY = Integer.parseInt(sc.nextLine());

        Plateau plateau = Plateau.createPlateau(plateauUpperRightX, plateauUpperRightY);

        for (int i = 0; i < cases; i++) {

            System.out.println("Rover initial X Y Direction in separate lines: ");
            int roverX = Integer.parseInt(sc.nextLine());
            int roverY = Integer.parseInt(sc.nextLine());

            Character direction = sc.nextLine().charAt(0);

            Rover rover = Rover.createRover(roverX, roverY, charDirectionMap.get(direction));

            System.out.println("Instructions :");
            String instructions = sc.nextLine();

            instructions.chars().forEach(ch -> {
                Command command;
                switch (ch) {
                    case 'L':
                        command = new TurnLeftCommand(plateau, rover);
                        break;
                    case 'R':
                        command = new TurnRightCommand(plateau, rover);
                        break;
                    case 'M':
                        command = new MoveForwardCommand(plateau, rover);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + ch);
                }

                try {
                    command.execute();
                } catch (RoverOutOfPlateauBoundsException e) {
                    e.printStackTrace();
                }
            });

            answers.add(rover.toString());
        }

        answers.forEach(System.out::println);
    }
}
