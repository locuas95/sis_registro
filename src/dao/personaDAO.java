/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.personaDTO;
import interfaces.Operaciones;
import java.util.List;

/**
 *
 * @author YULIDA
 */
public class personaDAO implements Operaciones<personaDTO>{
    
    private final String sql_create="INSERT INTO  bd_registrop.persona(idpersona,nombre,apellido,direccion,telefono,dni)VALUES (NULL ,?,?,?,?,?);";
    private final String sql_update="";
    private final String sql_delete="";
    private final String sql_read="";
    private final String sql_readAll="";
    private final String sql_search="";
    

    @Override
    public int create(personaDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(personaDTO e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean search(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
