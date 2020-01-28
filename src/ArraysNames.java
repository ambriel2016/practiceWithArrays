import java.util.Scanner;

public class ArraysNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        for (int a = 0; a < names.length; a++){
            System.out.println("Please enter a name: ");
            names[a] = sc.nextLine();
        }
        for(String s:names){
            System.out.println("name: "+ s);}
    }
}
