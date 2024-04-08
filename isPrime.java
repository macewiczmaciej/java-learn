import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = scanner.nextInt();
        scanner.close();

        if (x <= 1) {
            System.out.println("Wprowadź liczbę większą niż 1");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(x + " jest liczbą pierwszą");
        } else {
            System.out.println(x + " nie jest liczbą pierwszą");
        }
    }
}
