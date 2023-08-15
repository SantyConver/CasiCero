import java.time.LocalDate;
public class Venta {
    private LocalDate fecha;
    private Articulo articulo;
    private Empleado empleado;


//regionGetterSetter
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    //endregion

    public Venta(){

    }
    public Venta(LocalDate fecha, Articulo articulo, Empleado empleado) {
        this.fecha = fecha;
        this.articulo = articulo;
        this.empleado = empleado;
    }
    public double calcularMonto(){




    }
}
