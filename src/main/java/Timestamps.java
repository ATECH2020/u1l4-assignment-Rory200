import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        //changes the hours and minutes into seconds
        int sechours1 = hours1 * 3600;
        int secminutes1 = minutes1 * 60;

        int sechours2 = hours2 * 3600;
        int secminutes2 = minutes2 * 60;

        //Subtracts the sceconds form hours 2 by hours 1
        int deltahours = sechours2 - sechours1;
        int deltaminutes = secminutes2 - secminutes1;
        int deltasec = seconds2 - seconds1;

        //adds the second together
        int deta = deltahours + deltaminutes + deltasec;

        //displays how many second it has been between the time stamps
        System.out.print(deta);



        // closing the scanner object
        scanner.close();
    }
}