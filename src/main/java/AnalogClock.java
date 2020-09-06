import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        int degrees = scanner.nextInt();
        int start;
        int min;
        int end;
      


        //finds the hour it starts at
        start = degrees / 30;
        min = (degrees / 6) - (degrees % 30) - 1;
        end = min * 6;
        

        //prints the time.
        System.out.println(end);



        // closing the scanner object
        scanner.close();
    }
}