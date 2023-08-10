public class Cuenta {

    private String numeroDeCuenta;
    private String tipoDeCuenta;

    private double saldo;
    private double disponible;
    private double limiteDeCompra;

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    public double getLimiteDeCompra() {
        return limiteDeCompra;
    }

    public void setLimiteDeCompra(double limiteDeCompra) {
        this.limiteDeCompra = limiteDeCompra;
    }

    public Cuenta(String numeroDeCuenta, String tipoDeCuenta, double saldo, double disponible, double limiteDeCompra) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
        this.disponible = disponible;
        this.limiteDeCompra = limiteDeCompra;
    }
}
