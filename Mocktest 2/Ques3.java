import java.util.Scanner;

public class Ques3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the list of numbers: ");
        int count = scanner.nextInt();

        int sum = 0;
        int number;
        int i = 0;

        do {
           
            number = scanner.nextInt();
            sum += number;
            i++;
        } while (i < count);

        double average = (double) sum / count;

        System.out.println("Average: " + average);
    }
}

