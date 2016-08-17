/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.personaDAO;
import dto.personaDTO;
import java.sql.Connection;
import util.conexion;


/**
 *
 * @author YULIDA
 */
public class test {
    private static personaDAO aO= new personaDAO();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Conex();
//        guardar();
        eliminar();
    }
    public static void Conex(){
         Connection cx = conexion.getConexion();
        if(cx!=null){
            System.out.println("si hay conexion");
        }else{
            System.out.println("no hay conexion");
        }
    }
    
     public static void guardar(){
         personaDTO dTO = new personaDTO("cesar","malaspina","alameda","952879046","70406698");
        int op = aO.create(dTO);
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
     public static void eliminar(){
        int x = 1;

        int op = aO.delete(x);
        if(op>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
}
