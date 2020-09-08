import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();
        int classADesk;
        int classBDesk;
        int classCDesk;
        int deltaDesk;

        //Will do the division and get the remainder
        classADesk = (classA / 2) + (classA % 2);
        classBDesk = (classB / 2) + (classB % 2);
        classCDesk = (classC / 2) + (classC % 2);
        deltaDesk = classADesk + classBDesk + classCDesk;

        //prints the amount of desks total
        System.out.print(deltaDesk);
 


        // closing the scanner object
        scanner.close();
    }
}