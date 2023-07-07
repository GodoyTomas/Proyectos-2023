package DTO;

public class UsuariosProductos {
    private int idusuario;

    private int idproductos;

    public UsuariosProductos() {
    }

    public UsuariosProductos(int idusuario, int idproductos) {
        this.idusuario = idusuario;
        this.idproductos = idproductos;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdproductos() {
        return idproductos;
    }

    public void setIdproductos(int idproductos) {
        this.idproductos = idproductos;
    }
}
