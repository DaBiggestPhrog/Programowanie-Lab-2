import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random los = new Random();
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            int Liczba = los.nextInt(101);
            int kwadrat = Liczba * Liczba;
            suma += kwadrat;
            System.out.println("Wylosowana liczba[" + Liczba + "], [" + Liczba + "]^2 = " + kwadrat);
        }
        System.out.println("Suma wszystkich kwadratów: " + suma);
    }
}
