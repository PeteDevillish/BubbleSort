import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to sort?");

        int n = sc.nextInt();
        int [] toSort = new int [n];


        for(int i = 0; i<toSort.length; i++){
        //for(int number : toSort){
            toSort[i] = sc.nextInt();

        }

        for(int i =0; i<(toSort.length-1);i++)
        {
            n--;
            for(int j = 0; j<toSort.length-1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    int keeper = toSort[j + 1];
                    toSort[j + 1] = toSort[j];
                    toSort[j] = keeper;
                }

            }
        }



        System.out.println(Arrays.toString(toSort));
    }
}
