package DTO;

public class Productos {

private int idproductos;

private String nombreproducto;

private String precio;

private String descripcion;

    public Productos() {
    }

    public Productos(int idproductos, String nombreproducto, String precio, String descripcion) {
        this.idproductos = idproductos;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(int idproductos) {
        this.idproductos = idproductos;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
