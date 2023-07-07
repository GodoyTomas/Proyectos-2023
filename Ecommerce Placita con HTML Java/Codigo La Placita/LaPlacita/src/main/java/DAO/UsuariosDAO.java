package DAO;

import DTO.Usuarios;

import java.util.Collection;

public interface UsuariosDAO {
    public Collection<Usuarios> obtenerUsuarios();
    public Usuarios obtenerPorID (Integer id);
    public Usuarios crearUsuario(Usuarios usuario);
    public Usuarios updateUser(Usuarios usuario);
    public Usuarios borrarUsuario(Integer id);
}
