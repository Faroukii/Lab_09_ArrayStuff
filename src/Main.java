import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
                int[] dataPoints = new int[100];
                Random rand = new Random();

                // Initialize array with random values between 1 and 100
                for (int i = 0; i < dataPoints.length; i++) {
                    dataPoints[i] = rand.nextInt(100) + 1;
                }

                // Display the values in dataPoints
                for (int i = 0; i < dataPoints.length; i++) {
                    System.out.printf("%d%s", dataPoints[i], i == dataPoints.length - 1 ? "" : " | ");
                }
                System.out.println();

                // Calculate and display the sum and average of dataPoints
                int sum = 0;
                for (int i = 0; i < dataPoints.length; i++) {
                    sum += dataPoints[i];
                }
                double average = (double) sum / dataPoints.length;
                System.out.printf("The sum of the random array dataPoints is: %d\n", sum);
                System.out.printf("The average of the random array dataPoints is: %.2f\n", average);
            }
        }

    }



    class safeInput {
        /**
         *
         * @param pipe a Scanner opened to read from System.in
         * @param prompt prompt for the user
         * @return a String response that is not zero length
         */
        public static String getNonZeroLenString(Scanner pipe, String prompt) {
            String retString = "0";  // Set this to zero length. Loop runs until it isn’t
            do {
                System.out.print("\n " + prompt + ": ");
                retString = pipe.nextLine();
            } while (retString.length() == 0);

            return retString;

        }

        public static int getRangedInt(String enterYourYearOfBirth, int i, int i1) {
            return i;
        }

        public class Pipe {

            //method to read integer from console
            public static int getInt(Scanner pipe, String prompt) {
                int input = -1;
                //prompt to user
                System.out.println(prompt + "int:");
                //if user insert integer
                if (pipe.hasNextInt()) {
                    //read input
                    input = pipe.nextInt();
                }
                //reset pipe
                pipe.reset();
                //if not int return -1
                return input;
            }//end of getInt();

            //method to read double
            public static double getDouble(Scanner pipe, String prompt) {
                double input = -1.0;
                //prompt to user
                System.out.println(prompt + "double:");

                //if user insert double
                if (pipe.hasNextDouble()) {
                    //read input double
                    input = pipe.nextDouble();
                }
                //reset pipe of type Scanner
                pipe.reset();
                //if input is not a double return -1.0
                return input;
            }//end of getDouble();

            public static void main(String[] args) {
                int[] dataPoints = new int[100];
                Random rand = new Random();

                // Initialize array with random values between 1 and 100
                for (int i = 0; i < dataPoints.length; i++) {
                    dataPoints[i] = rand.nextInt(100) + 1;
                }

                // Prompt the user for an integer between 1 and 100
                int userVal = safeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);

                // Search for the user's value in dataPoints
                int pos = -1;
                for (int i = 0; i < dataPoints.length; i++) {
                    if (dataPoints[i] == userVal) {
                        pos = i;
                        break;
                    }
                }

                if (pos == -1) {
                    System.out.printf("The value %d is not in the array.\n", userVal);
                } else {
                    System.out.printf("The value %d was found at array index %d.\n", userVal, pos);

                }
            }
        }

        class SafeInput {
            public static void main(String[] args) {
                int[] dataPoints = new int[100];
                Random rand = new Random();

                // Initialize array with random values between 1 and 100
                for (int i = 0; i < dataPoints.length; i++) {
                    dataPoints[i] = rand.nextInt(100) + 1;
                }

                // Prompt the user for an integer between 1 and 100
                int userVal = safeInput.getRangedInt("Enter an integer between 1 and 100: ", 1, 100);

                // Search for the user's value in dataPoints
                int pos = -1;
                for (int i = 0; i < dataPoints.length; i++) {
                    if (dataPoints[i] == userVal) {
                        pos = i;
                        break;
                    }
                }

                if (pos == -1) {
                    System.out.printf("The value %d is not in the array.\n", userVal);
                } else {
                    System.out.printf("The value %d was found at array index %d.\n", userVal, pos);
                }
            }
        }
    }


public class main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        // Initialize array with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        // Find the minimum and maximum values in dataPoints
        int minVal = dataPoints[0];
        int maxVal = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if ((dataPoints[i]))
        }
    }

   public class Main {
        public static double getAverage(double[] values) {
            double sum = 0.0;
            for (double value : values) {
                sum += value;
            }
            return sum / values.length;
            double[] dataPoints = { 1.0, 2.0, 3.0, 4.0, 5.0 };
            double average = getAverage(dataPoints);
            System.out.println("Average of dataPoints is: " + average);
        }
    }
}