/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import util.conexion;

/**
 *
 * @author YULIDA
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conex();
    }
    public static void Conex(){
         Connection cx = conexion.getConexion();
        if(cx!=null){
            System.out.println("si hay conexion");
        }else{
            System.out.println("no hay conexion");
        }
    }
    
}
