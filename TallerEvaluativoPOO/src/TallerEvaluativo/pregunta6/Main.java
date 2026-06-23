package TallerEvaluativo.pregunta6;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta =
                new CuentaBancaria(
                        "Valentina",
                        "123456789",
                        100000
                );

        System.out.println("=== INFORMACIÓN INICIAL ===");
        cuenta.mostrarInformacion();

        System.out.println("\n=== DEPÓSITO ===");
        cuenta.depositar(50000);

        System.out.println("\n=== RETIRO ===");
        cuenta.retirar(30000);

        System.out.println("\n=== INFORMACIÓN FINAL ===");
        cuenta.mostrarInformacion();
    }
}