package clases;

public class Deposito extends Padre {
    @Override
    public void Transacciones() {
        System.out.print("Ingrese el monto a depositar: $");
        deposito = entrada.nextInt();
        setSaldo(getSaldo() + deposito);
        System.out.println("==================================");
        System.out.println("Su depósito fue de: $" + deposito);
        System.out.println("Su nuevo saldo es de: $" + getSaldo());
        System.out.println("==================================");
        agregarHistorial("Depósito de: $" + deposito);
    }
}

