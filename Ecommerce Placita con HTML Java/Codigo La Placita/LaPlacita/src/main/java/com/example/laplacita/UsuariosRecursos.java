package com.example.laplacita;
import DAO.UsuariosDAOimpl;
import DTO.Usuarios;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.util.Collection;

@Path("/usuarios")
public class UsuariosRecursos {
    @GET
    @Produces("application/json")
    public Response obtenerusuarios(){
        Collection<Usuarios>ColecciondeUsuarios = new UsuariosDAOimpl().obtenerUsuarios();
        return Response.ok().status(Response.Status.OK).entity(ColecciondeUsuarios).build();
    }
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response crearUsuario(Usuarios usuario){
        Usuarios usuarioNuevo = new UsuariosDAOimpl().crearUsuario(usuario);
        return Response.ok().status(Response.Status.CREATED).entity(usuario).build();
    }
}
