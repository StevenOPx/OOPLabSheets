package LabSheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {

        float height, shortest=0, total=0;
        int i=1, heightValues1_3to1_9=0, heightValuesOver1_665=0; //i = adult height values
        final float GLOBAL_AVERAGE_HEIGHT=1.665f;

        Scanner input = new Scanner(System.in);

        while(i<=6)
        {
            System.out.print("Loop " + i + "- Please enter height: ");
            height=input.nextFloat();

            while(height<0.5464 || height>2.72)
            {
                System.out.print("Loop " + i + "- Height value invalid!!! Please re-enter height: ");
                height=input.nextFloat();
            }

            total+=height;

            if(i==1)
                shortest=height;
            else if(height<shortest)
                shortest=height;

            if(height>=1.3 && height<=1.9)
                heightValues1_3to1_9++;
            if(height>GLOBAL_AVERAGE_HEIGHT)
                heightValuesOver1_665++;
            i++;

            System.out.println("\n");
        }

        System.out.println("--------------------------" + "\n" +
                           "     Height Statistics    " + "\n" +
                           "--------------------------" + "\n\n");

        System.out.println("\nThe average of the heights entered is: " + String.format("%.1f",total/6) + "m" +
                           "\nThe shortest height value entered is: " + shortest +
                           "\nThe number of height values between 1.3m and 1.9m inclusive is: " + heightValues1_3to1_9 +
                           "\nThe percentage of height values exceeding the global average height is: " +
                           String.format("%.2f", (heightValuesOver1_665/6f * 100)) + "%");

        System.exit(0);
    }
}
