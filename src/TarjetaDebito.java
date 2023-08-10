public class TarjetaDebito {

    private String nombreTitular;
    private String numeroDeTarjeta;
    private String fechaDeVencimiento;

    private Cuenta cuentaAsociada;


    //regionGetterSetter
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }

    public void setCuentaAsociada(Cuenta cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }
    //endregion


    public TarjetaDebito(String nombreTitular, String numeroDeTarjeta, String fechaDeVencimiento, Cuenta cuentaAsociada) {
        this.nombreTitular = nombreTitular;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.cuentaAsociada = cuentaAsociada;
    }

    public void debitar(double monto){
        if (monto <



    }



}
