package JAVA101;
import java.util.Arrays;
import java.util.Scanner;
public class arrays_ornek4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dizinin boyutu:");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print((i +1)+".sayı: ");
            arr[i] = input.nextInt();

        }
            Arrays.sort(arr);
            System.out.println("sıralama: " + Arrays.toString(arr));
        }
    }
