import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 1000;
        double retiro;
        while (saldo > 0) {
            System.out.println("Saldo disponible: S/" + saldo);
            System.out.print("Ingrese monto a retirar (0 para salir): ");
            retiro = entrada.nextDouble();
            if (retiro == 0) {
                break;
            }
            if (retiro <= saldo) {
                saldo = saldo - retiro;
                System.out.println("Retiro realizado con éxito.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
            System.out.println();
        }
        System.out.println("Saldo restante: S/" + saldo);
    }
}