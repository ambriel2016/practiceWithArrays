public class ArraysNumbers {
    public static void main(String[] args) {
        // declaring an array
        int[] inArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int sum=0;

        for (int a=0; a<inArray.length; a++)
        {sum+=inArray[a];
            System.out.println("The number: " + inArray[a]);
        }
        System.out.println("The total of the array is: " + sum);

    }
}
