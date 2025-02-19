package clases;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class Padre {
    protected int transacciones, retiro, deposito;
    private static int saldo = 10000; // Saldo inicial
    private static ArrayList<String> historial = new ArrayList<>(); // Historial de transacciones
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int seleccion;
        do {
            System.out.println("============================");
            System.out.println("Bienvenido al Cajero Automático");
            System.out.println("============================");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consulta de Saldo");
            System.out.println("2. Retiro de Efectivo");
            System.out.println("3. Depósito de Efectivo");
            System.out.println("4. Ver Historial de Transacciones");
            System.out.println("5. Salir");
            seleccion = entrada.nextInt();

            switch (seleccion) {
                case 1:
                    ejecutarTransaccion(new Consulta());
                    break;
                case 2:
                    ejecutarTransaccion(new Retiro());
                    break;
                case 3:
                    ejecutarTransaccion(new Deposito());
                    break;
                case 4:
                    mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Gracias, vuelva pronto.");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (seleccion != 5);
    }

    private void ejecutarTransaccion(Padre transaccion) {
        transaccion.Transacciones();
    }

    public void agregarHistorial(String mensaje) {
        historial.add(mensaje);
    }

    public void mostrarHistorial() {
        System.out.println("=================================");
        System.out.println("Historial de Transacciones:");
        for (String transaccion : historial) {
            System.out.println(transaccion);
        }
        System.out.println("=================================");
    }

    // Métodos abstractos
    public abstract void Transacciones();

    // Getters y Setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        Padre.saldo = saldo;
    }
}