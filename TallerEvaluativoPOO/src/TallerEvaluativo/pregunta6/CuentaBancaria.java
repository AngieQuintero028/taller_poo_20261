package TallerEvaluativo.pregunta6;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // Métodos de negocio
    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("El valor a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double valor) {

        if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor que cero.");
        } else if (valor > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= valor;
            System.out.println("Retiro realizado correctamente.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo disponible: $" + saldo);
    }
}