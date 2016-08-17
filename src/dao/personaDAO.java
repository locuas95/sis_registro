
package dao;

import dto.personaDTO;
import interfaces.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.conexion;

/**
 *
 * @author YULIDA
 */
public class personaDAO implements Operaciones<personaDTO>{
    
    private static Connection cx;
    private static ResultSet rs;
    private static PreparedStatement ps;
    
    private final String sql_create="INSERT INTO bd_registrop.persona(idpersona,nombre,apellido,direccion,telefono,dni)VALUES (NULL ,?,?,?,?,?);";
    private final String sql_update="UPDATE bd_registrop.persona SET nombre=?,apellido=?,direccion=?, telefono=?,dni=? WHERE persona.idpersona=?";
    private final String sql_delete="";
    private final String sql_read="";
    private final String sql_readAll="SELECT *FROM persona";
    private final String sql_search="";
    

    @Override
    public int create(personaDTO e) {
         int op = 0;        
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_create);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDireccion());    
            ps.setString(4, e.getTelefono());
            ps.setString(5, e.getDni());
           op = ps.executeUpdate();                    
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "createproducto"+x);
        } finally{
           conexion.cerrar();
        }
        return op;
    }

    @Override
    public int update(personaDTO e) {
        int op = 0;        
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_update);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDireccion());
            ps.setString(4, e.getTelefono());
            ps.setString(5, e.getDni());
            ps.setInt(6, e.getIdpersona());
           op = ps.executeUpdate();                    
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "updateproducto"+x);
        } finally{
           conexion.cerrar();
        }
        return op;
    }

    @Override
    public int delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public personaDTO read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<personaDTO> readAll() {
        List<personaDTO> lista = new ArrayList<>();
         try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_readAll);
            rs = ps.executeQuery();
            while(rs.next()){
                personaDTO dTO = new personaDTO();
                dTO.setIdpersona(rs.getInt("idpersona"));
                dTO.setNombre(rs.getString("nombre"));
                dTO.setApellido(rs.getString("apellido"));
                dTO.setDireccion(rs.getString("direccion"));
                dTO.setTelefono(rs.getString("telefono"));
                dTO.setDni(rs.getString("dni"));
                lista.add(dTO);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "User: "+e);
        }finally{
            conexion.cerrar();
        }
        return lista;
    }

    @Override
    public boolean search(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
