import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble(); // если ввести букву s, то случится ошибка во время исполнения
        System.out.println(i / 3);
    }
}