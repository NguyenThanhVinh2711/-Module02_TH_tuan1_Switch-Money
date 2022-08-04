import java.util.Scanner;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        double Usd;
        double VND;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien USD : ");
        Usd = scanner.nextDouble();
        VND = Usd * 23000;
        System.out.println("VND = " + VND);
    }
}
