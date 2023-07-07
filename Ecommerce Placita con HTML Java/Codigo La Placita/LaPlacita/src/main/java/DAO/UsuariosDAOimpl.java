package DAO;
import Controladores.ConexionBasedeDatos;
import DTO.Usuarios;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collection;

public class UsuariosDAOimpl implements UsuariosDAO {

    @Override
    public Collection<Usuarios> obtenerUsuarios() {
        Collection<Usuarios> usuarios = new ArrayList();

        Connection connection = ConexionBasedeDatos.getInstance().obtenerconexion();

        String query = "SELECT * FROM usuarios";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Usuarios usuario = usuariodelresultado(rs);
                usuarios.add(usuario);
            }

            return usuarios;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Usuarios usuariodelresultado(ResultSet rs)throws SQLException {
        int idusuario=rs.getInt(1);
        String nombreyapellido=rs.getString(2);
        String correo=rs.getString(3);
        int telefono=rs.getInt(4);
        Usuarios usuarioscreado = new Usuarios(idusuario,nombreyapellido,correo,telefono);
                return usuarioscreado;
    }

    @Override
    public Usuarios obtenerPorID(Integer id) {
        return null;
    }

    @Override
    public Usuarios crearUsuario(Usuarios usuario) {
        Connection connection = ConexionBasedeDatos.getInstance().obtenerconexion();
        String query = " INSERT INTO usuarios(nombreyapellido,correo,telefono) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,usuario.getNombreyapellido());
            stmt.setString(2, usuario.getCorreo());
            stmt.setInt(3, usuario.getTelefono());
            ResultSet rs = stmt.getGeneratedKeys();

            while(rs.next()){
                Integer claveprimaria = rs.getInt(1);
                usuario.setIdusuario(claveprimaria);
            }
            stmt.close();
            return usuario;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Usuarios updateUser(Usuarios usuario) {
        return null;
    }

    @Override
    public Usuarios borrarUsuario(Integer id) {
        return null;
    }
}
