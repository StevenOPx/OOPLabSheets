package LabSheet1;

import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {

        final float g = 9.81f;
        double gravity, massother, radiusother, massEarth, radiusEarth;

                Scanner input = new Scanner(System.in);

                System.out.print("Please enter the mass of planet Earth: ");
                massEarth = input.nextDouble();

                System.out.print("Please enter the radius of planet Earth: ");
                radiusEarth = input.nextDouble();

                System.out.print("Please enter the mass of the other planet: ");
                massother = input.nextDouble();

                System.out.print("Please enter the radius of the other planet: ");
                radiusother = input.nextDouble();

                gravity=g*massother*radiusEarth*radiusEarth/(massEarth*radiusother*radiusother);

                System.out.println("\n\nThe acceleration due to gravity on the other planet is: " +
                                    String.format("%.2f", (gravity)) + " m/s/s");

        System.exit(0);

    }
}
