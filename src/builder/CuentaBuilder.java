package builder;

public class CuentaBuilder implements Builder{
    private int numeroCuenta;
    private String  nombreDueno;
    private double saldo;
    private String tipoDeCuenta;

    public CuentaBuilder conNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public CuentaBuilder conNombreDueno(String nombreDueno){
        this.nombreDueno = nombreDueno;
        return this;
    }

    public CuentaBuilder conSaldo(double saldo){
        this.saldo = saldo;
        return this;
    }

    public CuentaBuilder conTipoCuenta(String tipoCuenta){
        this.tipoDeCuenta = tipoDeCuenta;
        return this;
    }

    @Override
    public Cuenta crear() {
       // por lo general pone validaciones o reglas de negocio
        // para que el objecto quede bien construido
        if(saldo < 0.0){
            saldo = 0.0;
        }
        if(nombreDueno  == null || nombreDueno.isEmpty() ){
            nombreDueno = "Default";
        }

        if( tipoDeCuenta == null) {

        }
        return new Cuenta(numeroCuenta, nombreDueno, saldo, tipoDeCuenta);
    }
}
