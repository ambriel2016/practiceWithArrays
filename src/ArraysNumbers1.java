import java.util.Scanner;

public class ArraysNumbers1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] inArray = new int[10];
        int sum = 0;
        int avg = 0;

        for (int a=0; a<inArray.length; a++)
        {
            System.out.println("Please enter a number: ");
            inArray[a] = sc.nextInt();
            sum = sum + inArray[a];
        }
        System.out.println("The total of the array is: " + sum);

        avg = sum / inArray.length;

        System.out.println("The average of the array is: "+ avg);
    }
}

