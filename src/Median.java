import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        int MAXVALUE = 100;
        double m = 0;
        int a;
//ввод
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        a = in.nextInt();
        double[] arr = new double[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент arr[" + i + "]:");
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();

        //сортировка
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //медиан
        if (arr.length % 2 == 1) {
            m = arr[(a - 1) / 2];
        } else {
            m = (arr[(a - 1) / 2] + arr[(a - 1) / 2 + 1]) / 2;
        }
        System.out.print("Median = " + m);
    }
}