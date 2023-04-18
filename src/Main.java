import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        LinkedList<Integer> numbers = new LinkedList<>();

        while (scan.hasNextInt())
        {
            int number = scan.nextInt();
            if (number>=0)
                numbers.add(number);
            else
                break;
            sum = sum + number;
            count++;
        }

        if (count == 0) {
            System.out.println("Sorry, no data was given to work with.");
            System.exit(0);
        }

        double mean = (double)sum/count;

        for (Integer e: numbers)
            if (Math.abs(mean - e) > 0.5*mean)
                System.out.println(e);

    }
}