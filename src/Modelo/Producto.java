
package Modelo;

public class Producto {
    private int idProducto;
    private String descripcion;
    private int stock;
    private float precio;
    private String fechaVencimiento;
    private int idCategoria;
    private String nombreCategoria;
    private int idAlmacen;
    private String nombreAlmacen;

    public Producto() {
    }

    public Producto(int idProducto, String descripcion, int stock, float precio, String fechaVencimiento, int idCategoria, String nombreCategoria, int idAlmacen, String nombreAlmacen) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.idAlmacen = idAlmacen;
        this.nombreAlmacen = nombreAlmacen;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }
    
    
}
