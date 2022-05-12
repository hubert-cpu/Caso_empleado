/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.ws001.test;

import pe.edu.upeu.ws001.config.Conexion;

/**
 *
 * @author admin
 */
public class Test {

    public static void main(String[] args) {
        if (Conexion.getConex() != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("No conectado");
        }

    }
}
