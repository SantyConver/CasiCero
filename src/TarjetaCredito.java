import java.time.LocalDate;

public class TarjetaCredito {
    private String nombreTitular;
    private String numeroDeCuenta;

    private LocalDate fechaDeVencimiento;

    private double montoLimite;
    private double intereses;
    private double cantidadMaximaDeCuotas;

    //regionGetterSetter

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public double getMontoLimite() {
        return montoLimite;
    }

    public void setMontoLimite(double montoLimite) {
        this.montoLimite = montoLimite;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getCantidadMaximaDeCuotas() {
        return cantidadMaximaDeCuotas;
    }

    public void setCantidadMaximaDeCuotas(double cantidadMaximaDeCuotas) {
        this.cantidadMaximaDeCuotas = cantidadMaximaDeCuotas;
    }

    //endregion


    public TarjetaCredito(String nombreTitular, String numeroDeCuenta, LocalDate fechaDeVencimiento, double montoLimite, double intereses, double cantidadMaximaDeCuotas) {
        this.nombreTitular = nombreTitular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.montoLimite = montoLimite;
        this.intereses = intereses;
        this.cantidadMaximaDeCuotas = cantidadMaximaDeCuotas;
    }

    public void comprar(double monto){

    }



}
