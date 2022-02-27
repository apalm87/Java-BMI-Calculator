import java.util.Scanner;

public class BMIcalc
{
    public static void main (String[] args)
    {
        //setting up input
        Scanner in = new Scanner(System.in);

        //variables
        double heightInInches = 0;
        double weightInPounds = 0;
        double bmi;

        String reHeight = "Re-enter height in inches:";
        String invHeight = "Invalid inches value.";
        String invWeight = "Invalid pounds value.";
        String reWeight = "Re-enter weight in pounds:";
        String mustPositive = " Must be positive.";
        String mustNum = " Must be a number";

        boolean error = false;

        //Enter Height in inches
        System.out.print("Enter height in inches:");
        do
        {
            try
            {
                error = false;

                heightInInches = in.nextDouble();
                while (heightInInches < 1) {
                    System.out.println(invHeight + mustPositive);
                    System.out.print(reHeight);
                    heightInInches = in.nextDouble();
                }
            }
            catch (Exception e)//If characters that are not numbers.
            {
                error = true;
                System.out.println(invHeight + mustNum);
                System.out.print(reHeight);
                //buffer
                in.nextLine();
            }
        }while (error);

        //buffer
        in.nextLine();

        //Enter weight in pounds.
        System.out.print("Enter the weight in pounds:");
        do
        {
            try
            {
                error = false;

                weightInPounds = in.nextDouble();
                while (weightInPounds < 1)
                {
                    System.out.println(invWeight + mustPositive);
                    System.out.print(reWeight);
                    weightInPounds = in.nextDouble();
                }
            }
            catch (Exception e) //If characters that are not numbers.
            {
                error = true;
                System.out.println(invWeight + mustNum);
                System.out.print(reWeight);
                //buffer
                in.nextLine();
            }
        }while (error);
        //buffer
        in.nextLine();

        //calculating bmi
        bmi= (704 * weightInPounds) / (Math.pow(heightInInches,2));

        //print final results
        System.out.println("Height = " + heightInInches);
        System.out.println("Weight = " + weightInPounds);
        System.out.println("Body mass index = " + bmi);

    }//end main

}//end class

