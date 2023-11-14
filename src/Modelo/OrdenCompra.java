
package Modelo;

public class OrdenCompra {
    private int idOrdenCompra;
    private String codigo;
    private int idMetodoPago;
    private String descripcionMetodo;
    private int idEmpleado;
    private String nombreEmpleado;

    public OrdenCompra() {
    }

    public OrdenCompra(int idOrdenCompra, String codigo, int idMetodoPago, String descripcionMetodo, int idEmpleado, String nombreEmpleado) {
        this.idOrdenCompra = idOrdenCompra;
        this.codigo = codigo;
        this.idMetodoPago = idMetodoPago;
        this.descripcionMetodo = descripcionMetodo;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getDescripcionMetodo() {
        return descripcionMetodo;
    }

    public void setDescripcionMetodo(String descripcionMetodo) {
        this.descripcionMetodo = descripcionMetodo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    
}
