import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int[] ranArray = new int[]{2,5,9,0,2,1,8,5,4};

        for (int a=0; a<ranArray.length; a++)
        {
            if (ranArray[a] == 5){
                counter++;
            }
            System.out.println("Index number:" + ranArray[a]);
        }

        System.out.println(counter);
    }
}

