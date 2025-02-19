package clases;

public class Consulta extends Padre {
    @Override
    public void Transacciones() {
        System.out.println("=================================");
        System.out.println("Tu saldo actual es: $" + getSaldo());
        System.out.println("=================================");
        agregarHistorial("Consulta de saldo: $" + getSaldo());
    }
}