package clases;

public class Retiro extends Padre {
    @Override
    public void Transacciones() {
        System.out.print("Cuánto deseas retirar: $");
        retiro = entrada.nextInt();
        if (retiro <= getSaldo()) {
            setSaldo(getSaldo() - retiro);
            System.out.println("-----------------------------------");
            System.out.println("Retiraste: $" + retiro);
            System.out.println("Tu saldo actual es: $" + getSaldo());
            System.out.println("-----------------------------------");
            agregarHistorial("Retiro de: $" + retiro);
        } else {
            System.out.println("---------------------");
            System.out.println("Saldo insuficiente.");
            System.out.println("---------------------");
        }
    }
}