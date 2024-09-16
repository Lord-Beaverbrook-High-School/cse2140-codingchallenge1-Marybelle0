import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9 */
        // retrieves rightmost digit, assigns it to a variable (digX), then removes it from year
        int digOne = year % 10;
        year = (year - digOne) / 10;
        int digTwo = year % 10;
        year = (year - digTwo) / 10;
        int digThree = year % 10;
        year = (year - digThree) / 10;
        int digFour = year;
        //prints each digit on seperate lines, starting from the leftmost digit of the input
        System.out.println(digFour);
        System.out.println(digThree);
        System.out.println(digTwo);
        System.out.println(digOne);

}
}