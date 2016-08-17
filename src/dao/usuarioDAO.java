/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.usuarioDTO;
import interfaces.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import util.conexion;

/**
 *
 * @author YULIDA
 */
public class usuarioDAO implements Operaciones<usuarioDTO>{
    private Connection cx;
    private ResultSet rs;
    private PreparedStatement ps;
    
    private final String sql_validar="SELECT *FROM usuario WHERE usuario=? AND password=?";
    private final String sql_create="INSERT INTO usuario(idusuario, usuario, password) VALUES(NULL ,? ,?)";
    private final String sql_update="UPDATE usuario SET  usuario=?, password=? WHERE  idusuario=?";
    private final String sql_delete="DELETE FROM usuario WHERE usuario.idusuario=?";
    private final String sql_read="SELECT *FROM usuario WHERE idusuario=?";
    private final String sql_readAll="SELECT *FROM usuario";
    
     public boolean validarUser(String user, String pass){
        boolean op = false;        
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_validar);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();            
            if(rs.next()){
                op = true;
            }        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "User: "+e);
        } finally{
           conexion.cerrar();
        }
        return op;
     }

    @Override
    public int create(usuarioDTO e) {
         int op = 0;        
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_create);
            ps.setString(1, e.getUsuario());
            ps.setString(2, e.getPassword());
           op = ps.executeUpdate();                    
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "User: "+x);
        } finally{
           conexion.cerrar();
        }
        return op;        
    }

    @Override
    public int update(usuarioDTO e) {
          int op = 0;        
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_update);
            ps.setString(1, e.getUsuario());
            ps.setString(2, e.getPassword());
            ps.setInt(3, e.getIdusuario());
           op = ps.executeUpdate();                    
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "User: "+x);
        } finally{
           conexion.cerrar();
        }
        return op;   
    }
    @Override
    public int delete(Object key) {
          int op = 0;        
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_delete);
            ps.setObject(1, key);
           op = ps.executeUpdate();                    
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "User: "+x);
        } finally{
           conexion.cerrar();
        }
        return op; 
    }

    @Override
    public usuarioDTO read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<usuarioDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean search(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
