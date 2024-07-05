// ask for min and max
// ask for number of chance to try
// generate the number to guess within the allowed range
// have a counter that is increased on each iteration
// use do while loop to ask for user input whislt checking for the number of chance
// if if user guess right, exit congratulating him, else show the right answer
//NB: ONLY SHOW THE RIGHT ANSWER WHEN USER IS WRONG AFTER THE LOOP

import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

public static int number;
    public static void main(String[]args)
    {
        starting();

             System.out.print("Minimum Value:");
            int min = s.nextInt();

            System.out.print("Maximum Value:");
            int max = s.nextInt();

            if ((max-min) >=10) {

                System.out.println("Enter the number of chance to try: ");
                System.out.print("Number of times: ");
                int limit = s.nextInt();
                int i = 0, userInput;
                do
                {
                    number = guessedNumber(min, max);
                        System.out.println("Enter the correct number");
                         userInput = s.nextInt();
                        if (number<userInput)
                        {
                            System.out.println("Too high");
                        }
                         else if (number>userInput)
                        {
                            System.out.println("Too low");
                        }

                       else if (userInput == number)
                        {
                            System.out.println(" !!!!!!!!!!!!!!!!!!!! Congratulation !!!!!!!!!!!!!!!! ");
                            System.out.println( "!!!!!!!!!!!!!!!!!!! you win !!!!!!!!!!!!!!!!!!! ");
                            return;
                        }

                       i++;
                }
                   while(i<limit);
                if (userInput!= number)
                {
                    System.out.println("!!!You loose!!!");
                    System.out.println("The correct number is: "+number);
                }

                }
    }

public static void starting ()
{
    System.out.println("Starting ....");
    System.out.println("Guess the correct number");
    System.out.println(" ******* NB:Make sure the range between Min and Max value is not less than 10 ******* ");

}
public static int guessedNumber (int min ,int max )
{
int number = (((min/3)+(max/3))*3)/2;
   // System.out.println(number);
    return number;
}
}
