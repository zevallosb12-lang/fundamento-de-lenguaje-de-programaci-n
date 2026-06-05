import java.util.Scanner;
public class SistemaVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double venta;
        double total = 0;
        double mayor = 0;
        double menor = 0;
        int cantidad = 0;
        System.out.println("Ingrese las ventas (0 para finalizar):");
        while (true) {
            System.out.print("Venta: ");
            venta = entrada.nextDouble();
            if (venta == 0) {
                break;
            }
            total += venta;
            cantidad++;
            if (cantidad == 1) {
                mayor = venta;
                menor = venta;
            } else {
                if (venta > mayor) {
                    mayor = venta;
                }
                if (venta < menor) {
                    menor = venta;
                }
            }
        }
        if (cantidad > 0) {
            double promedio = total / cantidad;
            System.out.println("\nCantidad de ventas: " + cantidad);
            System.out.println("Venta mayor: " + mayor);
            System.out.println("Venta menor: " + menor);
            System.out.println("Total vendido: " + total);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se registraron ventas.");
        }
    }
}
