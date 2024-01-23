package builder;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1231231, "Mateo", 200, "Ahorro");

        Cuenta cuentaMateo = new CuentaBuilder()
                .conNumeroCuenta(12314) // retornando CuentaBuilder.
                .conNombreDueno("Mateo") // retornara CuentaBuilder
                .crear();

        System.out.println(cuentaMateo.toString());
    }
}