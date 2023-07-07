package DTO;

public class Usuarios {
    private int idusuario;

    private String nombreyapellido;

    private String correo;

    private int telefono;
    public Usuarios(int idusuario, String nombreyapellido, String correo, int telefono) {
        this.idusuario = idusuario;
        this.nombreyapellido = nombreyapellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    public Usuarios() {
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
