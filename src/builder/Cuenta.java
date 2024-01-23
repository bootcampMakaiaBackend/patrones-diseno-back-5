package builder;

public class Cuenta {
    private int numeroCuenta;
    private String  nombreDueno;
    private double saldo;
    private String tipoDeCuenta;

    public Cuenta(int numeroCuenta, String nombreDueno, double saldo, String tipoDeCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreDueno = nombreDueno;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", saldo=" + saldo +
                ", tipoDeCuenta='" + tipoDeCuenta + '\'' +
                '}';
    }
}
