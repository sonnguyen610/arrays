import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 5, 4, 6, 7, 1};
        printArray(array);
        System.out.println();
        System.out.print("Nhập số cần chèn: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn trong mảng: ");
        int index = scanner.nextInt();

        if (index <= 1 && index >= array.length - 1) {
            for (int i = 0; i < array.length + 1; i++) {
                System.out.println();


            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("Mảng: " + "\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
