
package Modelo;

public class OrdenXProducto {
    private int idOrdenXProducto;
    private float precio;
    private int cantidad;
    private int idOrdenC;
    private int idProducto;

    public OrdenXProducto() {
    }

    public OrdenXProducto(int idOrdenXProducto, float precio, int cantidad, int idOrdenC, int idProducto) {
        this.idOrdenXProducto = idOrdenXProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idOrdenC = idOrdenC;
        this.idProducto = idProducto;
    }

    public int getIdOrdenXProducto() {
        return idOrdenXProducto;
    }

    public void setIdOrdenXProducto(int idOrdenXProducto) {
        this.idOrdenXProducto = idOrdenXProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdOrdenC() {
        return idOrdenC;
    }

    public void setIdOrdenC(int idOrdenC) {
        this.idOrdenC = idOrdenC;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
